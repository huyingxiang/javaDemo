package com.springDemo.test;

import org.omg.CORBA.DATA_CONVERSION;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by huyingxiang on 17/2/21.
 */
public class test {
    public static void main(String[] args) throws Exception{
        String s1 = "20150908";
        String s2 = "20150909";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyymmdd");
        Date date1 = sdf.parse(s1);
        Date date2 = sdf.parse(s2);
        Long sub = date2.getTime()-date1.getTime();
        System.out.print(sub/(1000*60*60*24));
    }
}