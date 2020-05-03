package com.lh.booktrading.mybatis.mapper;

import com.lh.booktrading.mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {
    @Select("SELECT * FROM bt_user")
    List<User> selectAllUser();

    User selectUserById(Long id);

    int deleteById(@Param("id") Long id);

    int saveUser(@Param("user") User user);
}
