package com.springrest.SpringRest.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.springrest.SpringRest.Repository.CourseRepo;
import com.springrest.SpringRest.entities.Courses;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {CourseService.class})
@ExtendWith(SpringExtension.class)
class CourseServiceTest {
    @MockBean
    private CourseRepo courseRepo;

    @Autowired
    private CourseService courseService;

    /**
     * Method under test: {@link CourseService#getAllCourses()}
     */
    @Test
    void testGetAllCourses() {
        ArrayList<Courses> coursesList = new ArrayList<>();
        when(courseRepo.findAll()).thenReturn(coursesList);
        List<Courses> actualAllCourses = courseService.getAllCourses();
        assertSame(coursesList, actualAllCourses);
        assertTrue(actualAllCourses.isEmpty());
        verify(courseRepo).findAll();
    }

    /**
     * Method under test: {@link CourseService#getCourseById(long)}
     */
    @Test
    void testGetCourseById() {
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
        Optional<Courses> actualCourseById = courseService.getCourseById(123L);
        assertSame(ofResult, actualCourseById);
        assertTrue(actualCourseById.isPresent());
        verify(courseRepo).findById((Long) any());
    }

    /**
     * Method under test: {@link CourseService#saveAllCourse(Courses)}
     */
    @Test
    void testSaveAllCourse() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseRepo.save((Courses) any())).thenReturn(courses);

        Courses courses1 = new Courses();
        courses1.setCategory("Category");
        courses1.setDiscription("Discription");
        courses1.setDuration("Duration");
        courses1.setFee(1L);
        courses1.setId(123L);
        courses1.setImage("Image");
        courses1.setTitle("Dr");
        assertSame(courses, courseService.saveAllCourse(courses1));
        verify(courseRepo).save((Courses) any());
    }

    /**
     * Method under test: {@link CourseService#updateCourse(Courses)}
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

        Courses courses1 = new Courses();
        courses1.setCategory("Category");
        courses1.setDiscription("Discription");
        courses1.setDuration("Duration");
        courses1.setFee(1L);
        courses1.setId(123L);
        courses1.setImage("Image");
        courses1.setTitle("Dr");
        Optional<Courses> ofResult = Optional.of(courses1);
        when(courseRepo.save((Courses) any())).thenReturn(courses);
        when(courseRepo.findById((Long) any())).thenReturn(ofResult);

        Courses courses2 = new Courses();
        courses2.setCategory("Category");
        courses2.setDiscription("Discription");
        courses2.setDuration("Duration");
        courses2.setFee(1L);
        courses2.setId(123L);
        courses2.setImage("Image");
        courses2.setTitle("Dr");
        assertSame(courses, courseService.updateCourse(courses2));
        verify(courseRepo).save((Courses) any());
        verify(courseRepo).findById((Long) any());
    }

    /**
     * Method under test: {@link CourseService#deleteCourseById(long)}
     */
    @Test
    void testDeleteCourseById() {
        when(courseRepo.deleteById(anyLong())).thenReturn("42");
        assertEquals("Course deleted", courseService.deleteCourseById(123L));
        verify(courseRepo).deleteById(anyLong());
    }

    /**
     * Method under test: {@link CourseService#getCourses(String)}
     */
    @Test
    void testGetCourses() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseRepo.findByTitle((String) any())).thenReturn(courses);
        assertSame(courses, courseService.getCourses("Name"));
        verify(courseRepo).findByTitle((String) any());
    }

    /**
     * Method under test: {@link CourseService#saveCoursesDetail(Courses)}
     */
    @Test
    void testSaveCoursesDetail() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        assertNull(courseService.saveCoursesDetail(courses));
    }

    /**
     * Method under test: {@link CourseService#saveCoursesDetail(Courses)}
     */
    @Test
    void testSaveCoursesDetail2() {
        Courses courses = mock(Courses.class);
        doNothing().when(courses).setCategory((String) any());
        doNothing().when(courses).setDiscription((String) any());
        doNothing().when(courses).setDuration((String) any());
        doNothing().when(courses).setFee(anyLong());
        doNothing().when(courses).setId(anyLong());
        doNothing().when(courses).setImage((String) any());
        doNothing().when(courses).setTitle((String) any());
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        assertNull(courseService.saveCoursesDetail(courses));
        verify(courses).setCategory((String) any());
        verify(courses).setDiscription((String) any());
        verify(courses).setDuration((String) any());
        verify(courses).setFee(anyLong());
        verify(courses).setId(anyLong());
        verify(courses).setImage((String) any());
        verify(courses).setTitle((String) any());
    }
}

