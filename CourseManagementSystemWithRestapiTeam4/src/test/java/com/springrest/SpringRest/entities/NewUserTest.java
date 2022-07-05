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
     *   <li>{@link NewUser#setFirstName(String)}
     *   <li>{@link NewUser#setJendra(String)}
     *   <li>{@link NewUser#setLastName(String)}
     *   <li>{@link NewUser#setMobile_No(String)}
     *   <li>{@link NewUser#setPassword(String)}
     *   <li>{@link NewUser#setUid(long)}
     *   <li>{@link NewUser#toString()}
     *   <li>{@link NewUser#getEmail()}
     *   <li>{@link NewUser#getFirstName()}
     *   <li>{@link NewUser#getGender()}
     *   <li>{@link NewUser#getLastName()}
     *   <li>{@link NewUser#getMobile_No()}
     *   <li>{@link NewUser#getPassword()}
     *   <li>{@link NewUser#getUid()}
     * </ul>
     */
    @Test
    void testConstructor() {
        NewUser actualNewUser = new NewUser();
        actualNewUser.setEmail("jane.doe@example.org");
        actualNewUser.setFirstName("Jane");
        actualNewUser.setJendra("Gender");
        actualNewUser.setLastName("Doe");
        actualNewUser.setMobile_No("Mobile No");
        actualNewUser.setPassword("iloveyou");
        actualNewUser.setUid(1L);
        String actualToStringResult = actualNewUser.toString();
        assertEquals("jane.doe@example.org", actualNewUser.getEmail());
        assertEquals("Jane", actualNewUser.getFirstName());
        assertEquals("Gender", actualNewUser.getGender());
        assertEquals("Doe", actualNewUser.getLastName());
        assertEquals("Mobile No", actualNewUser.getMobile_No());
        assertEquals("iloveyou", actualNewUser.getPassword());
        assertEquals(1L, actualNewUser.getUid());
        assertEquals(
                "NewUser [Uid=1, FirstName=Jane, LastName=Doe, Email=jane.doe@example.org, Password=iloveyou, Gender=Gender,"
                        + " Mobile_No=Mobile No]",
                actualToStringResult);
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
        assertEquals("Doe", actualNewUser.getLastName());
        assertEquals("Gender", actualNewUser.getGender());
        assertEquals("Jane", actualNewUser.getFirstName());
    }
}

