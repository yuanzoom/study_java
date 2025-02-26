package study.d2025_2_25;


import java.util.ArrayList;

/* List集合的基本操作
编写一个Java程序，完成以下任务：

创建一个ArrayList，添加5个字符串元素。

遍历并打印所有元素。

删除第3个元素。

再次遍历并打印所有元素。*/
public class ListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("a");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
