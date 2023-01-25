package com.zzf.controller;


import com.zzf.pojo.Book;
import com.zzf.service.Bookservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")

public class BookController {
    @Autowired
    private Bookservice bookservice;

    @PostMapping
    public Result save(@RequestBody Book book) {
        System.out.println("jinlai");
        boolean save = bookservice.save(book);
        return new Result(save ? Code.Save_ok :Code.save_err,save ) ;
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        System.out.println("jinlai");
        boolean update = bookservice.update(book);
        return new Result(update ? Code.update_ok :Code.update_err,update) ;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable int id) {
        System.out.println(id);
        boolean delete = bookservice.delete(id);

        return new Result(delete ? Code.delete_ok :Code.delete_err,delete) ;
    }

    @GetMapping("/{id}")
    public Result selectbyid(@PathVariable int id) {
        System.out.println(id);

        Book selectbyid = bookservice.selectbyid(id);
        int code =selectbyid !=null ? Code.select_ok:Code.select_err;
        String msg=selectbyid !=null ? "":"数据查询失败！";

        return new Result(code,selectbyid,msg) ;
    }

    @GetMapping
    public Result selectall() {
        System.out.println("jinlai");

        List<Book> selectall = bookservice.selectall();
        int code =selectall !=null ? Code.select_ok:Code.select_err;
        String msg=selectall !=null ? "":"数据查询失败！";

        return new Result(code,selectall,msg) ;
    }

}
