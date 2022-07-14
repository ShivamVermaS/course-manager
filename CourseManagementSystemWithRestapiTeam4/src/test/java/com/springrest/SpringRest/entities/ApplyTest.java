package com.springrest.SpringRest.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ApplyTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Apply#Apply()}
     *   <li>{@link Apply#setCourse_id(int)}
     *   <li>{@link Apply#setCourse_name(String)}
     *   <li>{@link Apply#setDuration(String)}
     *   <li>{@link Apply#setFees(int)}
     *   <li>{@link Apply#setFirst_name(String)}
     *   <li>{@link Apply#setLast_name(String)}
     *   <li>{@link Apply#toString()}
     *   <li>{@link Apply#getCourse_id()}
     *   <li>{@link Apply#getCourse_name()}
     *   <li>{@link Apply#getDuration()}
     *   <li>{@link Apply#getFees()}
     *   <li>{@link Apply#getFirst_name()}
     *   <li>{@link Apply#getLast_name()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Apply actualApply = new Apply();
        actualApply.setCourse_id(1);
        actualApply.setCourse_name("Course name");
        actualApply.setDuration("Duration");
        actualApply.setFees(1);
        actualApply.setFirst_name("Jane");
        actualApply.setLast_name("Doe");
        String actualToStringResult = actualApply.toString();
        assertEquals(1, actualApply.getCourse_id());
        assertEquals("Course name", actualApply.getCourse_name());
        assertEquals("Duration", actualApply.getDuration());
        assertEquals(1, actualApply.getFees());
        assertEquals("Jane", actualApply.getFirst_name());
        assertEquals("Doe", actualApply.getLast_name());
        assertEquals(
                "Apply [First_name=Jane, Last_name=Doe, Course_name=Course name, Course_id=1, Fees=1," + " Duration=Duration]",
                actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Apply#Apply(String, String, String, int, int, String)}
     *   <li>{@link Apply#setCourse_id(int)}
     *   <li>{@link Apply#setCourse_name(String)}
     *   <li>{@link Apply#setDuration(String)}
     *   <li>{@link Apply#setFees(int)}
     *   <li>{@link Apply#setFirst_name(String)}
     *   <li>{@link Apply#setLast_name(String)}
     *   <li>{@link Apply#toString()}
     *   <li>{@link Apply#getCourse_id()}
     *   <li>{@link Apply#getCourse_name()}
     *   <li>{@link Apply#getDuration()}
     *   <li>{@link Apply#getFees()}
     *   <li>{@link Apply#getFirst_name()}
     *   <li>{@link Apply#getLast_name()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Apply actualApply = new Apply("Jane", "Doe", "Course name", 1, 1, "Duration");
        actualApply.setCourse_id(1);
        actualApply.setCourse_name("Course name");
        actualApply.setDuration("Duration");
        actualApply.setFees(1);
        actualApply.setFirst_name("Jane");
        actualApply.setLast_name("Doe");
        String actualToStringResult = actualApply.toString();
        assertEquals(1, actualApply.getCourse_id());
        assertEquals("Course name", actualApply.getCourse_name());
        assertEquals("Duration", actualApply.getDuration());
        assertEquals(1, actualApply.getFees());
        assertEquals("Jane", actualApply.getFirst_name());
        assertEquals("Doe", actualApply.getLast_name());
        assertEquals(
                "Apply [First_name=Jane, Last_name=Doe, Course_name=Course name, Course_id=1, Fees=1," + " Duration=Duration]",
                actualToStringResult);
    }
}

