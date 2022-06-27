package com.javase;
/**
 @Author HaoZhang
 @Data 2022.6.25
 */
//创建一个多线程，继承Thread类，重写run方法，调用Start开启线程
public class TestThread1 extends Thread{
    @Override
    public void run() {
        super.run();     //run方法线程体
        for (int i = 0; i < 10; i++) {
            System.out.println("我在看代码********"+i);
        }
    }
    public static void main(String[] args) {
       TestThread1 testThread1 = new TestThread1();
       //方法开启线程
       testThread1.start();   //调用start方法
        testThread1.run();      //调用start方法
        for (int i = 0; i < 10; i++) {
            System.out.println("我在学习多线程*******"+i);
        }
    }
}
