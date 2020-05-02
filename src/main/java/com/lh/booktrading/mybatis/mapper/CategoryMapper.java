package com.lh.booktrading.mybatis.mapper;


import com.lh.booktrading.mybatis.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CategoryMapper {

    int addCategory(@Param("category") Category category);

    int deleteCategoryById(@Param("id") Long id);
}
