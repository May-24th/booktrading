package com.lh.booktrading.mybatis.mapper;

import com.lh.booktrading.BooktradingApplicationTests;
import com.lh.booktrading.mybatis.pojo.Category;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class CategoryMapperTest extends BooktradingApplicationTests {
    @Autowired
    private CategoryMapper categoryMapper;
    @Test
    void addCategory() {
        int add = categoryMapper.addCategory(new Category((long) 3, "文化"));
        Assert.assertEquals(1,add);
    }

    @Test
    void deleteCategoryById() {
        int del = categoryMapper.deleteCategoryById((long) 3);
        Assert.assertEquals(1,del);
    }
}