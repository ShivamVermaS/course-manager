package com.springrest.SpringRest.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.springrest.SpringRest.Repository.AdminRepo;
import com.springrest.SpringRest.Repository.ApplyRepo;
import com.springrest.SpringRest.Repository.UserRepo;
import com.springrest.SpringRest.dao.CourseDao;
import com.springrest.SpringRest.entities.Admin;
import com.springrest.SpringRest.entities.Apply;
import com.springrest.SpringRest.entities.Courses;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {CourseServiceImpl.class})
@ExtendWith(SpringExtension.class)
class CourseServiceImplTest {
    @MockBean
    private AdminRepo adminRepo;

    @MockBean
    private ApplyRepo applyRepo;

    @MockBean
    private CourseDao courseDao;

    @Autowired
    private CourseServiceImpl courseServiceImpl;

    @MockBean
    private UserRepo userRepo;

    /**
     * Method under test: {@link CourseServiceImpl#getCourses()}
     */
    @Test
    void testGetCourses() {
        ArrayList<Courses> coursesList = new ArrayList<>();
        when(courseDao.findAll()).thenReturn(coursesList);
        List<Courses> actualCourses = courseServiceImpl.getCourses();
        assertSame(coursesList, actualCourses);
        assertTrue(actualCourses.isEmpty());
        verify(courseDao).findAll();
    }

    /**
     * Method under test: {@link CourseServiceImpl#getCourses()}
     */
    @Test
    void testGetCourses2() {
        ArrayList<Courses> coursesList = new ArrayList<>();
        when(courseDao.findAll()).thenReturn(coursesList);
        List<Courses> actualCourses = courseServiceImpl.getCourses();
        assertSame(coursesList, actualCourses);
        assertTrue(actualCourses.isEmpty());
        verify(courseDao).findAll();
    }

    /**
     * Method under test: {@link CourseServiceImpl#getCourses()}
     */
    @Test
    void testGetCourses3() {
        // Arrange and Act
        // TODO: Populate arranged inputs
        List<Courses> actualCourses = this.courseServiceImpl.getCourses();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link CourseServiceImpl#getCourses()}
     */
    @Test
    void testGetCourses4() {
        ArrayList<Courses> coursesList = new ArrayList<>();
        when(courseDao.findAll()).thenReturn(coursesList);
        List<Courses> actualCourses = courseServiceImpl.getCourses();
        assertSame(coursesList, actualCourses);
        assertTrue(actualCourses.isEmpty());
        verify(courseDao).findAll();
    }

    /**
     * Method under test: {@link CourseServiceImpl#getCourses()}
     */
    @Test
    void testGetCourses5() {
        ArrayList<Courses> coursesList = new ArrayList<>();
        when(courseDao.findAll()).thenReturn(coursesList);
        List<Courses> actualCourses = courseServiceImpl.getCourses();
        assertSame(coursesList, actualCourses);
        assertTrue(actualCourses.isEmpty());
        verify(courseDao).findAll();
    }

    /**
     * Method under test: {@link CourseServiceImpl#getcourse(long)}
     */
    @Test
    void testGetcourse() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseDao.getById((Long) any())).thenReturn(courses);
        assertSame(courses, courseServiceImpl.getcourse(123L));
        verify(courseDao).getById((Long) any());
    }

    /**
     * Method under test: {@link CourseServiceImpl#getcourse(long)}
     */
    @Test
    void testGetcourse2() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseDao.getById((Long) any())).thenReturn(courses);
        assertSame(courses, courseServiceImpl.getcourse(123L));
        verify(courseDao).getById((Long) any());
    }

    /**
     * Method under test: {@link CourseServiceImpl#getcourse(long)}
     */
    @Test
    void testGetcourse3() {
        // Arrange
        // TODO: Populate arranged inputs
        long courseId = 0L;

        // Act
        Courses actualGetcourseResult = this.courseServiceImpl.getcourse(courseId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link CourseServiceImpl#getcourse(long)}
     */
    @Test
    void testGetcourse4() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseDao.getById((Long) any())).thenReturn(courses);
        assertSame(courses, courseServiceImpl.getcourse(123L));
        verify(courseDao).getById((Long) any());
    }

    /**
     * Method under test: {@link CourseServiceImpl#getcourse(long)}
     */
    @Test
    void testGetcourse5() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseDao.getById((Long) any())).thenReturn(courses);
        assertSame(courses, courseServiceImpl.getcourse(123L));
        verify(courseDao).getById((Long) any());
    }

    /**
     * Method under test: {@link CourseServiceImpl#addCourse(Courses)}
     */
    @Test
    void testAddCourse() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseDao.save((Courses) any())).thenReturn(courses);

        Courses courses1 = new Courses();
        courses1.setCategory("Category");
        courses1.setDiscription("Discription");
        courses1.setDuration("Duration");
        courses1.setFee(1L);
        courses1.setId(123L);
        courses1.setImage("Image");
        courses1.setTitle("Dr");
        assertSame(courses1, courseServiceImpl.addCourse(courses1));
        verify(courseDao).save((Courses) any());
    }

    /**
     * Method under test: {@link CourseServiceImpl#addCourse(Courses)}
     */
    @Test
    void testAddCourse2() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseDao.save((Courses) any())).thenReturn(courses);

        Courses courses1 = new Courses();
        courses1.setCategory("Category");
        courses1.setDiscription("Discription");
        courses1.setDuration("Duration");
        courses1.setFee(1L);
        courses1.setId(123L);
        courses1.setImage("Image");
        courses1.setTitle("Dr");
        assertSame(courses1, courseServiceImpl.addCourse(courses1));
        verify(courseDao).save((Courses) any());
    }

    /**
     * Method under test: {@link CourseServiceImpl#addCourse(Courses)}
     */
    @Test
    void testAddCourse3() {
        // Arrange
        // TODO: Populate arranged inputs
        Courses course = null;

        // Act
        Courses actualAddCourseResult = this.courseServiceImpl.addCourse(course);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link CourseServiceImpl#addCourse(Courses)}
     */
    @Test
    void testAddCourse4() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseDao.save((Courses) any())).thenReturn(courses);

        Courses courses1 = new Courses();
        courses1.setCategory("Category");
        courses1.setDiscription("Discription");
        courses1.setDuration("Duration");
        courses1.setFee(1L);
        courses1.setId(123L);
        courses1.setImage("Image");
        courses1.setTitle("Dr");
        assertSame(courses1, courseServiceImpl.addCourse(courses1));
        verify(courseDao).save((Courses) any());
    }

    /**
     * Method under test: {@link CourseServiceImpl#addCourse(Courses)}
     */
    @Test
    void testAddCourse5() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseDao.save((Courses) any())).thenReturn(courses);

        Courses courses1 = new Courses();
        courses1.setCategory("Category");
        courses1.setDiscription("Discription");
        courses1.setDuration("Duration");
        courses1.setFee(1L);
        courses1.setId(123L);
        courses1.setImage("Image");
        courses1.setTitle("Dr");
        assertSame(courses1, courseServiceImpl.addCourse(courses1));
        verify(courseDao).save((Courses) any());
    }

    /**
     * Method under test: {@link CourseServiceImpl#updateCourse(Courses)}
     */
    @Test
    void testUpdateCourse() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseDao.save((Courses) any())).thenReturn(courses);

        Courses courses1 = new Courses();
        courses1.setCategory("Category");
        courses1.setDiscription("Discription");
        courses1.setDuration("Duration");
        courses1.setFee(1L);
        courses1.setId(123L);
        courses1.setImage("Image");
        courses1.setTitle("Dr");
        assertSame(courses1, courseServiceImpl.updateCourse(courses1));
        verify(courseDao).save((Courses) any());
    }

    /**
     * Method under test: {@link CourseServiceImpl#updateCourse(Courses)}
     */
    @Test
    void testUpdateCourse2() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseDao.save((Courses) any())).thenReturn(courses);

        Courses courses1 = new Courses();
        courses1.setCategory("Category");
        courses1.setDiscription("Discription");
        courses1.setDuration("Duration");
        courses1.setFee(1L);
        courses1.setId(123L);
        courses1.setImage("Image");
        courses1.setTitle("Dr");
        assertSame(courses1, courseServiceImpl.updateCourse(courses1));
        verify(courseDao).save((Courses) any());
    }

    /**
     * Method under test: {@link CourseServiceImpl#updateCourse(Courses)}
     */
    @Test
    void testUpdateCourse3() {
        // Arrange
        // TODO: Populate arranged inputs
        Courses course = null;

        // Act
        Courses actualUpdateCourseResult = this.courseServiceImpl.updateCourse(course);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link CourseServiceImpl#updateCourse(Courses)}
     */
    @Test
    void testUpdateCourse4() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseDao.save((Courses) any())).thenReturn(courses);

        Courses courses1 = new Courses();
        courses1.setCategory("Category");
        courses1.setDiscription("Discription");
        courses1.setDuration("Duration");
        courses1.setFee(1L);
        courses1.setId(123L);
        courses1.setImage("Image");
        courses1.setTitle("Dr");
        assertSame(courses1, courseServiceImpl.updateCourse(courses1));
        verify(courseDao).save((Courses) any());
    }

    /**
     * Method under test: {@link CourseServiceImpl#updateCourse(Courses)}
     */
    @Test
    void testUpdateCourse5() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseDao.save((Courses) any())).thenReturn(courses);

        Courses courses1 = new Courses();
        courses1.setCategory("Category");
        courses1.setDiscription("Discription");
        courses1.setDuration("Duration");
        courses1.setFee(1L);
        courses1.setId(123L);
        courses1.setImage("Image");
        courses1.setTitle("Dr");
        assertSame(courses1, courseServiceImpl.updateCourse(courses1));
        verify(courseDao).save((Courses) any());
    }

    /**
     * Method under test: {@link CourseServiceImpl#deleteCourse(long)}
     */
    @Test
    void testDeleteCourse() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseDao.getOne((Long) any())).thenReturn(courses);
        doNothing().when(courseDao).delete((Courses) any());
        courseServiceImpl.deleteCourse(1L);
        verify(courseDao).getOne((Long) any());
        verify(courseDao).delete((Courses) any());
        assertTrue(courseServiceImpl.getAllAdmins().isEmpty());
        assertTrue(courseServiceImpl.getCourses().isEmpty());
        assertTrue(courseServiceImpl.getAllApplies().isEmpty());
    }

    /**
     * Method under test: {@link CourseServiceImpl#deleteCourse(long)}
     */
    @Test
    void testDeleteCourse2() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseDao.getOne((Long) any())).thenReturn(courses);
        doNothing().when(courseDao).delete((Courses) any());
        courseServiceImpl.deleteCourse(1L);
        verify(courseDao).getOne((Long) any());
        verify(courseDao).delete((Courses) any());
        assertTrue(courseServiceImpl.getAllAdmins().isEmpty());
        assertTrue(courseServiceImpl.getCourses().isEmpty());
        assertTrue(courseServiceImpl.getAllApplies().isEmpty());
    }

    /**
     * Method under test: {@link CourseServiceImpl#deleteCourse(long)}
     */
    @Test
    void testDeleteCourse3() {
        // Arrange
        // TODO: Populate arranged inputs
        long parseLong = 0L;

        // Act
        this.courseServiceImpl.deleteCourse(parseLong);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link CourseServiceImpl#deleteCourse(long)}
     */
    @Test
    void testDeleteCourse4() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseDao.getOne((Long) any())).thenReturn(courses);
        doNothing().when(courseDao).delete((Courses) any());
        courseServiceImpl.deleteCourse(1L);
        verify(courseDao).getOne((Long) any());
        verify(courseDao).delete((Courses) any());
        assertTrue(courseServiceImpl.getAllAdmins().isEmpty());
        assertTrue(courseServiceImpl.getCourses().isEmpty());
        assertTrue(courseServiceImpl.getAllApplies().isEmpty());
    }

    /**
     * Method under test: {@link CourseServiceImpl#deleteCourse(long)}
     */
    @Test
    void testDeleteCourse5() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseDao.getOne((Long) any())).thenReturn(courses);
        doNothing().when(courseDao).delete((Courses) any());
        courseServiceImpl.deleteCourse(1L);
        verify(courseDao).getOne((Long) any());
        verify(courseDao).delete((Courses) any());
        assertTrue(courseServiceImpl.getAllAdmins().isEmpty());
        assertTrue(courseServiceImpl.getCourses().isEmpty());
        assertTrue(courseServiceImpl.getAllApplies().isEmpty());
    }

    /**
     * Method under test: {@link CourseServiceImpl#saveAllAdmins(Admin)}
     */
    @Test
    void testSaveAllAdmins() {
        Admin admin = new Admin();
        admin.setEmail("jane.doe@example.org");
        admin.setName("Name");
        admin.setPassword("iloveyou");
        admin.setUsername("janedoe");
        when(adminRepo.save((Admin) any())).thenReturn(admin);

        Admin admin1 = new Admin();
        admin1.setEmail("jane.doe@example.org");
        admin1.setName("Name");
        admin1.setPassword("iloveyou");
        admin1.setUsername("janedoe");
        assertSame(admin, courseServiceImpl.saveAllAdmins(admin1));
        verify(adminRepo).save((Admin) any());
    }

    /**
     * Method under test: {@link CourseServiceImpl#saveAllAdmins(Admin)}
     */
    @Test
    void testSaveAllAdmins2() {
        Admin admin = new Admin();
        admin.setEmail("jane.doe@example.org");
        admin.setName("Name");
        admin.setPassword("iloveyou");
        admin.setUsername("janedoe");
        when(adminRepo.save((Admin) any())).thenReturn(admin);

        Admin admin1 = new Admin();
        admin1.setEmail("jane.doe@example.org");
        admin1.setName("Name");
        admin1.setPassword("iloveyou");
        admin1.setUsername("janedoe");
        assertSame(admin, courseServiceImpl.saveAllAdmins(admin1));
        verify(adminRepo).save((Admin) any());
    }

    /**
     * Method under test: {@link CourseServiceImpl#saveAllAdmins(Admin)}
     */
    @Test
    void testSaveAllAdmins3() {
        // Arrange
        // TODO: Populate arranged inputs
        Admin admin = null;

        // Act
        Admin actualSaveAllAdminsResult = this.courseServiceImpl.saveAllAdmins(admin);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link CourseServiceImpl#saveAllAdmins(Admin)}
     */
    @Test
    void testSaveAllAdmins4() {
        Admin admin = new Admin();
        admin.setEmail("jane.doe@example.org");
        admin.setName("Name");
        admin.setPassword("iloveyou");
        admin.setUsername("janedoe");
        when(adminRepo.save((Admin) any())).thenReturn(admin);

        Admin admin1 = new Admin();
        admin1.setEmail("jane.doe@example.org");
        admin1.setName("Name");
        admin1.setPassword("iloveyou");
        admin1.setUsername("janedoe");
        assertSame(admin, courseServiceImpl.saveAllAdmins(admin1));
        verify(adminRepo).save((Admin) any());
    }

    /**
     * Method under test: {@link CourseServiceImpl#saveAllAdmins(Admin)}
     */
    @Test
    void testSaveAllAdmins5() {
        Admin admin = new Admin();
        admin.setEmail("jane.doe@example.org");
        admin.setName("Name");
        admin.setPassword("iloveyou");
        admin.setUsername("janedoe");
        when(adminRepo.save((Admin) any())).thenReturn(admin);

        Admin admin1 = new Admin();
        admin1.setEmail("jane.doe@example.org");
        admin1.setName("Name");
        admin1.setPassword("iloveyou");
        admin1.setUsername("janedoe");
        assertSame(admin, courseServiceImpl.saveAllAdmins(admin1));
        verify(adminRepo).save((Admin) any());
    }

    /**
     * Method under test: {@link CourseServiceImpl#getAllAdmins()}
     */
    @Test
    void testGetAllAdmins() {
        ArrayList<Admin> adminList = new ArrayList<>();
        when(adminRepo.findAll()).thenReturn(adminList);
        List<Admin> actualAllAdmins = courseServiceImpl.getAllAdmins();
        assertSame(adminList, actualAllAdmins);
        assertTrue(actualAllAdmins.isEmpty());
        verify(adminRepo).findAll();
    }

    /**
     * Method under test: {@link CourseServiceImpl#getAllAdmins()}
     */
    @Test
    void testGetAllAdmins2() {
        ArrayList<Admin> adminList = new ArrayList<>();
        when(adminRepo.findAll()).thenReturn(adminList);
        List<Admin> actualAllAdmins = courseServiceImpl.getAllAdmins();
        assertSame(adminList, actualAllAdmins);
        assertTrue(actualAllAdmins.isEmpty());
        verify(adminRepo).findAll();
    }

    /**
     * Method under test: {@link CourseServiceImpl#getAllAdmins()}
     */
    @Test
    void testGetAllAdmins3() {
        // Arrange and Act
        // TODO: Populate arranged inputs
        List<Admin> actualAllAdmins = this.courseServiceImpl.getAllAdmins();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link CourseServiceImpl#getAllAdmins()}
     */
    @Test
    void testGetAllAdmins4() {
        ArrayList<Admin> adminList = new ArrayList<>();
        when(adminRepo.findAll()).thenReturn(adminList);
        List<Admin> actualAllAdmins = courseServiceImpl.getAllAdmins();
        assertSame(adminList, actualAllAdmins);
        assertTrue(actualAllAdmins.isEmpty());
        verify(adminRepo).findAll();
    }

    /**
     * Method under test: {@link CourseServiceImpl#getAllAdmins()}
     */
    @Test
    void testGetAllAdmins5() {
        ArrayList<Admin> adminList = new ArrayList<>();
        when(adminRepo.findAll()).thenReturn(adminList);
        List<Admin> actualAllAdmins = courseServiceImpl.getAllAdmins();
        assertSame(adminList, actualAllAdmins);
        assertTrue(actualAllAdmins.isEmpty());
        verify(adminRepo).findAll();
    }

    /**
     * Method under test: {@link CourseServiceImpl#saveApplies(Apply)}
     */
    @Test
    void testSaveApplies() {
        Apply apply = new Apply();
        apply.setCourseId("42");
        apply.setCourseName("Course Name");
        apply.setDuration("Duration");
        apply.setFees("Fees");
        apply.setFirstName("Jane");
        apply.setLastName("Doe");
        when(applyRepo.save((Apply) any())).thenReturn(apply);

        Apply apply1 = new Apply();
        apply1.setCourseId("42");
        apply1.setCourseName("Course Name");
        apply1.setDuration("Duration");
        apply1.setFees("Fees");
        apply1.setFirstName("Jane");
        apply1.setLastName("Doe");
        courseServiceImpl.saveApplies(apply1);
        verify(applyRepo).save((Apply) any());
        assertEquals("42", apply1.getCourseId());
        assertEquals("Doe", apply1.getLastName());
        assertEquals("Jane", apply1.getFirstName());
        assertEquals("Fees", apply1.getFees());
        assertEquals("Duration", apply1.getDuration());
        assertEquals("Course Name", apply1.getCourseName());
        assertTrue(courseServiceImpl.getAllAdmins().isEmpty());
        assertTrue(courseServiceImpl.getCourses().isEmpty());
        assertTrue(courseServiceImpl.getAllApplies().isEmpty());
    }

    /**
     * Method under test: {@link CourseServiceImpl#saveApplies(Apply)}
     */
    @Test
    void testSaveApplies2() {
        Apply apply = new Apply();
        apply.setCourseId("42");
        apply.setCourseName("Course Name");
        apply.setDuration("Duration");
        apply.setFees("Fees");
        apply.setFirstName("Jane");
        apply.setLastName("Doe");
        when(applyRepo.save((Apply) any())).thenReturn(apply);

        Apply apply1 = new Apply();
        apply1.setCourseId("42");
        apply1.setCourseName("Course Name");
        apply1.setDuration("Duration");
        apply1.setFees("Fees");
        apply1.setFirstName("Jane");
        apply1.setLastName("Doe");
        courseServiceImpl.saveApplies(apply1);
        verify(applyRepo).save((Apply) any());
        assertEquals("42", apply1.getCourseId());
        assertEquals("Doe", apply1.getLastName());
        assertEquals("Jane", apply1.getFirstName());
        assertEquals("Fees", apply1.getFees());
        assertEquals("Duration", apply1.getDuration());
        assertEquals("Course Name", apply1.getCourseName());
        assertTrue(courseServiceImpl.getAllAdmins().isEmpty());
        assertTrue(courseServiceImpl.getCourses().isEmpty());
        assertTrue(courseServiceImpl.getAllApplies().isEmpty());
    }

    /**
     * Method under test: {@link CourseServiceImpl#saveApplies(Apply)}
     */
    @Test
    void testSaveApplies3() {
        // Arrange
        // TODO: Populate arranged inputs
        Apply apply = null;

        // Act
        this.courseServiceImpl.saveApplies(apply);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link CourseServiceImpl#saveApplies(Apply)}
     */
    @Test
    void testSaveApplies4() {
        Apply apply = new Apply();
        apply.setCourseId("42");
        apply.setCourseName("Course Name");
        apply.setDuration("Duration");
        apply.setFees("Fees");
        apply.setFirstName("Jane");
        apply.setLastName("Doe");
        when(applyRepo.save((Apply) any())).thenReturn(apply);

        Apply apply1 = new Apply();
        apply1.setCourseId("42");
        apply1.setCourseName("Course Name");
        apply1.setDuration("Duration");
        apply1.setFees("Fees");
        apply1.setFirstName("Jane");
        apply1.setLastName("Doe");
        courseServiceImpl.saveApplies(apply1);
        verify(applyRepo).save((Apply) any());
        assertEquals("42", apply1.getCourseId());
        assertEquals("Doe", apply1.getLastName());
        assertEquals("Jane", apply1.getFirstName());
        assertEquals("Fees", apply1.getFees());
        assertEquals("Duration", apply1.getDuration());
        assertEquals("Course Name", apply1.getCourseName());
        assertTrue(courseServiceImpl.getAllAdmins().isEmpty());
        assertTrue(courseServiceImpl.getCourses().isEmpty());
        assertTrue(courseServiceImpl.getAllApplies().isEmpty());
    }

    /**
     * Method under test: {@link CourseServiceImpl#saveApplies(Apply)}
     */
    @Test
    void testSaveApplies5() {
        Apply apply = new Apply();
        apply.setCourseId("42");
        apply.setCourseName("Course Name");
        apply.setDuration("Duration");
        apply.setFees("Fees");
        apply.setFirstName("Jane");
        apply.setLastName("Doe");
        when(applyRepo.save((Apply) any())).thenReturn(apply);

        Apply apply1 = new Apply();
        apply1.setCourseId("42");
        apply1.setCourseName("Course Name");
        apply1.setDuration("Duration");
        apply1.setFees("Fees");
        apply1.setFirstName("Jane");
        apply1.setLastName("Doe");
        courseServiceImpl.saveApplies(apply1);
        verify(applyRepo).save((Apply) any());
        assertEquals("42", apply1.getCourseId());
        assertEquals("Doe", apply1.getLastName());
        assertEquals("Jane", apply1.getFirstName());
        assertEquals("Fees", apply1.getFees());
        assertEquals("Duration", apply1.getDuration());
        assertEquals("Course Name", apply1.getCourseName());
        assertTrue(courseServiceImpl.getAllAdmins().isEmpty());
        assertTrue(courseServiceImpl.getCourses().isEmpty());
        assertTrue(courseServiceImpl.getAllApplies().isEmpty());
    }

    /**
     * Method under test: {@link CourseServiceImpl#getAllApplies()}
     */
    @Test
    void testGetAllApplies() {
        ArrayList<Apply> applyList = new ArrayList<>();
        when(applyRepo.findAll()).thenReturn(applyList);
        List<Apply> actualAllApplies = courseServiceImpl.getAllApplies();
        assertSame(applyList, actualAllApplies);
        assertTrue(actualAllApplies.isEmpty());
        verify(applyRepo).findAll();
    }

    /**
     * Method under test: {@link CourseServiceImpl#getAllApplies()}
     */
    @Test
    void testGetAllApplies2() {
        ArrayList<Apply> applyList = new ArrayList<>();
        when(applyRepo.findAll()).thenReturn(applyList);
        List<Apply> actualAllApplies = courseServiceImpl.getAllApplies();
        assertSame(applyList, actualAllApplies);
        assertTrue(actualAllApplies.isEmpty());
        verify(applyRepo).findAll();
    }

    /**
     * Method under test: {@link CourseServiceImpl#getAllApplies()}
     */
    @Test
    void testGetAllApplies3() {
        // Arrange and Act
        // TODO: Populate arranged inputs
        List<Apply> actualAllApplies = this.courseServiceImpl.getAllApplies();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link CourseServiceImpl#getAllApplies()}
     */
    @Test
    void testGetAllApplies4() {
        ArrayList<Apply> applyList = new ArrayList<>();
        when(applyRepo.findAll()).thenReturn(applyList);
        List<Apply> actualAllApplies = courseServiceImpl.getAllApplies();
        assertSame(applyList, actualAllApplies);
        assertTrue(actualAllApplies.isEmpty());
        verify(applyRepo).findAll();
    }

    /**
     * Method under test: {@link CourseServiceImpl#getAllApplies()}
     */
    @Test
    void testGetAllApplies5() {
        ArrayList<Apply> applyList = new ArrayList<>();
        when(applyRepo.findAll()).thenReturn(applyList);
        List<Apply> actualAllApplies = courseServiceImpl.getAllApplies();
        assertSame(applyList, actualAllApplies);
        assertTrue(actualAllApplies.isEmpty());
        verify(applyRepo).findAll();
    }
}

