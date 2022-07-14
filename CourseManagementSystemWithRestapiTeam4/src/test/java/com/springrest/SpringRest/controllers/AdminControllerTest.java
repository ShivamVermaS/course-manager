package com.springrest.SpringRest.controllers;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springrest.SpringRest.entities.Admin;
import com.springrest.SpringRest.services.AdminService;
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

@ContextConfiguration(classes = {AdminController.class})
@ExtendWith(SpringExtension.class)
class AdminControllerTest {
    @Autowired
    private AdminController adminController;

    @MockBean
    private AdminService adminService;

    /**
     * Method under test: {@link AdminController#getAllAdmin()}
     */
    @Test
    void testGetAllAdmin() throws Exception {
        when(adminService.getAllAdmin()).thenReturn("All Admin");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/admin");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("All Admin"));
    }

    /**
     * Method under test: {@link AdminController#saveAdmins(Admin)}
     */
    @Test
    void testSaveAdmins() throws Exception {
        Admin admin = new Admin();
        admin.setEmail("jane.doe@example.org");
        admin.setName("Name");
        admin.setPassword("iloveyou");
        admin.setUsername("janedoe");
        when(adminService.saveAdmins((Admin) any())).thenReturn(admin);

        Admin admin1 = new Admin();
        admin1.setEmail("jane.doe@example.org");
        admin1.setName("Name");
        admin1.setPassword("iloveyou");
        admin1.setUsername("janedoe");
        String content = (new ObjectMapper()).writeValueAsString(admin1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/saveadmin")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isAccepted())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"name\":\"Name\",\"username\":\"janedoe\",\"email\":\"jane.doe@example.org\",\"password\":\"iloveyou\"}"));
    }
}

