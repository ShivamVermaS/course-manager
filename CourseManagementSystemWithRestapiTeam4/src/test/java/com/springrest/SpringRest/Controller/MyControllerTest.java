package com.springrest.SpringRest.Controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springrest.SpringRest.Repository.CourseRepo;
import com.springrest.SpringRest.Repository.UserRepo;
import com.springrest.SpringRest.entities.Admin;
import com.springrest.SpringRest.entities.Apply;
import com.springrest.SpringRest.entities.Courses;
import com.springrest.SpringRest.entities.NewUser;
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

@ContextConfiguration(classes = {MyController.class})
@ExtendWith(SpringExtension.class)
class MyControllerTest {
    @MockBean
    private CourseRepo courseRepo;

    @MockBean
    private CourseService courseService;

    @Autowired
    private MyController myController;

    @MockBean
    private UserRepo userRepo;

    /**
     * Method under test: {@link MyController#deleteUsers(long)}
     */
    @Test
    void testDeleteUsers3() throws Exception {
        doNothing().when(userRepo).deleteById((Long) any());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/user/{uid}", 1L);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("User deleted"));
    }

    /**
     * Method under test: {@link MyController#deleteUsers(long)}
     */
    @Test
    void testDeleteUsers4() throws Exception {
        doNothing().when(userRepo).deleteById((Long) any());
        MockHttpServletRequestBuilder deleteResult = MockMvcRequestBuilders.delete("/user/{uid}", 1L);
        deleteResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(deleteResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("User deleted"));
    }

    /**
     * Method under test: {@link MyController#deleteUsers(long)}
     */
    @Test
    void testDeleteUsers5() throws Exception {
        doNothing().when(userRepo).deleteById((Long) any());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/user/{uid}", 1L);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("User deleted"));
    }

    /**
     * Method under test: {@link MyController#deleteUsers(long)}
     */
    @Test
    void testDeleteUsers6() throws Exception {
        doNothing().when(userRepo).deleteById((Long) any());
        MockHttpServletRequestBuilder deleteResult = MockMvcRequestBuilders.delete("/user/{uid}", 1L);
        deleteResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(deleteResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("User deleted"));
    }

    /**
     * Method under test: {@link MyController#getAllAdmin()}
     */
    @Test
    void testGetAllAdmin3() throws Exception {
        when(courseService.getAllAdmins()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/admin");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getAllAdmin()}
     */
    @Test
    void testGetAllAdmin4() throws Exception {
        when(courseService.getAllAdmins()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/admin");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getAllAdmin()}
     */
    @Test
    void testGetAllAdmin5() throws Exception {
        when(courseService.getAllAdmins()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/admin");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getAllAdmin()}
     */
    @Test
    void testGetAllAdmin6() throws Exception {
        when(courseService.getAllAdmins()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/admin");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getCourse(Long)}
     */
    @Test
    void testGetCourse2() throws Exception {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        Optional<Courses> ofResult = Optional.of(courses);
        when(courseRepo.findById((Long) any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/courses/{courseId}", 123L);
        MockMvcBuilders.standaloneSetup(myController)
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
     * Method under test: {@link MyController#getCourse(Long)}
     */
    @Test
    void testGetCourse3() throws Exception {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        Optional<Courses> ofResult = Optional.of(courses);
        when(courseRepo.findById((Long) any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/courses/{courseId}", 123L);
        MockMvcBuilders.standaloneSetup(myController)
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
     * Method under test: {@link MyController#getCourses()}
     */
    @Test
    void testGetCourses() throws Exception {
        when(courseService.getCourses()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/courses");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getCourses()}
     */
    @Test
    void testGetCourses2() throws Exception {
        when(courseService.getCourses()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/courses");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getCourses()}
     */
    @Test
    void testGetCourses3() throws Exception {
        when(courseService.getCourses()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/courses");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getCourses()}
     */
    @Test
    void testGetCourses4() throws Exception {
        when(courseService.getCourses()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/courses");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getCourses()}
     */
    @Test
    void testGetCourses5() throws Exception {
        when(courseService.getCourses()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/courses");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getCourses()}
     */
    @Test
    void testGetCourses6() throws Exception {
        when(courseService.getCourses()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/courses");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#addCourse(Courses)}
     */
    @Test
    void testAddCourse() throws Exception {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseService.addCourse((Courses) any())).thenReturn(courses);

        Courses courses1 = new Courses();
        courses1.setCategory("Category");
        courses1.setDiscription("Discription");
        courses1.setDuration("Duration");
        courses1.setFee(1L);
        courses1.setId(123L);
        courses1.setImage("Image");
        courses1.setTitle("Dr");
        String content = (new ObjectMapper()).writeValueAsString(courses1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/courses")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
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
     * Method under test: {@link MyController#addCourse(Courses)}
     */
    @Test
    void testAddCourse2() throws Exception {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseService.addCourse((Courses) any())).thenReturn(courses);

        Courses courses1 = new Courses();
        courses1.setCategory("Category");
        courses1.setDiscription("Discription");
        courses1.setDuration("Duration");
        courses1.setFee(1L);
        courses1.setId(123L);
        courses1.setImage("Image");
        courses1.setTitle("Dr");
        String content = (new ObjectMapper()).writeValueAsString(courses1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/courses")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
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
     * Method under test: {@link MyController#addCourse(Courses)}
     */
    @Test
    void testAddCourse3() throws Exception {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseService.addCourse((Courses) any())).thenReturn(courses);

        Courses courses1 = new Courses();
        courses1.setCategory("Category");
        courses1.setDiscription("Discription");
        courses1.setDuration("Duration");
        courses1.setFee(1L);
        courses1.setId(123L);
        courses1.setImage("Image");
        courses1.setTitle("Dr");
        String content = (new ObjectMapper()).writeValueAsString(courses1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/courses")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
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
     * Method under test: {@link MyController#getusers()}
     */
    @Test
    void testGetusers3() throws Exception {
        when(userRepo.findAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/users");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getusers()}
     */
    @Test
    void testGetusers4() throws Exception {
        when(userRepo.findAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/users");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getusers()}
     */
    @Test
    void testGetusers5() throws Exception {
        when(userRepo.findAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/users");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getusers()}
     */
    @Test
    void testGetusers6() throws Exception {
        when(userRepo.findAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/users");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#saveAdmins(Admin)}
     */
    @Test
    void testSaveAdmins2() throws Exception {
        Admin admin = new Admin();
        admin.setEmail("jane.doe@example.org");
        admin.setName("Name");
        admin.setPassword("iloveyou");
        admin.setUsername("janedoe");
        when(courseService.saveAllAdmins((Admin) any())).thenReturn(admin);

        Admin admin1 = new Admin();
        admin1.setEmail("jane.doe@example.org");
        admin1.setName("Name");
        admin1.setPassword("iloveyou");
        admin1.setUsername("janedoe");
        String content = (new ObjectMapper()).writeValueAsString(admin1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/saveadmin")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"name\":\"Name\",\"username\":\"janedoe\",\"email\":\"jane.doe@example.org\",\"password\":\"iloveyou\"}"));
    }

    /**
     * Method under test: {@link MyController#saveAdmins(Admin)}
     */
    @Test
    void testSaveAdmins3() throws Exception {
        Admin admin = new Admin();
        admin.setEmail("jane.doe@example.org");
        admin.setName("Name");
        admin.setPassword("iloveyou");
        admin.setUsername("janedoe");
        when(courseService.saveAllAdmins((Admin) any())).thenReturn(admin);

        Admin admin1 = new Admin();
        admin1.setEmail("jane.doe@example.org");
        admin1.setName("Name");
        admin1.setPassword("iloveyou");
        admin1.setUsername("janedoe");
        String content = (new ObjectMapper()).writeValueAsString(admin1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/saveadmin")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"name\":\"Name\",\"username\":\"janedoe\",\"email\":\"jane.doe@example.org\",\"password\":\"iloveyou\"}"));
    }

    /**
     * Method under test: {@link MyController#saveusers(NewUser)}
     */
    @Test
    void testSaveusers2() throws Exception {
        NewUser newUser = new NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setFirstName("Jane");
        newUser.setJendra("Gender");
        newUser.setLastName("Doe");
        newUser.setMobile_No("Mobile No");
        newUser.setPassword("iloveyou");
        newUser.setUid(1L);
        when(userRepo.save((NewUser) any())).thenReturn(newUser);

        NewUser newUser1 = new NewUser();
        newUser1.setEmail("jane.doe@example.org");
        newUser1.setFirstName("Jane");
        newUser1.setJendra("Gender");
        newUser1.setLastName("Doe");
        newUser1.setMobile_No("Mobile No");
        newUser1.setPassword("iloveyou");
        newUser1.setUid(1L);
        String content = (new ObjectMapper()).writeValueAsString(newUser1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/saveuser")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"uid\":1,\"password\":\"iloveyou\",\"email\":\"jane.doe@example.org\",\"lastName\":\"Doe\",\"mobile_No\":\"Mobile"
                                        + " No\",\"gender\":\"Gender\",\"firstName\":\"Jane\"}"));
    }

    /**
     * Method under test: {@link MyController#saveusers(NewUser)}
     */
    @Test
    void testSaveusers3() throws Exception {
        NewUser newUser = new NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setFirstName("Jane");
        newUser.setJendra("Gender");
        newUser.setLastName("Doe");
        newUser.setMobile_No("Mobile No");
        newUser.setPassword("iloveyou");
        newUser.setUid(1L);
        when(userRepo.save((NewUser) any())).thenReturn(newUser);

        NewUser newUser1 = new NewUser();
        newUser1.setEmail("jane.doe@example.org");
        newUser1.setFirstName("Jane");
        newUser1.setJendra("Gender");
        newUser1.setLastName("Doe");
        newUser1.setMobile_No("Mobile No");
        newUser1.setPassword("iloveyou");
        newUser1.setUid(1L);
        String content = (new ObjectMapper()).writeValueAsString(newUser1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/saveuser")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"uid\":1,\"password\":\"iloveyou\",\"lastName\":\"Doe\",\"email\":\"jane.doe@example.org\",\"firstName\":\"Jane\","
                                        + "\"mobile_No\":\"Mobile No\",\"gender\":\"Gender\"}"));
    }

    /**
     * Method under test: {@link MyController#updateCourse(Courses)}
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
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/courses")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
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
     * Method under test: {@link MyController#updateCourse(Courses)}
     */
    @Test
    void testUpdateCourse2() throws Exception {
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
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/courses")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
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
     * Method under test: {@link MyController#updateCourse(Courses)}
     */
    @Test
    void testUpdateCourse3() throws Exception {
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
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/courses")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
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
     * Method under test: {@link MyController#deleteCourse(String)}
     */
    @Test
    void testDeleteCourse() throws Exception {
        doNothing().when(courseService).deleteCourse(anyLong());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/courses/{courseId}", "42");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    /**
     * Method under test: {@link MyController#deleteCourse(String)}
     */
    @Test
    void testDeleteCourse2() throws Exception {
        doNothing().when(courseService).deleteCourse(anyLong());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/courses/{courseId}", "Uri Vars",
                "Uri Vars");
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(myController).build().perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(500));
    }

    /**
     * Method under test: {@link MyController#deleteCourse(String)}
     */
    @Test
    void testDeleteCourse3() throws Exception {
        doNothing().when(courseService).deleteCourse(anyLong());
        MockHttpServletRequestBuilder deleteResult = MockMvcRequestBuilders.delete("/courses/{courseId}", "42");
        deleteResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(deleteResult)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    /**
     * Method under test: {@link MyController#deleteCourse(String)}
     */
    @Test
    void testDeleteCourse4() throws Exception {
        doNothing().when(courseService).deleteCourse(anyLong());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/courses/{courseId}", "42");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    /**
     * Method under test: {@link MyController#deleteCourse(String)}
     */
    @Test
    void testDeleteCourse5() throws Exception {
        doNothing().when(courseService).deleteCourse(anyLong());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/courses/{courseId}", "Uri Vars",
                "Uri Vars");
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(myController).build().perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(500));
    }

    /**
     * Method under test: {@link MyController#deleteCourse(String)}
     */
    @Test
    void testDeleteCourse6() throws Exception {
        doNothing().when(courseService).deleteCourse(anyLong());
        MockHttpServletRequestBuilder deleteResult = MockMvcRequestBuilders.delete("/courses/{courseId}", "42");
        deleteResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(deleteResult)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    /**
     * Method under test: {@link MyController#deleteCourse(String)}
     */
    @Test
    void testDeleteCourse7() throws Exception {
        doNothing().when(courseService).deleteCourse(anyLong());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/courses/{courseId}", "42");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    /**
     * Method under test: {@link MyController#deleteCourse(String)}
     */
    @Test
    void testDeleteCourse8() throws Exception {
        doNothing().when(courseService).deleteCourse(anyLong());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/courses/{courseId}", "Uri Vars",
                "Uri Vars");
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(myController).build().perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(500));
    }

    /**
     * Method under test: {@link MyController#deleteCourse(String)}
     */
    @Test
    void testDeleteCourse9() throws Exception {
        doNothing().when(courseService).deleteCourse(anyLong());
        MockHttpServletRequestBuilder deleteResult = MockMvcRequestBuilders.delete("/courses/{courseId}", "42");
        deleteResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(deleteResult)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    /**
     * Method under test: {@link MyController#saveApplies(Apply)}
     */
    @Test
    void testSaveApplies() throws Exception {
        doNothing().when(courseService).saveApplies((Apply) any());

        Apply apply = new Apply();
        apply.setCourseId("42");
        apply.setCourseName("Course Name");
        apply.setDuration("Duration");
        apply.setFees("Fees");
        apply.setFirstName("Jane");
        apply.setLastName("Doe");
        String content = (new ObjectMapper()).writeValueAsString(apply);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/saveapply")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Admin Add Successfully"));
    }

    /**
     * Method under test: {@link MyController#saveApplies(Apply)}
     */
    @Test
    void testSaveApplies2() throws Exception {
        doNothing().when(courseService).saveApplies((Apply) any());

        Apply apply = new Apply();
        apply.setCourseId("42");
        apply.setCourseName("Course Name");
        apply.setDuration("Duration");
        apply.setFees("Fees");
        apply.setFirstName("Jane");
        apply.setLastName("Doe");
        String content = (new ObjectMapper()).writeValueAsString(apply);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/saveapply")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Admin Add Successfully"));
    }

    /**
     * Method under test: {@link MyController#saveApplies(Apply)}
     */
    @Test
    void testSaveApplies3() throws Exception {
        doNothing().when(courseService).saveApplies((Apply) any());

        Apply apply = new Apply();
        apply.setCourseId("42");
        apply.setCourseName("Course Name");
        apply.setDuration("Duration");
        apply.setFees("Fees");
        apply.setFirstName("Jane");
        apply.setLastName("Doe");
        String content = (new ObjectMapper()).writeValueAsString(apply);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/saveapply")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Admin Add Successfully"));
    }

    /**
     * Method under test: {@link MyController#getAllApplies()}
     */
    @Test
    void testGetAllApplies() throws Exception {
        when(courseService.getAllApplies()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/apply");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getAllApplies()}
     */
    @Test
    void testGetAllApplies2() throws Exception {
        when(courseService.getAllApplies()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/apply");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getAllApplies()}
     */
    @Test
    void testGetAllApplies3() throws Exception {
        when(courseService.getAllApplies()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/apply");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getAllApplies()}
     */
    @Test
    void testGetAllApplies4() throws Exception {
        when(courseService.getAllApplies()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/apply");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getAllApplies()}
     */
    @Test
    void testGetAllApplies5() throws Exception {
        when(courseService.getAllApplies()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/apply");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getAllApplies()}
     */
    @Test
    void testGetAllApplies6() throws Exception {
        when(courseService.getAllApplies()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/apply");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#deleteUsers(long)}
     */
    @Test
    void testDeleteUsers() throws Exception {
        doNothing().when(userRepo).deleteById((Long) any());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/user/{uid}", 1L);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("User deleted"));
    }

    /**
     * Method under test: {@link MyController#deleteUsers(long)}
     */
    @Test
    void testDeleteUsers2() throws Exception {
        doNothing().when(userRepo).deleteById((Long) any());
        MockHttpServletRequestBuilder deleteResult = MockMvcRequestBuilders.delete("/user/{uid}", 1L);
        deleteResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(deleteResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("User deleted"));
    }

    /**
     * Method under test: {@link MyController#getAllAdmin()}
     */
    @Test
    void testGetAllAdmin() throws Exception {
        when(courseService.getAllAdmins()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/admin");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getAllAdmin()}
     */
    @Test
    void testGetAllAdmin2() throws Exception {
        when(courseService.getAllAdmins()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/admin");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getCourse(Long)}
     */
    @Test
    void testGetCourse() throws Exception {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        Optional<Courses> ofResult = Optional.of(courses);
        when(courseRepo.findById((Long) any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/courses/{courseId}", 123L);
        MockMvcBuilders.standaloneSetup(myController)
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
     * Method under test: {@link MyController#getusers()}
     */
    @Test
    void testGetusers() throws Exception {
        when(userRepo.findAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/users");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getusers()}
     */
    @Test
    void testGetusers2() throws Exception {
        when(userRepo.findAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/users");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#saveAdmins(Admin)}
     */
    @Test
    void testSaveAdmins() throws Exception {
        Admin admin = new Admin();
        admin.setEmail("jane.doe@example.org");
        admin.setName("Name");
        admin.setPassword("iloveyou");
        admin.setUsername("janedoe");
        when(courseService.saveAllAdmins((Admin) any())).thenReturn(admin);

        Admin admin1 = new Admin();
        admin1.setEmail("jane.doe@example.org");
        admin1.setName("Name");
        admin1.setPassword("iloveyou");
        admin1.setUsername("janedoe");
        String content = (new ObjectMapper()).writeValueAsString(admin1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/saveadmin")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"name\":\"Name\",\"username\":\"janedoe\",\"email\":\"jane.doe@example.org\",\"password\":\"iloveyou\"}"));
    }

    /**
     * Method under test: {@link MyController#saveusers(NewUser)}
     */
    @Test
    void testSaveusers() throws Exception {
        NewUser newUser = new NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setFirstName("Jane");
        newUser.setJendra("Gender");
        newUser.setLastName("Doe");
        newUser.setMobile_No("Mobile No");
        newUser.setPassword("iloveyou");
        newUser.setUid(1L);
        when(userRepo.save((NewUser) any())).thenReturn(newUser);

        NewUser newUser1 = new NewUser();
        newUser1.setEmail("jane.doe@example.org");
        newUser1.setFirstName("Jane");
        newUser1.setJendra("Gender");
        newUser1.setLastName("Doe");
        newUser1.setMobile_No("Mobile No");
        newUser1.setPassword("iloveyou");
        newUser1.setUid(1L);
        String content = (new ObjectMapper()).writeValueAsString(newUser1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/saveuser")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"uid\":1,\"password\":\"iloveyou\",\"mobile_No\":\"Mobile No\",\"lastName\":\"Doe\",\"firstName\":\"Jane\",\"email\":"
                                        + "\"jane.doe@example.org\",\"gender\":\"Gender\"}"));
    }

    /**
     * Method under test: {@link MyController#updateuser(NewUser)}
     */
    @Test
    void testUpdateuser() throws Exception {
        NewUser newUser = new NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setFirstName("Jane");
        newUser.setJendra("Gender");
        newUser.setLastName("Doe");
        newUser.setMobile_No("Mobile No");
        newUser.setPassword("iloveyou");
        newUser.setUid(1L);
        when(userRepo.save((NewUser) any())).thenReturn(newUser);

        NewUser newUser1 = new NewUser();
        newUser1.setEmail("jane.doe@example.org");
        newUser1.setFirstName("Jane");
        newUser1.setJendra("Gender");
        newUser1.setLastName("Doe");
        newUser1.setMobile_No("Mobile No");
        newUser1.setPassword("iloveyou");
        newUser1.setUid(1L);
        String content = (new ObjectMapper()).writeValueAsString(newUser1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/updateuser")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"uid\":1,\"password\":\"iloveyou\",\"mobile_No\":\"Mobile No\",\"lastName\":\"Doe\",\"firstName\":\"Jane\",\"email\":"
                                        + "\"jane.doe@example.org\",\"gender\":\"Gender\"}"));
    }

    /**
     * Method under test: {@link MyController#updateuser(NewUser)}
     */
    @Test
    void testUpdateuser2() throws Exception {
        NewUser newUser = new NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setFirstName("Jane");
        newUser.setJendra("Gender");
        newUser.setLastName("Doe");
        newUser.setMobile_No("Mobile No");
        newUser.setPassword("iloveyou");
        newUser.setUid(1L);
        when(userRepo.save((NewUser) any())).thenReturn(newUser);

        NewUser newUser1 = new NewUser();
        newUser1.setEmail("jane.doe@example.org");
        newUser1.setFirstName("Jane");
        newUser1.setJendra("Gender");
        newUser1.setLastName("Doe");
        newUser1.setMobile_No("Mobile No");
        newUser1.setPassword("iloveyou");
        newUser1.setUid(1L);
        String content = (new ObjectMapper()).writeValueAsString(newUser1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/updateuser")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"uid\":1,\"password\":\"iloveyou\",\"email\":\"jane.doe@example.org\",\"lastName\":\"Doe\",\"mobile_No\":\"Mobile"
                                        + " No\",\"gender\":\"Gender\",\"firstName\":\"Jane\"}"));
    }

    /**
     * Method under test: {@link MyController#updateuser(NewUser)}
     */
    @Test
    void testUpdateuser3() throws Exception {
        NewUser newUser = new NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setFirstName("Jane");
        newUser.setJendra("Gender");
        newUser.setLastName("Doe");
        newUser.setMobile_No("Mobile No");
        newUser.setPassword("iloveyou");
        newUser.setUid(1L);
        when(userRepo.save((NewUser) any())).thenReturn(newUser);

        NewUser newUser1 = new NewUser();
        newUser1.setEmail("jane.doe@example.org");
        newUser1.setFirstName("Jane");
        newUser1.setJendra("Gender");
        newUser1.setLastName("Doe");
        newUser1.setMobile_No("Mobile No");
        newUser1.setPassword("iloveyou");
        newUser1.setUid(1L);
        String content = (new ObjectMapper()).writeValueAsString(newUser1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/updateuser")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"uid\":1,\"password\":\"iloveyou\",\"lastName\":\"Doe\",\"email\":\"jane.doe@example.org\",\"firstName\":\"Jane\","
                                        + "\"mobile_No\":\"Mobile No\",\"gender\":\"Gender\"}"));
    }
}

