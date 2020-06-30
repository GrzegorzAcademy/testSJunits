package com.isa.user;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    UserDao userDao;
    @InjectMocks
    private UserService userService;

    //    public void beforeEach(){
//        userDao = mock(UserDao.class);
//     userService = new UserService(userDao);
//
//     }
    @Test
    public void returnFromMock() {
        List<User> allUsers = userService.getAllUsers();
        System.out.println(allUsers);

        List<User> findUsersResult = userService.findUsers("admin");
        System.out.println(findUsersResult);

        User resultUserDao = userDao.findUser("admin");
        System.out.println(resultUserDao);
    }

    @Test
    public void shouldGetAllUsers() {
        //given

        List<User> users = Arrays.asList(
                new User("Adam"),
                new User("Karol"),
                new User("Kamila"),
                new User("Robert"));
        when(userDao.getAllUsers()).thenReturn(users);

        //When
        List<User> result = userService.getAllUsers();
        //then
        assertThat(result).hasSize(4).asString();
    }

    @Test
    public void shouldReturnAllUsersMatchingPattern() {
        //given

        List<User> users = Arrays.asList(
                new User("Adam"),
                new User("Karol"),
                new User("Kamila"),
                new User("Robert"));
        when(userDao.getAllUsers()).thenReturn(users);
        //when
        List<User> ad = userService.findUsers("Ad");
        //then
        assertThat(ad).hasSize(1)
                .contains(new User("Adam"));
    }

    @Test
    public void showReturnTrueIfUserIsExist() {
        //given

        when(userDao.findUser(eq("admin"))).thenReturn(new User("admin"));

        //when
        boolean admin = userService.doesUserExist("admin");

        //then

        assertThat(admin).isTrue();
    }

    @Test
    public void shouldReturnFalseIfUserNotExist() {
        //given

        when(userDao.findUser(eq("frodo"))).thenReturn(null);

        //when

        boolean result = userService.doesUserExist("frodo");

        //then

        assertThat(result).isFalse();
    }

    @Test
    public void shouldThrowRuntimeExceptionWhenDeleteUser() {
        //given
        doThrow(new RuntimeException()).when(userDao).deleteUser(any());

        //when & given
        assertThrows(RuntimeException.class,() -> userService.deleteUser(new User("test delete user")));
    }


}