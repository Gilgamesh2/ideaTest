package com.zgl.idea.aspect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class MyThread implements Runnable {
    private Integer count;
    private String name;
    static Object object = new Object();
    private Integer integer = 0;

    public MyThread(Integer count, String name) {
        this.count = count;
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println(0 % 3);
        MyThread myThread = new MyThread(1, "A");
        Thread thread = new Thread(myThread);
        thread.start();


        MyThread myThread1 = new MyThread(2, "B");
        Thread thread1 = new Thread(myThread1);
        thread1.start();
        MyThread myThread2 = new MyThread(3, "C");
        Thread thread2 = new Thread(myThread2);
        thread2.start();


    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (object) {
                while (true) {
                    if (integer % 3 == count - 1) {
                        System.out.println(name);
                        integer++;
                        object.notifyAll();
                        break;
                    } else {
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }


//        System.out.println(count);

}
