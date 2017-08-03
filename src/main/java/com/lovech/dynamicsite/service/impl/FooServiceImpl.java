package com.lovech.dynamicsite.service.impl;

import com.lovech.dynamicsite.entity.User;
import com.lovech.dynamicsite.mapper.UserMapper;
import com.lovech.dynamicsite.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luowq on 2017/8/3.
 */
@Service
public class FooServiceImpl implements FooService {
    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper){
        this.userMapper=userMapper;
    }

    public User getUserById(String userId) {
        return userMapper.getUser(userId);
    }
}
