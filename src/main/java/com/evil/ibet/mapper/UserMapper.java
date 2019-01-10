package com.evil.ibet.mapper;

import com.evil.ibet.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    void insertUser(@Param("user") User user);


}
