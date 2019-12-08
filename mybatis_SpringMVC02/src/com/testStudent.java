package com;

import com.factory.Factory;
import com.mapper.IStudents;
import com.pojo.Students;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class testStudent {

    @Test
    public void show(){
        Factory factory=new Factory();
        SqlSession session=factory.SqlSession();
        IStudents iStudents=session.getMapper(IStudents.class);
        List<Students> list=iStudents.findAll();
        for (Students students:list) {
            System.out.println(students.toString());

        }
    }


}
