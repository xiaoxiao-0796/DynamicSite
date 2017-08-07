package com.lovech.dynamicsite.service;

import com.lovech.dynamicsite.entity.User;

/**
 * Created by luowq on 2017/8/7.
 */
public interface UserService {
    User getUserByName(String userName);
}
