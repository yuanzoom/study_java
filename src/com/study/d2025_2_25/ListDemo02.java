package study.d2025_2_25;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*List集合的排序
编写一个Java程序，完成以下任务：

创建一个ArrayList，添加10个随机整数。

使用Collections.sort()方法对列表进行升序排序。

使用自定义比较器对列表进行降序排序。

分别打印排序后的结果。*/
public class ListDemo02 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(5);
        list.add(7);
        list.add(9);
        //升序
       // Collections.sort(list);
        //利用自定义比较器降序
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

    }
}
