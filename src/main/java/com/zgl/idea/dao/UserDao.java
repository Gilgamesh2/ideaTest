package com.zgl.idea.dao;

import com.zgl.idea.entity.User;

import java.util.List;


public interface UserDao {

    User get(Integer no);
    List<User> getAll();
}
