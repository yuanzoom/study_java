package study.d2025_2_25;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo01 {
    public static void main(String[] args) {

        //自定义比较器
        TreeMap<Integer,String> treeMap=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        treeMap.put(1,"a");
        treeMap.put(3,"b");
        treeMap.put(2,"d");
        treeMap.put(5,"r");
        treeMap.put(9,"q");
        System.out.println(treeMap);
    }
}
