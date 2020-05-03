package com.lh.booktrading.mybatis.mapper;


import com.lh.booktrading.mybatis.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CategoryMapper {

    int addCategory(@Param("category") Category category);

    int deleteCategoryById(@Param("id") Long id);

    int updateCategory(Category category);

    Category get(Long id);
}
