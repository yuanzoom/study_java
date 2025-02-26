package study.d2025_2_25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo01 {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();
        Student s1 = new Student("zhangsan", 14);
        Student s2 = new Student("lisi", 15);
        Student s3 = new Student("wangwu", 16);
        hm.put(s1, "山东");
        hm.put(s2, "江西");
        hm.put(s3, "福建");

        //通过键找值遍历
        Set<Student> keys = hm.keySet();
        for(Student key:keys){
            String value=hm.get(key);
            System.out.println(value);
        }

        System.out.println("===========");
        //通过增强for遍历
        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for(Map.Entry<Student,String> entry:entries){
            Student key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"="+value);
        }

        System.out.println("===========");
        //通过Lambda表达式遍历
        hm.forEach((key, value)-> {
                System.out.println(key+"="+value);
            }
        );
    }

}
