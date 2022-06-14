package com.javase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author HaoZhang
 * 编写一个Collection程序
 * 1.创建3个Dog{name,age}对象，放在Array list中，赋给List引用
 * 2.用迭代器和增强for循环两种方法来遍历
 * 3.重写Dog的toString方法。输出name和age
 */

public class CollectionFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("旺财", 5));
        list.add(new Dog("小黑", 3));
        list.add(new Dog("小白", 2));
        //使用for增强循环遍历
        for(Object Dog :list)
        {
            System.out.println("for循环遍历" + Dog);
        }
        //使用迭代器遍历
        Iterator  iterator = list.iterator();
        while (iterator.hasNext())
        {
            Object Dog =  iterator.next();
            System.out.println("迭代器遍历"+ Dog);
        }
      }
    }
    class Dog{
        private String name;       //名字
        private int age;           //年龄

        public Dog(String name ,int age)
        {
            this.name = name;
            this.age=age;
        }                        //构造器

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        //toString方法
        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

