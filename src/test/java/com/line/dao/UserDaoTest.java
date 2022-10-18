package com.line.dao;

import com.line.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    void addAndSelect() {
        UserDao userDao = new UserDao();
        String id = "17";
        User user = new User(id, "EternityHwan", "1123");
        userDao.add(user);

        User selectedUser = userDao.findById(id);
        Assertions.assertEquals("EternityHwan", selectedUser.getName());
        Assertions.assertEquals("1123", selectedUser.getPassword());
    }
}