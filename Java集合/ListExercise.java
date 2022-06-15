package com.javase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author HaoZhang
 * List接口练习
 * 添加10个以上的元素，完成插入、获取、删除、修改等操作，最后使用迭代器遍历集合。
 * 要求使用List的实现类Array List完成
 */

public class ListExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        //使用for循环添加元素
        for (int i = 0; i < 11; i++)
        {
            list.add("hello"+i);
        }
        System.out.println("初始list="+list);    //打印list集合
        //在2号位插入a
        list.add(1,'a');
        System.out.println("插入元素后list="+list);
        //获取第4个元素,使用get方法
        System.out.println("第四个元素为："+list.get(3));//使用索引
            //删除第8个元素
          list.remove(7);
        System.out.println("删除第八个元素后："+list);
          //修改第1个元素为蔡徐坤,使用set
        list.set(0,"蔡徐坤");
        System.out.println("修改第一个元素后："+list);
        //使用迭代器遍历集合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
           Object  obj =  iterator.next();
            System.out.println("使用迭代器遍历后："+obj);
        }

    }
}
