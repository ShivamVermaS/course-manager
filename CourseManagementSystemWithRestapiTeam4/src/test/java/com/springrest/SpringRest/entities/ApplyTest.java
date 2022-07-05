package com.springrest.SpringRest.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ApplyTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Apply#Apply()}
     *   <li>{@link Apply#setCourseId(String)}
     *   <li>{@link Apply#setCourseName(String)}
     *   <li>{@link Apply#setDuration(String)}
     *   <li>{@link Apply#setFees(String)}
     *   <li>{@link Apply#setFirstName(String)}
     *   <li>{@link Apply#setLastName(String)}
     *   <li>{@link Apply#toString()}
     *   <li>{@link Apply#getCourseId()}
     *   <li>{@link Apply#getCourseName()}
     *   <li>{@link Apply#getDuration()}
     *   <li>{@link Apply#getFees()}
     *   <li>{@link Apply#getFirstName()}
     *   <li>{@link Apply#getLastName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Apply actualApply = new Apply();
        actualApply.setCourseId("42");
        actualApply.setCourseName("Course Name");
        actualApply.setDuration("Duration");
        actualApply.setFees("Fees");
        actualApply.setFirstName("Jane");
        actualApply.setLastName("Doe");
        String actualToStringResult = actualApply.toString();
        assertEquals("42", actualApply.getCourseId());
        assertEquals("Course Name", actualApply.getCourseName());
        assertEquals("Duration", actualApply.getDuration());
        assertEquals("Fees", actualApply.getFees());
        assertEquals("Jane", actualApply.getFirstName());
        assertEquals("Doe", actualApply.getLastName());
        assertEquals(
                "Apply [FirstName=Jane, LastName=Doe, CourseName=Course Name, CourseId=42, Fees=Fees," + " Duration=Duration]",
                actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Apply#Apply(String, String, String, String, String, String)}
     *   <li>{@link Apply#setCourseId(String)}
     *   <li>{@link Apply#setCourseName(String)}
     *   <li>{@link Apply#setDuration(String)}
     *   <li>{@link Apply#setFees(String)}
     *   <li>{@link Apply#setFirstName(String)}
     *   <li>{@link Apply#setLastName(String)}
     *   <li>{@link Apply#toString()}
     *   <li>{@link Apply#getCourseId()}
     *   <li>{@link Apply#getCourseName()}
     *   <li>{@link Apply#getDuration()}
     *   <li>{@link Apply#getFees()}
     *   <li>{@link Apply#getFirstName()}
     *   <li>{@link Apply#getLastName()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Apply actualApply = new Apply("Jane", "Doe", "Course Name", "42", "Fees", "Duration");
        actualApply.setCourseId("42");
        actualApply.setCourseName("Course Name");
        actualApply.setDuration("Duration");
        actualApply.setFees("Fees");
        actualApply.setFirstName("Jane");
        actualApply.setLastName("Doe");
        String actualToStringResult = actualApply.toString();
        assertEquals("42", actualApply.getCourseId());
        assertEquals("Course Name", actualApply.getCourseName());
        assertEquals("Duration", actualApply.getDuration());
        assertEquals("Fees", actualApply.getFees());
        assertEquals("Jane", actualApply.getFirstName());
        assertEquals("Doe", actualApply.getLastName());
        assertEquals(
                "Apply [FirstName=Jane, LastName=Doe, CourseName=Course Name, CourseId=42, Fees=Fees," + " Duration=Duration]",
                actualToStringResult);
    }
}

