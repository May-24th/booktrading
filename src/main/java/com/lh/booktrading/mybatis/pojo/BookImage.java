package com.lh.booktrading.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookImage{
    private Long id;
    private Book book;
    private String type;
}
