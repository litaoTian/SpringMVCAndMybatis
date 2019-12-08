package com.factory;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Factory {

    private SqlSessionFactory sqlSessionFactory=null;
    private SqlSession session=null;
    public Factory() {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            session=sqlSessionFactory.openSession();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public SqlSession SqlSession(){
        return session;
    }

    public   void closeSession(){
        if (session !=null){//关闭Sqlsession
            session.close();
        }
    }
}
