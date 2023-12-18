package com.atguigu.dao.impl;

import com.atguigu.dao.UserDAO;
import com.atguigu.pojo.User;

public class UserDAOImpl extends BaseDAO implements UserDAO {
    @Override
    public User queryUserByUsername(String username) {
        String sql = "select `id`,`username`, `password`, `email` from t_user where username = ? ";
        return queryForOne(User.class, sql, username);
    }

    @Override
    public int saveUser(User user) {
        String sql = "INSERT INTO t_user(`username`, `password`, `email`) VALUE(?,?,?)";
        return update(sql,user.getUsername(), user.getPassword(),user.getEmail());
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql = "select `id`,`username`, `password`, `email` from t_user where username = ? and password= ?";
        return queryForOne(User.class, sql, username, password);
    }
}
