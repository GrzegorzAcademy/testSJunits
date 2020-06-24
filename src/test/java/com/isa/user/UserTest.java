package com.isa.user;


import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testCreatedNewUserForLoginInput() {

        User user = new User("janko");
        assertEquals("janko", user.getLogin());
        assertNotEquals("Adam", user.getLogin());
        assertNotEquals("12334", user.getPassword());
        assertEquals("d3f4u17", user.getPassword());
    }

    @Test
    public void testUserDefaultConstructorWhenLoginIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new User("null"));
    }

    @Test
    public void testCreatedUserByDefaultConstructor() {
        assertThrows(IllegalArgumentException.class, () -> new User());
    }

    @Test
    public void testCreateNewUserByLoginIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> new User(""));
    }

    @Test
    public void testCreateNewUserWhenPasswordIsNull() {
        User user = new User("Janko");
        assertThrows(IllegalArgumentException.class, () -> user.setPassword(null));

    }@Test
    public void testCreateNewUserWhenPasswordIsEmpty() {
        User user = new User("Janko");
        assertThrows(IllegalArgumentException.class, () -> user.setPassword(""));

    }


}
