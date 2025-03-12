package study.d2025_3_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntFunction;

public class 方法引用Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张三,23");
        list.add("张4,24");
        list.add("张5,25");
        list.add("张6,26");
        list.add("张7,27");
        Student[] students = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String[] str = s.split(",");
                return new Student(str[0], Integer.parseInt(str[1]));
            }
        }).toArray(new IntFunction<Student[]>() {
            @Override
            public Student[] apply(int value) {
                return new Student[value];
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
