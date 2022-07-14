package com.springrest.SpringRest.controllers;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springrest.SpringRest.entities.Courses;
import com.springrest.SpringRest.services.CourseService;

import java.util.ArrayList;
import java.util.Optional;

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

@ContextConfiguration(classes = {CourseController.class})
@ExtendWith(SpringExtension.class)
class CourseControllerTest {
    @Autowired
    private CourseController courseController;

    @MockBean
    private CourseService courseService;

    /**
     * Method under test: {@link CourseController#getAllCourses()}
     */
    @Test
    void testGetAllCourses() throws Exception {
        when(courseService.getAllCourses()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/course");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link CourseController#getAllCourses()}
     */
    @Test
    void testGetAllCourses2() throws Exception {
        when(courseService.getAllCourses()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/course");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link CourseController#saveAllCourse(Courses)}
     */
    @Test
    void testSaveAllCourse() throws Exception {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseService.saveAllCourse((Courses) any())).thenReturn(courses);

        Courses courses1 = new Courses();
        courses1.setCategory("Category");
        courses1.setDiscription("Discription");
        courses1.setDuration("Duration");
        courses1.setFee(1L);
        courses1.setId(123L);
        courses1.setImage("Image");
        courses1.setTitle("Dr");
        String content = (new ObjectMapper()).writeValueAsString(courses1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/course")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":123,\"title\":\"Dr\",\"duration\":\"Duration\",\"fee\":1,\"image\":\"Image\",\"discription\":\"Discription\","
                                        + "\"category\":\"Category\"}"));
    }

    /**
     * Method under test: {@link CourseController#updateCourse(Courses)}
     */
    @Test
    void testUpdateCourse() throws Exception {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseService.updateCourse((Courses) any())).thenReturn(courses);

        Courses courses1 = new Courses();
        courses1.setCategory("Category");
        courses1.setDiscription("Discription");
        courses1.setDuration("Duration");
        courses1.setFee(1L);
        courses1.setId(123L);
        courses1.setImage("Image");
        courses1.setTitle("Dr");
        String content = (new ObjectMapper()).writeValueAsString(courses1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/update/{id}", 123L)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":123,\"title\":\"Dr\",\"duration\":\"Duration\",\"fee\":1,\"image\":\"Image\",\"discription\":\"Discription\","
                                        + "\"category\":\"Category\"}"));
    }

    /**
     * Method under test: {@link CourseController#deleteCourseById(long)}
     */
    @Test
    void testDeleteCourseById() throws Exception {
        when(courseService.deleteCourseById(anyLong())).thenReturn("42");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/course/{id}", 123L);
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("42"));
    }

    /**
     * Method under test: {@link CourseController#deleteCourseById(long)}
     */
    @Test
    void testDeleteCourseById2() throws Exception {
        when(courseService.deleteCourseById(anyLong())).thenReturn("42");
        MockHttpServletRequestBuilder deleteResult = MockMvcRequestBuilders.delete("/course/{id}", 123L);
        deleteResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(deleteResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("42"));
    }

    /**
     * Method under test: {@link CourseController#getCourses(String)}
     */
    @Test
    void testGetCourses() throws Exception {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        Optional<Courses> ofResult = Optional.of(courses);
        when(courseService.getCourses((String) any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/course/{name}", "Name");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":123,\"title\":\"Dr\",\"duration\":\"Duration\",\"fee\":1,\"image\":\"Image\",\"discription\":\"Discription\","
                                        + "\"category\":\"Category\"}"));
    }

    /**
     * Method under test: {@link CourseController#getCoursesById(long)}
     */
    @Test
    void testGetCoursesById() throws Exception {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        Optional<Courses> ofResult = Optional.of(courses);
        when(courseService.getCourseById(anyLong())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/courses/{id}", 123L);
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":123,\"title\":\"Dr\",\"duration\":\"Duration\",\"fee\":1,\"image\":\"Image\",\"discription\":\"Discription\","
                                        + "\"category\":\"Category\"}"));
    }
}

