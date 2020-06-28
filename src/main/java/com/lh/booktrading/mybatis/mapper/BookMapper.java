package com.lh.booktrading.mybatis.mapper;

import com.lh.booktrading.mybatis.pojo.Book;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BookMapper {
    int addBook(Book book);

    int deleteBookById(Long id);

    int updateBook(Book book);

    Book getBookById(Long id);

    List<Book> listByBookCategoryId(Long cid);

    List<Book> listByBookUserId(Long uid);
}
