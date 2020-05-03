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

class BookImageMapperTest extends BooktradingApplicationTests {

    @Autowired
    private BookImageMapper bookImageMapper;
    Book book=new Book((long)1, "活着", (float) 20.00, "9787506365437", "作家出版社",
            new Category((long) 1, "文学"),
            new User((long)2,"1001","1001","18209315709","太原"), new BookImage());
    @Test
    void addBookImage() {

        int add = bookImageMapper.addBookImage(new BookImage((long) 1, book, "文化"));
        Assert.assertEquals(1, add);
    }

    @Test
    void updateBookImage() {
        int update = bookImageMapper.updateBookImage(new BookImage((long) 6, book, "流行"));
        Assert.assertEquals(1,update);
    }

    @Test
    void getByBookId() {
        BookImage bookImage = bookImageMapper.getByBookId((long) 1);
        Assert.assertNotNull(bookImage);
    }

    @Test
    void deleteByBookId() {
        int delete=bookImageMapper.deleteByBookId((long) 1);
        Assert.assertEquals(1, delete);
    }
}