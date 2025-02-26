package study.d2025_2_25;


import java.util.HashSet;

/* Set集合的去重功能
编写一个Java程序，完成以下任务：

创建一个HashSet，添加10个整数（其中包含重复值）。

遍历并打印所有元素，观察去重效果。

将HashSet转换为TreeSet，并打印排序后的结果。*/
public class SetDemo01 {
    public static void main(String[] args) {
       HashSet<String> hashSet=new HashSet<>();
        hashSet.add("a");
        hashSet.add("d");
        hashSet.add("bc");
        hashSet.add("c");

        hashSet.add("a");
        System.out.println(hashSet);

    }
}
