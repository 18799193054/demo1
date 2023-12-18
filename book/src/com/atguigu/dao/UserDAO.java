package com.atguigu.dao;

import com.atguigu.pojo.User;

public interface UserDAO {

//    查询用户
    public User queryUserByUsername(String username);
//    保存用户信息
    public int saveUser(User user);

//    根据用户名和密码查询
    public User queryUserByUsernameAndPassword(String username, String password);
}
