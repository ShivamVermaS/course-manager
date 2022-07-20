package com.springrest.SpringRest.controllers;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springrest.SpringRest.entities.Apply;
import com.springrest.SpringRest.services.ApplyService;
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

@ContextConfiguration(classes = {ApplyController.class})
@ExtendWith(SpringExtension.class)
class ApplyControllerTest {
    @Autowired
    private ApplyController applyController;

    @MockBean
    private ApplyService applyService;

  
    @Test
    void testGetAllAdmin() throws Exception {
        when(applyService.getAllAdmin()).thenReturn("All Admin");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/apply");
        MockMvcBuilders.standaloneSetup(applyController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("All Admin"));
    }


    @Test
    void testGetByEmail() throws Exception {
        Apply apply = new Apply();
        apply.setCourse_id(1);
        apply.setCourse_name("Course name");
        apply.setDuration("Duration");
        apply.setFees(1);
        apply.setFirst_name("Jane");
        apply.setLast_name("Doe");
        when(applyService.saveApplyDetail((Apply) any())).thenReturn(apply);

        Apply apply1 = new Apply();
        apply1.setCourse_id(1);
        apply1.setCourse_name("Course name");
        apply1.setDuration("Duration");
        apply1.setFees(1);
        apply1.setFirst_name("Jane");
        apply1.setLast_name("Doe");
        String content = (new ObjectMapper()).writeValueAsString(apply1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/saveapply")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(applyController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isAccepted())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"duration\":\"Duration\",\"first_name\":\"Jane\",\"course_name\":\"Course name\",\"fees\":1,\"last_name\":\"Doe\","
                                        + "\"course_id\":1}"));
    }
}

