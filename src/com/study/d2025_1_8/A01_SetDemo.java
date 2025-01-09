package study.d2025_1_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A01_SetDemo {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        //第一次添加成功返回true
        //第二次添加如果重复返回false
        set.add("abc");
        set.add("efg");
        //迭代器遍历
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //增强for
        /*for (String s : set) {
            System.out.println(s);
        }*/

       // Lambda表达式
        /*set.forEach(s->
            System.out.println(s)
        );*/
    }
}
