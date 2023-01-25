package com.zzf;


import com.zzf.pojo.Book;
import com.zzf.service.Bookservice;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@SpringBootTest
public class springtest {
    @Autowired
    private Bookservice bookservice;
    @Test
    public void testbyid(){
        List<Book> selectall = bookservice.selectall();
        System.out.println(selectall);
    }
}
