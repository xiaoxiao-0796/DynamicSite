package com.lovech.dynamicsite.service;

import com.lovech.dynamicsite.entity.Role;
import com.lovech.dynamicsite.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luowq on 2017/8/8.
 */
public interface RoleService {
    Role getRoleByUserId(Integer userId);
}
