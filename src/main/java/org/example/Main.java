package org.example;


import org.example.Dao.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.saveBook();

    }
}