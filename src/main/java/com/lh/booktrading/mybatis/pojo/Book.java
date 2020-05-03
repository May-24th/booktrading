package com.lh.booktrading.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Long id;
    private String name;
    private float price;
    private String ISBN;
    private String publisher;
    private Category category;
    private User user;
    private BookImage bookImage;
}
