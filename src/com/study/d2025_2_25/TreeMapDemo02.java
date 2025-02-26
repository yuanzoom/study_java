package study.d2025_2_25;

import java.util.TreeMap;

public class TreeMapDemo02 {
    public static void main(String[] args) {
        TreeMap<Student,String> treeMap=new TreeMap<>();
        Student s1=new Student("zhangsan",29);
        Student s2=new Student("lisi",24);
        Student s3=new Student("zhangsan",23);
        Student s4=new Student("wnagwu",28);
        treeMap.put(s1,"江西");
        treeMap.put(s2,"山东");
        treeMap.put(s3,"福建");
        treeMap.put(s4,"广东");
        treeMap.forEach((key,value)->System.out.println(key+"="+value));
    }
}
