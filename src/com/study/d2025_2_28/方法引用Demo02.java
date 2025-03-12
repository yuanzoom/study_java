package study.d2025_2_28;

import java.util.ArrayList;
import java.util.Arrays;

public class 方法引用Demo02 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张三,23");
        list.add("张4,24");
        list.add("张5,25");
        list.add("张6,26");
        list.add("张7,27");
        Student[] students = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(students));

    }
}
