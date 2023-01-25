package com.zzf.dao;


import com.zzf.pojo.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface BookDao {
    @Insert("insert into tbl_book value(null,#{type},#{name},#{description})")
    public void save(Book book);

    @Update("update tbl_book set name=#{name},type=#{type},description=#{description} where id=#{id}" )
    public void update(Book book);

    @Delete("delete from  tbl_book where id=#{id}")
    public void delete(int id);

    @Select("select * from tbl_book where id=(#{id})")
    public Book selectbyid(int id);

    @Select("select * from tbl_book")
    public List<Book> selectall();

}
