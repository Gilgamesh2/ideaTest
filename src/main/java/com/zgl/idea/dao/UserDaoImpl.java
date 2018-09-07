package com.zgl.idea.dao;

import com.zgl.idea.entity.User;
import com.zgl.idea.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class UserDaoImpl implements  UserDao {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User get(Integer no) {
        return userMapper.getById(no);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
