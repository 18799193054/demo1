package com.atguigu.test;

import com.atguigu.dao.UserDAO;
import com.atguigu.dao.impl.UserDAOImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDAOTest {

    @Test
    public void queryUserByUsername() {
        UserDAO userDao = new UserDAOImpl();
        if (userDao.queryUserByUsername("admin") ==null){
            System.out.println("用户名可用");
        }else{
            System.out.println("用户名已存在");
        }
    }

    @Test
    public void saveUser() {
    }

    @Test
    public void queryUserByUsernameAndPassword() {
        UserDAO userDao = new UserDAOImpl();
        if (userDao.queryUserByUsernameAndPassword("admin", "admin") !=null){
            System.out.println("用户名可用");
        }else{
            System.out.println("用户名已存在");
        }
    }
}