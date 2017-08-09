package com.lovech.dynamicsite.service.impl;

import com.lovech.dynamicsite.entity.User;
import com.lovech.dynamicsite.mapper.UserMapper;
import com.lovech.dynamicsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luowq on 2017/8/7.
 */
@Service
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;
    public User getUserByName(String userName) {
        return userMapper.getUserByName(userName);
    }
}
