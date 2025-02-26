//package study.d2025_1_9;
//
//import java.util.HashSet;
//import java.util.LinkedHashSet;
//
//public class A01_HashSetDemo {
//    public static void main(String[] args) {
//        Student s1=new Student("张三",19);
//        Student s2=new Student("张三",19);
//        Student s3=new Student("李四",20);
//        Student s4=new Student("王五",11);
//        Student s5=new Student("abc",13);
//        Student s6=new Student(" 五",15);
//
//        //重写了hashCode方法只要属性值相同即哈希值相同
////        System.out.println(s1.hashCode());
////        System.out.println(s2.hashCode());
//
//        HashSet<Student> hs=new HashSet<>();
//
//        LinkedHashSet<Student> lhs=new LinkedHashSet<>();
//
//        //添加HashSet元素，若元素存在则返回false
//        System.out.println(hs.add(s1));
//        System.out.println(hs.add(s2));
//        System.out.println(hs.add(s3));
//        System.out.println(hs.add(s4));
//        System.out.println(hs.add(s5));
//        System.out.println(hs.add(s6));
//        System.out.println(hs);
//
//        //添加LinkedHashSet元素
//        System.out.println(lhs.add(s1));
//        System.out.println(lhs.add(s2));
//        System.out.println(lhs.add(s3));
//        System.out.println(lhs.add(s4));
//        System.out.println(lhs.add(s5));
//        System.out.println(lhs.add(s6));
//        System.out.println(lhs);
//    }
//}
