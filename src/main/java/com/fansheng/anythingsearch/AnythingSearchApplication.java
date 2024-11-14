package com.fansheng.anythingsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.*;

@SpringBootApplication
public class AnythingSearchApplication {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        SpringApplication.run(AnythingSearchApplication.class, args);
//        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
//        Connection con = DriverManager.getConnection("jdbc:derby:fileData;create=true");
//        Statement statement = con.createStatement();
//        statement.execute("drop table files");
//        statement.execute("create table files( name varchar(512), path varchar(2048))");
//        statement.executeUpdate("insert into files values('123','asdfasdlfkj')");
//        ResultSet resultSet = statement.executeQuery("select * from files");
//        while(resultSet.next()) {
//            System.out.println(resultSet.getString("name"));
//        }


    }



}
