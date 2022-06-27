package com.javase;

/**
 * @author ZhangHao
 * data 26/6/2022
 * 这个案例有一个问题，多个案例操控同一个资源，会造成线程不安全，数据出现紊乱
 */
@SuppressWarnings({"all"})
public class TestThread2 implements Runnable {
    private int ticketnum =10;     //购票数量
    //重写run方法
    @Override
    public void run() {
        while (true) {
            if (ticketnum <= 0) {
                break;
            }
            try {
                Thread.sleep(100);    //模拟延时
            } catch (InterruptedException e) {
                e.printStackTrace();
            }   //异常捕获

            System.out.println(Thread.currentThread().getName() + "-->>拿到了第" + ticketnum-- + "--票");
        }
    }
    public static void main(String[] args) {
       TestThread2 ticket = new TestThread2();   //创建对象
        new Thread(ticket,"小明").start();
        new Thread(ticket,"阿三").start();
        new Thread(ticket,"黄牛党").start();
        new Thread(ticket,"菜徐坤").start();

    }
}
