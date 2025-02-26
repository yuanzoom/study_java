package study.d2025_1_9;

import java.util.Comparator;
import java.util.TreeSet;

public class A03_TreeSetDemo {
    public static void main(String[] args) {
        Student s1=new Student("b",18,84,88,89);
        Student s2=new Student("a",18,84,88,89);
        Student s3=new Student("c",18,84,88,89);
        Student s4=new Student("e",18,84,88,89);
        Student s5=new Student("d",18,84,88,89);

        TreeSet<Student> tr=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int sum1 = o1.getChineseScore() + o1.getMathScore() + o1.getEnglishScore();
                int sum2 = o2.getChineseScore() + o2.getMathScore() + o2.getEnglishScore();
                int i = 0;
                i = sum2 - sum1;
                i=i==0?o2.getChineseScore()-o1.getChineseScore():i;
                i=i==0?o2.getMathScore()-o1.getMathScore():i;
                i=i==0?o2.getEnglishScore()-o1.getEnglishScore():i;
                i=i==0?o2.getChineseScore()-o1.getChineseScore():i;
                i=i==0?o2.getAge()-o1.getAge():i;
                i=i==0?o2.getName().compareTo(o1.getName()):i;
                return i;
            }
        });

        tr.add(s1);
        tr.add(s2);
        tr.add(s3);
        tr.add(s4);
        tr.add(s5);
        for (Student student : tr) {
            System.out.println(student);
        }

    }
}
