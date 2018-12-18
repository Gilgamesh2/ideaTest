package com.zgl.idea.aspect;

import com.mysql.jdbc.exceptions.MySQLTimeoutException;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestABCThread {
    private Object lock = new Object();
    private int count;

    public static void main(String[] args) {
        Date ts = new Date();
        Instant instant = Instant.ofEpochMilli(ts.getTime());
        LocalDateTime res = LocalDateTime.ofInstant(instant, ZoneId.of("Asia/Shanghai"));
        System.out.println(res);

    }

    class Run implements Runnable {
        private String _name = "";
        private int _threadNum;

        public Run(String name, int threadNum) {
            _name = name;
            _threadNum = threadNum;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    while (true) {
                        if (count % 3 == _threadNum - 1) {
                            System.out.println("Count:" + i + ",Thread-Name:"
                                    + _name);
                            count++;
                            lock.notifyAll();
                            break;
                        } else {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }
}
