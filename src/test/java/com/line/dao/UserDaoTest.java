package com.line.dao;

import com.line.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {

    @Autowired
    ApplicationContext context;

    UserDao userDao;
    @Test
    void addAndSelect() throws SQLException {
        userDao = context.getBean("awsUserDao", UserDao.class);
        String id = "37";
        User user = new User(id, "EternityHwan", "1123");
        userDao.add(user);

        User selectedUser = userDao.findById(id);
        Assertions.assertEquals("EternityHwan", selectedUser.getName());
        Assertions.assertEquals("1123", selectedUser.getPassword());
    }

    @Test
    void count() {

    }
}