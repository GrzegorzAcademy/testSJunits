package com.isa.user;

import java.util.List;

public interface UserDao {

    User findUser(String login);

    void deleteUser(User user);

    List<User> getAllUsers();
}
