package com.isa.user;

import java.util.List;
import java.util.stream.Collectors;


public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean doesUserExist(String login) {
        User user = userDao.findUser(login);
        if (user != null) {
            return true;
        }
        return false;
    }

    public List<User> findUsers(String s) {
        List<User> users = userDao.getAllUsers();
        return users.stream()
                    .filter(u -> u.getLogin().contains(s))
                    .collect(Collectors.toList());
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }
}
