package com.zgl.idea.mapper;

import com.zgl.idea.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;


@MapperScan
public interface UserMapper {
        User getById(Integer no);
        List<User> getAll();
}
