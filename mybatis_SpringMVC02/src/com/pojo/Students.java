package com.pojo;

import java.io.Serializable;

public class Students implements Serializable {
    private Integer id;
    private String stuname,stuclass;

    public Students() {
    }

    public Students(Integer id, String stuname, String stuclass) {
        this.id = id;
        this.stuname = stuname;
        this.stuclass = stuclass;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStuclass() {
        return stuclass;
    }

    public void setStuclass(String stuclass) {
        this.stuclass = stuclass;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", stuname='" + stuname + '\'' +
                ", stuclass='" + stuclass + '\'' +
                '}';
    }
}
