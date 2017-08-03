package com.lovech.dynamicsite.mapper;

import com.lovech.dynamicsite.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by luowq on 2017/8/3.
 */
@Repository
public interface UserMapper {
   // @Select("select * from users where id=#{userId}")
    User getUser(@Param("userId")String userId);
}
