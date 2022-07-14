package com.springrest.SpringRest.services;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.springrest.SpringRest.Repository.UserRepo;
import com.springrest.SpringRest.entities.NewUser;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {UserService.class})
@ExtendWith(SpringExtension.class)
class UserServiceTest {
    @MockBean
    private UserRepo userRepo;

    @Autowired
    private UserService userService;

    /**
     * Method under test: {@link UserService#getAllUser()}
     */
    @Test
    void testGetAllUser() {
        ArrayList<NewUser> newUserList = new ArrayList<>();
        when(userRepo.findAll()).thenReturn(newUserList);
        Object actualAllUser = userService.getAllUser();
        assertSame(newUserList, actualAllUser);
        assertTrue(((Collection<Object>) actualAllUser).isEmpty());
        verify(userRepo).findAll();
    }

    /**
     * Method under test: {@link UserService#saveAllUser(NewUser)}
     */
    @Test
    void testSaveAllUser() {
        NewUser newUser = new NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setFirst_name("Jane");
        newUser.setGender("Gender");
        newUser.setLast_name("Doe");
        newUser.setMobile_No("Mobile No");
        newUser.setPassword("iloveyou");
        newUser.setUid(1L);
        when(userRepo.saveAndFlush((NewUser) any())).thenReturn(newUser);

        NewUser newUser1 = new NewUser();
        newUser1.setEmail("jane.doe@example.org");
        newUser1.setFirst_name("Jane");
        newUser1.setGender("Gender");
        newUser1.setLast_name("Doe");
        newUser1.setMobile_No("Mobile No");
        newUser1.setPassword("iloveyou");
        newUser1.setUid(1L);
        assertSame(newUser, userService.saveAllUser(newUser1));
        verify(userRepo).saveAndFlush((NewUser) any());
    }

    /**
     * Method under test: {@link UserService#getByEmail(String)}
     */
    @Test
    void testGetByEmail() {
        NewUser newUser = new NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setFirst_name("Jane");
        newUser.setGender("Gender");
        newUser.setLast_name("Doe");
        newUser.setMobile_No("Mobile No");
        newUser.setPassword("iloveyou");
        newUser.setUid(1L);
        when(userRepo.getByEmail((String) any())).thenReturn(newUser);
        assertSame(newUser, userService.getByEmail("jane.doe@example.org"));
        verify(userRepo).getByEmail((String) any());
    }
}

