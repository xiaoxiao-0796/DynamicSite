package com.lovech.dynamicsite.service.impl;

import com.lovech.dynamicsite.entity.User;
import com.lovech.dynamicsite.mapper.UserMapper;
import com.lovech.dynamicsite.service.FooService;

/**
 * Created by luowq on 2017/8/3.
 */
public class FooServiceImpl implements FooService {
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper){
        this.userMapper=userMapper;
    }

    public User doSomeBusinessStuff(String userId){
        return this .userMapper.getUser(userId);
    }
}
