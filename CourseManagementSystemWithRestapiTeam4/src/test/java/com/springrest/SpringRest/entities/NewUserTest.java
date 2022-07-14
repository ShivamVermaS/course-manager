package com.springrest.SpringRest.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NewUserTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link NewUser#NewUser()}
     *   <li>{@link NewUser#setEmail(String)}
     *   <li>{@link NewUser#setFirst_name(String)}
     *   <li>{@link NewUser#setGender(String)}
     *   <li>{@link NewUser#setLast_name(String)}
     *   <li>{@link NewUser#setMobile_No(String)}
     *   <li>{@link NewUser#setPassword(String)}
     *   <li>{@link NewUser#setUid(long)}
     *   <li>{@link NewUser#toString()}
     *   <li>{@link NewUser#getEmail()}
     *   <li>{@link NewUser#getFirst_name()}
     *   <li>{@link NewUser#getGender()}
     *   <li>{@link NewUser#getLast_name()}
     *   <li>{@link NewUser#getMobile_No()}
     *   <li>{@link NewUser#getPassword()}
     *   <li>{@link NewUser#getUid()}
     * </ul>
     */
    @Test
    void testConstructor() {
        NewUser actualNewUser = new NewUser();
        actualNewUser.setEmail("jane.doe@example.org");
        actualNewUser.setFirst_name("Jane");
        actualNewUser.setGender("Gender");
        actualNewUser.setLast_name("Doe");
        actualNewUser.setMobile_No("Mobile No");
        actualNewUser.setPassword("iloveyou");
        actualNewUser.setUid(1L);
        String actualToStringResult = actualNewUser.toString();
        assertEquals("jane.doe@example.org", actualNewUser.getEmail());
        assertEquals("Jane", actualNewUser.getFirst_name());
        assertEquals("Gender", actualNewUser.getGender());
        assertEquals("Doe", actualNewUser.getLast_name());
        assertEquals("Mobile No", actualNewUser.getMobile_No());
        assertEquals("iloveyou", actualNewUser.getPassword());
        assertEquals(1L, actualNewUser.getUid());
        assertEquals("NewUser [uid=1, First_name=Jane, Last_name=Doe, Email=jane.doe@example.org, Password=iloveyou,"
                + " Gender=Gender, Mobile_No=Mobile No]", actualToStringResult);
    }

    /**
     * Method under test: {@link NewUser#NewUser(long, String, String, String, String, String, String)}
     */
    @Test
    void testConstructor2() {
        NewUser actualNewUser = new NewUser(1L, "Jane", "Doe", "jane.doe@example.org", "iloveyou", "Gender", "Mobile No");

        assertEquals("jane.doe@example.org", actualNewUser.getEmail());
        assertEquals(1L, actualNewUser.getUid());
        assertEquals("iloveyou", actualNewUser.getPassword());
        assertEquals("Mobile No", actualNewUser.getMobile_No());
        assertEquals("Doe", actualNewUser.getLast_name());
        assertEquals("Gender", actualNewUser.getGender());
        assertEquals("Jane", actualNewUser.getFirst_name());
    }
}

