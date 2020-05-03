package com.lh.booktrading.mybatis.mapper;

import com.lh.booktrading.BooktradingApplicationTests;
import com.lh.booktrading.mybatis.pojo.Book;
import com.lh.booktrading.mybatis.pojo.BookImage;
import com.lh.booktrading.mybatis.pojo.Category;
import com.lh.booktrading.mybatis.pojo.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class BookMapperTest extends BooktradingApplicationTests {

    @Autowired
    private BookMapper bookMapper;
    Book book = new Book((long) 2, "解忧杂货店", (float) 39.50, "9787544270878", "南海出版公司",
            new Category((long) 2, "文化"),
            new User((long) 2, "1002", "1002", "18209315709", "太原"), new BookImage());

    @Test
    void addBook() {
        int add = bookMapper.addBook(book);
        Assert.assertEquals(1, add);
    }

    @Test
    void deleteBookById() {
        int delete = bookMapper.deleteBookById((long) 2);
        Assert.assertEquals(1,delete);
    }

    @Test
    void updateBook() {
        book.setPrice((float) 40.00);
        int update = bookMapper.updateBook(book);
        Assert.assertEquals(1,update);
    }

    @Test
    void getBookById() {
        Book book = bookMapper.getBookById((long) 3);
        Assert.assertNotNull(book);
    }
}