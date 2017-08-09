package com.lovech.dynamicsite.mapper;

import com.lovech.dynamicsite.entity.Role;

/**
 * Created by luowq on 2017/8/8.
 */
public interface RoleMapper {
    Role getRoleByUserId(Integer userId);
}
