package com.mapper;

import com.pojo.Students;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudents {
    //查询所有的学生
    @Select("select * from students")
    public List<Students> findAll();
    //保存学生
    @Insert("insert into students(id,stuname,stuclass) values(#{id},#{stuname},#{stuclass})")
    public void insertStudents(Students students);
}
