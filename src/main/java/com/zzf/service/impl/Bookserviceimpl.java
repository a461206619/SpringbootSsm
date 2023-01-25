package com.zzf.service.impl;


import com.zzf.dao.BookDao;
import com.zzf.pojo.Book;
import com.zzf.service.Bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Bookserviceimpl implements Bookservice {

    @Autowired
    private BookDao dao;

    public boolean save(Book book) {
        dao.save(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        dao.update(book);
        return true;
    }

    @Override
    public boolean delete(int id) {

        dao.delete(id);
        return true;
    }

    @Override
    public Book selectbyid(int id) {
        Book selectbyid = dao.selectbyid(id);

        return selectbyid;
    }

    @Override
    public List<Book> selectall() {


        List<Book> selectall = dao.selectall();
        return selectall;
    }
}
