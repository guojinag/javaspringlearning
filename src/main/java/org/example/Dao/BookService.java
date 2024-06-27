package org.example.Dao;

public class BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void saveBook() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
