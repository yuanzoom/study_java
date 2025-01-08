package study.d2025_1_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class A01_集合类 {
    public static void main(String[] args) {
        //Collection类是一个接口，不能直接创建他的对象
        List<String> coll=new ArrayList<>();
        //添加元素
        //List里面元素可重复，所以方法永远返回true
        //Set里面元素不可重复，当元素存在时返回true，不存在时返回false
        coll.add("a");
        coll.add("bbb");
        coll.add("c");
        coll.add("d");

        ListIterator<String> it=coll.listIterator();
        while(it.hasNext()){

            String str=it.next();
            if("bbb".equals(str)){
                it.add("qqq");
            }

        }
        System.out.println(coll);
        //Lambda表达式
        //利用匿名内部类
        /*coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        //表达式->
        /*coll.forEach( s->
            System.out.println(s)
        );*/
        /*for (String s:coll) {
            System.out.println(s);
        }*/
        /*//获取迭代器对象，默认指向集合的0索引
        Iterator<String> it=coll.iterator();
        //利用循环不断的获取集合中的每一个元素
        while(it.hasNext()){
            //next获取元素，并且移动指针
            String str=it.next();
            System.out.println(str);
        }*/
       /* //集合长度
        System.out.println(coll.size());
        System.out.println(coll);
        //移除元素
        //移除成功返回true，失败返回false
        System.out.println(coll.remove("ac"));
        System.out.println(coll);
        //判断是否包含
        //包含返回true,失败返回false
        System.out.println(coll.contains("c"));
        //判断是否为空，不是空返回false
        System.out.println(coll.isEmpty());
        //清空集合
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());*/

    }
}
