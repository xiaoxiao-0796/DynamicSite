package com.lovech.dynamicsite.controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by xiaofei on 2017/8/10.
 */
public class Test {

    public static void main(String args[])
    {

        String url = "jdbc:mysql://localhost/dynamicsite";
        String driver = "com.mysql.jdbc.Driver";
        try{
            Class.forName(driver);
        }catch(Exception e){
            System.out.println("无法加载驱动");
        }

        try {
            Connection con = DriverManager.getConnection(url,"root","123456");
            if(!con.isClosed())
                System.out.println("success");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

