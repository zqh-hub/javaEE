package com.login.java;

import org.junit.Test;

public class UserTest {
    @Test
    public void test() {
        User user = new User("12", "23");
        UserDao userDao = new UserDao();
        User login = userDao.login(user);
        System.out.println(login.toString());

    }
}
