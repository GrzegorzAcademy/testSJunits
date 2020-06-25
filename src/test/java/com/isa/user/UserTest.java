package com.isa.user;





import org.junit.jupiter.api.Test;

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
        assertThrows(IllegalArgumentException.class, () -> new User(null));
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

    }

    @Test
    public void testCreateNewUserWhenPasswordIsEmpty() {
        User user = new User("Janko");
        assertThrows(IllegalArgumentException.class, () -> user.setPassword(""));

    }

    @Test
    public void testCreateNewUserWhenPasswordIsNew() {
        User user = new User("Janko");
        user.setPassword("123");
       assertEquals("Janko",user.getLogin());
       assertEquals("123", user.getPassword());

    }

    @Test
    public void testValidateDate() {
        User user = new User("Test1");
        user.setPassword("asd");
        assertEquals("Test1", user.getLogin());
        assertEquals("asd", user.getPassword());
        assertEquals("User{" +
                "login='" + user.getLogin() + '\'' +
                ", password='" + user.getPassword() + '\'' +
                '}', user.toString());
    }
}
