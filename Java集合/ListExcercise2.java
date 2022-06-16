package com.javase;
import java.util.List;
import java.util.ArrayList;

/**
 * @author HaoZhang
 * @ List接口和常用方法
 *     使用List的实现类添加三本图书，并遍历，打印代码中的数据
 *     要求按价格排序，从低到高
 *     要求使用Array List、Link List和vector三种集合实现
 */
@SuppressWarnings({"all"})
public class ListExcercise2 {
    public static void main(String[] args)
    {
        List list = new ArrayList();
        list.add(new Book("三国","罗贯中",88));
        list.add(new Book("西游记","吴承恩",97));
        list.add(new Book("红楼梦","曹雪芹",18));
        list.add(new Book("水浒传","施耐庵",52.6));
          //使用for增强循环遍历
        System.out.println("排序前：");
        for(Object B :list)
        {
            System.out.println(""+B);
        }
        System.out.println("*****************************************************");//分隔符
        //使用冒泡排序
           sort(list);
        System.out.println("排序后：");
        //仍然用for循环遍历打印
        for(Object B :list)
        {
            System.out.println(""+B);
        }


    }
    public static void sort(List list)
    {
        int size= list.size();//
        for (int i = 0; i < size-1; i++) {
            for(int j=0;j<size-1-i;j++)
            {
                //取出对象Book
                Book book1=(Book)list.get(j);
                Book book2=(Book)list.get(j+1);
                //比较交换价格
                if(book1.getPrice()>book2.getPrice()) {
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }
}
