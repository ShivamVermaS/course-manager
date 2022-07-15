package com.springrest.SpringRest.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyLong;
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
     * Method under test: {@link CourseService#getCourseById(long)}
     */
    @Test
    void testGetCourseById2() {
        when(courseRepo.findById((Long) any())).thenReturn(Optional.empty());
        assertThrows(IllegalArgumentException.class, () -> courseService.getCourseById(123L));
        verify(courseRepo).findById((Long) any());
    }


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
        Optional<Courses> ofResult = Optional.of(courses);

        Courses courses1 = new Courses();
        courses1.setCategory("Category");
        courses1.setDiscription("Discription");
        courses1.setDuration("Duration");
        courses1.setFee(1L);
        courses1.setId(123L);
        courses1.setImage("Image");
        courses1.setTitle("Dr");
        when(courseRepo.save((Courses) any())).thenReturn(courses1);
        when(courseRepo.findById((Long) any())).thenReturn(ofResult);

        Courses courses2 = new Courses();
        courses2.setCategory("Category");
        courses2.setDiscription("Discription");
        courses2.setDuration("Duration");
        courses2.setFee(1L);
        courses2.setId(123L);
        courses2.setImage("Image");
        courses2.setTitle("Dr");
        assertSame(courses1, courseService.saveAllCourse(courses2));
        verify(courseRepo).save((Courses) any());
        verify(courseRepo).findById((Long) any());
    }


    @Test
    void testSaveAllCourse3() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseRepo.save((Courses) any())).thenReturn(courses);
        when(courseRepo.findById((Long) any())).thenReturn(Optional.empty());

        Courses courses1 = new Courses();
        courses1.setCategory("Category");
        courses1.setDiscription("Discription");
        courses1.setDuration("Duration");
        courses1.setFee(1L);
        courses1.setId(123L);
        courses1.setImage("Image");
        courses1.setTitle("Dr");
        assertThrows(IllegalArgumentException.class, () -> courseService.saveAllCourse(courses1));
        verify(courseRepo).findById((Long) any());
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
        Optional<Courses> ofResult = Optional.of(courses);

        Courses courses1 = new Courses();
        courses1.setCategory("Category");
        courses1.setDiscription("Discription");
        courses1.setDuration("Duration");
        courses1.setFee(1L);
        courses1.setId(123L);
        courses1.setImage("Image");
        courses1.setTitle("Dr");
        when(courseRepo.save((Courses) any())).thenReturn(courses1);
        when(courseRepo.findById((Long) any())).thenReturn(ofResult);

        Courses courses2 = new Courses();
        courses2.setCategory("Category");
        courses2.setDiscription("Discription");
        courses2.setDuration("Duration");
        courses2.setFee(1L);
        courses2.setId(123L);
        courses2.setImage("Image");
        courses2.setTitle("Dr");
        assertSame(courses1, courseService.updateCourse(courses2));
        verify(courseRepo).save((Courses) any());
        verify(courseRepo).findById((Long) any());
    }

    @Test
    void testUpdateCourse3() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        when(courseRepo.save((Courses) any())).thenReturn(courses);
        when(courseRepo.findById((Long) any())).thenReturn(Optional.empty());

        Courses courses1 = new Courses();
        courses1.setCategory("Category");
        courses1.setDiscription("Discription");
        courses1.setDuration("Duration");
        courses1.setFee(1L);
        courses1.setId(123L);
        courses1.setImage("Image");
        courses1.setTitle("Dr");
        assertThrows(IllegalArgumentException.class, () -> courseService.updateCourse(courses1));
        verify(courseRepo).findById((Long) any());
    }

    /**
     * Method under test: {@link CourseService#deleteCourseById(long)}
     */
    @Test
    void testDeleteCourseById() {
        Courses courses = new Courses();
        courses.setCategory("Category");
        courses.setDiscription("Discription");
        courses.setDuration("Duration");
        courses.setFee(1L);
        courses.setId(123L);
        courses.setImage("Image");
        courses.setTitle("Dr");
        Optional<Courses> ofResult = Optional.of(courses);
        when(courseRepo.deleteById(anyLong())).thenReturn("42");
        when(courseRepo.findById((Long) any())).thenReturn(ofResult);
        assertEquals("Deleted", courseService.deleteCourseById(123L));
        verify(courseRepo).deleteById(anyLong());
        verify(courseRepo).findById((Long) any());
    }

    @Test
    void testDeleteCourseById3() {
        when(courseRepo.deleteById(anyLong())).thenReturn("42");
        when(courseRepo.findById((Long) any())).thenReturn(Optional.empty());
        assertThrows(IllegalArgumentException.class, () -> courseService.deleteCourseById(123L));
        verify(courseRepo).findById((Long) any());
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
        Optional<Courses> ofResult = Optional.of(courses);
        when(courseRepo.findByTitle((String) any())).thenReturn(ofResult);
        Optional<Courses> actualCourses = courseService.getCourses("Name");
        assertSame(ofResult, actualCourses);
        assertTrue(actualCourses.isPresent());
        verify(courseRepo).findByTitle((String) any());
    }

    /**
     * Method under test: {@link CourseService#getCourses(String)}
     */
    @Test
    void testGetCourses2() {
        when(courseRepo.findByTitle((String) any())).thenReturn(Optional.empty());
        assertThrows(IllegalArgumentException.class, () -> courseService.getCourses("Name"));
        verify(courseRepo).findByTitle((String) any());
    }

 
}

