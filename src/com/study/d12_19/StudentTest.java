package study.d12_19;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        Student[] student = new Student[3];
        System.out.println("请输入要添加的学生信息");
        student=insertId(student);
        student=insertId(student);
        student=insertId(student);
        student=insertId(student);
        printArr(student);
        System.out.println("请输入要删除的学生id");
        student=delId(student);
        printArr(student);
        System.out.println("请输入查询的id");
        selectId(student);
        printArr(student);
    }

    public static void selectId(Student[] arr) {
        Scanner scanner = new Scanner(System.in);
        String select = scanner.next();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            Student s3=arr[i];
            if (s3!=null&&select.equals(s3.getId())) {
                s3.setAge((s3.getAge() + 1));
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("查询失败");
        }
    }

    public static Student[] delId(Student[] arr) {
        Scanner scanner = new Scanner(System.in);
        String delid = scanner.next();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            //Student s3=arr[i];
            if (arr[i] !=null&&delid.equals(arr[i] .getId())) {
                arr[i] = null;
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("删除失败");
        }
        return arr;
    }

    public static int location(Student[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                count=i;
                break;
            }
        }
        return count;
    }

    public static Student[] insertId(Student[] arr) {
        Scanner scanner = new Scanner(System.in);
        int count = Count(arr);
        if (count < arr.length) {
            int i = location(arr);
            System.out.println("还有空位置，请在第" + (i+1)  + "个位置输入同学信息");
            Student s = new Student();
            System.out.println("输入id");
            String id = scanner.next();
            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                Student s3=arr[j];
                if (id.equals(s.getId())) {
                    System.out.println("学生id重复请重新输入");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("输入name");
                String name = scanner.next();
                System.out.println("输入age");
                int age = scanner.nextInt();
                s.setId(id);
                s.setName(name);
                s.setAge(age);
                arr[i] = s;
            }
            return arr;
        } else {
           Student[] newarr = new Student[arr.length + 1];
           for(int i=0;i<arr.length;i++){
               newarr[i]=arr[i];
           }
            Student[] s4=insertId(newarr);
           return s4;
        }
    }

    public static int Count(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            if (s != null) {
                count++;
            }
        }
        return count;
    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            if (s != null) {
                System.out.println(s.getId() + "," + s.getName() + "," + s.getAge());
            }
        }
    }
}
