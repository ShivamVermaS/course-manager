package com.springrest.SpringRest.controllers;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springrest.SpringRest.entities.NewUser;
import com.springrest.SpringRest.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {UserController.class})
@ExtendWith(SpringExtension.class)
class UserControllerTest {
    @Autowired
    private UserController userController;

    @MockBean
    private UserService userService;

    /**
     * Method under test: {@link UserController#getAllUser()}
     */
    @Test
    void testGetAllUser() throws Exception {
        when(userService.getAllUser()).thenReturn("All User");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/users");
        MockMvcBuilders.standaloneSetup(userController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("All User"));
    }

    /**
     * Method under test: {@link UserController#saveAllUser(NewUser)}
     */
    @Test
    void testSaveAllUser() throws Exception {
        NewUser newUser = new NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setFirst_name("Jane");
        newUser.setGender("Gender");
        newUser.setLast_name("Doe");
        newUser.setMobile_No("Mobile No");
        newUser.setPassword("iloveyou");
        newUser.setUid(1L);
        when(userService.saveAllUser((NewUser) any())).thenReturn(newUser);

        NewUser newUser1 = new NewUser();
        newUser1.setEmail("jane.doe@example.org");
        newUser1.setFirst_name("Jane");
        newUser1.setGender("Gender");
        newUser1.setLast_name("Doe");
        newUser1.setMobile_No("Mobile No");
        newUser1.setPassword("iloveyou");
        newUser1.setUid(1L);
        String content = (new ObjectMapper()).writeValueAsString(newUser1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/saveuser")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(userController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"uid\":1,\"email\":\"jane.doe@example.org\",\"password\":\"iloveyou\",\"last_name\":\"Doe\",\"mobile_No\":\"Mobile"
                                        + " No\",\"gender\":\"Gender\",\"first_name\":\"Jane\"}"));
    }

    /**
     * Method under test: {@link UserController#getByEmail(String)}
     */
    @Test
    void testGetByEmail() throws Exception {
        NewUser newUser = new NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setFirst_name("Jane");
        newUser.setGender("Gender");
        newUser.setLast_name("Doe");
        newUser.setMobile_No("Mobile No");
        newUser.setPassword("iloveyou");
        newUser.setUid(1L);
        when(userService.getByEmail((String) any())).thenReturn(newUser);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/userlogin").param("email", "foo");
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(userController).build().perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isAccepted())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"uid\":1,\"email\":\"jane.doe@example.org\",\"password\":\"iloveyou\",\"last_name\":\"Doe\",\"mobile_No\":\"Mobile"
                                        + " No\",\"gender\":\"Gender\",\"first_name\":\"Jane\"}"));
    }
}

