package com.zzf.service;



import com.zzf.pojo.Book;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface Bookservice {


    public boolean save(Book book);


    public boolean update(Book book);


    public boolean delete( int id);


    public Book selectbyid(int id);


    public List<Book> selectall();
}
