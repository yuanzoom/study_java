package study.d2025_3_2;

import java.util.ArrayList;

public class 方法引用Demo02 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("张三",23));
        list.add(new Student("张4",24));
        list.add(new Student("张5",25));
        list.add(new Student("张6",26));
        list.add(new Student("张7",27));

        //方法引用
        String[] strings = list.stream().map(Student::getName).toArray(String[]::new);
        //stream流和匿名内部类
        /*String[] strings = list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        }).toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });*/

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
