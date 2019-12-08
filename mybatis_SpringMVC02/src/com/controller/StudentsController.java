package com.controller;

import com.factory.Factory;
import com.mapper.IStudents;
import com.pojo.Students;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class StudentsController {

    public StudentsController() {
    }

    //插入数据库
    @RequestMapping("/insertStudents")
    public String insertStudents(Students students) {
        Factory factory = new Factory();
        SqlSession session = factory.SqlSession();
        IStudents iStudents = session.getMapper(IStudents.class);
        iStudents.insertStudents(students);
        session.commit();
        return "index.jsp";
    }

    //显示数据
    @RequestMapping("/showStudents")
    public String showStudents(HttpServletRequest request, HttpServletResponse response) {
        List<Students> studentsList;
        Factory factory = new Factory();
        SqlSession session = factory.SqlSession();
        IStudents iStudents = session.getMapper(IStudents.class);
        studentsList = iStudents.findAll();
        request.setAttribute("list", studentsList);
        return "show.jsp";
    }
    //显示数据

    @ResponseBody
    @RequestMapping(value ="/showStudentsJSON")
    public List<Students> showStudentsJSON() {
        List<Students> studentsList;
        Factory factory = new Factory();
        SqlSession session = factory.SqlSession();
        IStudents iStudents = session.getMapper(IStudents.class);
        studentsList = iStudents.findAll();
        System.out.println("调用了showStudentsJSON");
        System.out.println(studentsList);
        return studentsList;
    }

}
