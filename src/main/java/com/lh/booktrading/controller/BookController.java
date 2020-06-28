package com.lh.booktrading.controller;


import com.lh.booktrading.mybatis.mapper.BookMapper;
import com.lh.booktrading.mybatis.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book getBookDetail(@PathVariable("id") String id) {
        long bid = Long.parseLong(id);
        Book curBook = bookMapper.getBookById(bid);
        return curBook;
    }


    @RequestMapping(value = "/cg/{id}", method = RequestMethod.GET)
    public List<Book> getBookByCategory(@PathVariable("id") long id) {
        List<Book> books = bookMapper.listByBookCategoryId(id);
        return books;
    }

}
