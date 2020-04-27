package com.lh.booktrading.mybatis.mapper;

import com.lh.booktrading.BooktradingApplicationTests;
import com.lh.booktrading.mybatis.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
class UserMapperTest extends BooktradingApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void selectAllUser() {
        List<User> userList = userMapper.selectAllUser();
        Assert.assertTrue(userList.size() == 2);
        log.debug("【userList】= {}", userList);
    }

    @Test
    void selectUserById() {
        User user=userMapper.selectUserById(2L);
        Assert.assertNotNull(user);
        log.debug("【user】={}",user);
    }

    @Test
    void deleteById() {
        int i =userMapper.deleteById(2L);
        Assert.assertEquals(1,i);
    }

    @Test
    void saveUser() {
        int i =userMapper.saveUser(new User(null,"1002","1002","18209315709","太原"));
        Assert.assertEquals(1,i);
    }
}