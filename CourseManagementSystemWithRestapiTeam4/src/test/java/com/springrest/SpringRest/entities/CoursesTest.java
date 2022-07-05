package com.springrest.SpringRest.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CoursesTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Courses#Courses()}
     *   <li>{@link Courses#setCategory(String)}
     *   <li>{@link Courses#setDiscription(String)}
     *   <li>{@link Courses#setDuration(String)}
     *   <li>{@link Courses#setFee(long)}
     *   <li>{@link Courses#setId(long)}
     *   <li>{@link Courses#setImage(String)}
     *   <li>{@link Courses#setTitle(String)}
     *   <li>{@link Courses#toString()}
     *   <li>{@link Courses#getCategory()}
     *   <li>{@link Courses#getDiscription()}
     *   <li>{@link Courses#getDuration()}
     *   <li>{@link Courses#getFee()}
     *   <li>{@link Courses#getId()}
     *   <li>{@link Courses#getImage()}
     *   <li>{@link Courses#getTitle()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Courses actualCourses = new Courses();
        actualCourses.setCategory("Category");
        actualCourses.setDiscription("Discription");
        actualCourses.setDuration("Duration");
        actualCourses.setFee(1L);
        actualCourses.setId(123L);
        actualCourses.setImage("Image");
        actualCourses.setTitle("Dr");
        String actualToStringResult = actualCourses.toString();
        assertEquals("Category", actualCourses.getCategory());
        assertEquals("Discription", actualCourses.getDiscription());
        assertEquals("Duration", actualCourses.getDuration());
        assertEquals(1L, actualCourses.getFee());
        assertEquals(123L, actualCourses.getId());
        assertEquals("Image", actualCourses.getImage());
        assertEquals("Dr", actualCourses.getTitle());
        assertEquals("Courses [id=123, title=Dr, duration=Duration, fee=1, Category=Category, image=Image, discription"
                + "=Discription]", actualToStringResult);
    }

    /**
     * Method under test: {@link Courses#Courses(long, String, String, long, String, String, String)}
     */
    @Test
    void testConstructor2() {
        Courses actualCourses = new Courses(123L, "Dr", "Duration", 1L, "Category", "Image", "Discription");

        assertEquals("Category", actualCourses.getCategory());
        assertEquals("Dr", actualCourses.getTitle());
        assertEquals("Image", actualCourses.getImage());
        assertEquals(123L, actualCourses.getId());
        assertEquals(1L, actualCourses.getFee());
        assertEquals("Duration", actualCourses.getDuration());
        assertEquals("Discription", actualCourses.getDiscription());
    }
}

