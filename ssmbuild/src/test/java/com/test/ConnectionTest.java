package com.test;

import com.jiquan.pojo.Books;
import com.jiquan.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZHONG Jiquan
 * @create 13/11/2022 - 05:53
 */
public class ConnectionTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean(BookService.class);
        System.out.println(bookService);
        Books books = bookService.queryBookById(1);
        System.out.println(books);
    }
}
