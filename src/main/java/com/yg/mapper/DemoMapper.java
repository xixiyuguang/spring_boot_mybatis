package com.yg.mapper;

import com.yg.bean.Demo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository // 这里加上
public interface DemoMapper {

    @Select("select *from Demo where name = #{name}")
    public List<Demo> likeName(String name);

    @Select("select *from Demo where id = #{id}")
    public Demo getById(long id);

    @Select("select name from Demo where id = #{id}")
    public String getNameById(long id);


    @Insert("insert into Demo(name) values(#{name})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    public void save(Demo demo);

    @Insert("insert into Demo(name) values(#{name})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    public void save2(String name);
}
