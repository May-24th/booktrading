package com.lh.booktrading.mybatis.mapper;

import com.lh.booktrading.mybatis.pojo.BookImage;
import org.springframework.stereotype.Component;

@Component
public interface BookImageMapper {
    int addBookImage(BookImage bookImage);

    int updateBookImage(BookImage bookImage);

    BookImage getByBookId(Long bid);

    int deleteByBookId(Long bid);
}
