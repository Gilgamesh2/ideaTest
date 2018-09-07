package com.zgl.idea;


import com.zgl.idea.dao.UserDao;
import com.zgl.idea.dao.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class New {
    public static void main(String[] args) {

        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoImpl i=(UserDaoImpl)ctx.getBean("userDaoImpl");
        System.out.println(i.get(12));

    }

    public static int[] plusOne(int[] digits) {




        digits[digits.length-1]++;
        return digits;
    }



}


