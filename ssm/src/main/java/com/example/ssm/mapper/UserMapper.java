package com.example.ssm.mapper;

import com.example.ssm.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User getUserById(@Param("id") Long id);
}
