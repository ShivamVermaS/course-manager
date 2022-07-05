package com.springrest.SpringRest.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AdminTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Admin#Admin()}
     *   <li>{@link Admin#setEmail(String)}
     *   <li>{@link Admin#setName(String)}
     *   <li>{@link Admin#setPassword(String)}
     *   <li>{@link Admin#setUsername(String)}
     *   <li>{@link Admin#toString()}
     *   <li>{@link Admin#getEmail()}
     *   <li>{@link Admin#getName()}
     *   <li>{@link Admin#getPassword()}
     *   <li>{@link Admin#getUsername()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Admin actualAdmin = new Admin();
        actualAdmin.setEmail("jane.doe@example.org");
        actualAdmin.setName("Name");
        actualAdmin.setPassword("iloveyou");
        actualAdmin.setUsername("janedoe");
        String actualToStringResult = actualAdmin.toString();
        assertEquals("jane.doe@example.org", actualAdmin.getEmail());
        assertEquals("Name", actualAdmin.getName());
        assertEquals("iloveyou", actualAdmin.getPassword());
        assertEquals("janedoe", actualAdmin.getUsername());
        assertEquals("Admin [name=Name, username=janedoe, email=jane.doe@example.org, password=iloveyou]",
                actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Admin#Admin(String, String, String, String)}
     *   <li>{@link Admin#setEmail(String)}
     *   <li>{@link Admin#setName(String)}
     *   <li>{@link Admin#setPassword(String)}
     *   <li>{@link Admin#setUsername(String)}
     *   <li>{@link Admin#toString()}
     *   <li>{@link Admin#getEmail()}
     *   <li>{@link Admin#getName()}
     *   <li>{@link Admin#getPassword()}
     *   <li>{@link Admin#getUsername()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Admin actualAdmin = new Admin("Name", "janedoe", "jane.doe@example.org", "iloveyou");
        actualAdmin.setEmail("jane.doe@example.org");
        actualAdmin.setName("Name");
        actualAdmin.setPassword("iloveyou");
        actualAdmin.setUsername("janedoe");
        String actualToStringResult = actualAdmin.toString();
        assertEquals("jane.doe@example.org", actualAdmin.getEmail());
        assertEquals("Name", actualAdmin.getName());
        assertEquals("iloveyou", actualAdmin.getPassword());
        assertEquals("janedoe", actualAdmin.getUsername());
        assertEquals("Admin [name=Name, username=janedoe, email=jane.doe@example.org, password=iloveyou]",
                actualToStringResult);
    }
}

