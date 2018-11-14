package com.zgl.idea;


import com.zgl.idea.dao.UserDao;
import com.zgl.idea.dao.UserDaoImpl;
import org.omg.CORBA.TIMEOUT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeoutException;

public class New {
    public static void main(String[] args) {

        System.out.println(11);


    }

    public static int[] plusOne(int[] digits) {




        digits[digits.length-1]++;
        return digits;
    }



}


