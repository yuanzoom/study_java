package study.d12_24;

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students=new ArrayList<>();
        menu();
        while(true) {
            int choose = scanner.nextInt();
            if (choose == 1) {
                System.out.println("-----------添加数据------------");
                add(students);
                menu();
            } else if (choose == 2) {
                System.out.println("-----------删除数据------------");
                System.out.println("请输入要删除的id");
                String delid = scanner.next();
                del(students, delid);
                menu();
            }else if(choose==3){
                System.out.println("-----------修改数据------------");
                System.out.println("请输入要修改的学生信息id");
                String updateid=scanner.next();
                update(students,updateid);
                menu();
            }else if(choose==4){
                System.out.println("-----------查询数据------------");
                System.out.println("请输入要查询的id");
                String selectid=scanner.next();
                Student s=select(students,selectid);
                if(s!=null){
                    System.out.println(s.getId()+"     "+s.getName()+"    "+
                            s.getAge()+"     "+s.getAddress());
                }else{
                    System.out.println("当前无学生信息，请添加后再查询");
                    System.out.println();
                }
                menu();
            }else if(choose==5) {
                selectAll(students);
                menu();
            }else if(choose==6){
                break;
            }else{
                System.out.println("没有这个功能，请查询输入");
                continue;
            }
        }
    }
    //输入方法
    public static Student scanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生id");
        String id=scanner.next();
        System.out.println("请输入学生姓名");
        String name=scanner.next();
        System.out.println("请输入学生年龄");
        int age=scanner.nextInt();
        System.out.println("请输入学生家庭地址");
        String address=scanner.next();
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        return student;
    }
    //初始菜单
    public static void menu(){
        System.out.println("--------欢迎来到学生管理系统-----------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：查询所有学生数据");
        System.out.println("6：退出");
        System.out.println("请输入你的选择：");
    }
    //添加数据
    public static void add(ArrayList<Student> students){
        Student inputstu=scanner();
        boolean flag=true;
        for (int i = 0; i <students.size() ; i++) {
            Student s=students.get(i);
            if(s.getId().equals(inputstu.getId())){
                System.out.println("学生id已存在");
                System.out.println();
                flag=false;
                break;
            }
        }
        if(flag){
            students.add(inputstu);
        }
    }
    //删除数据
    public static void del(ArrayList<Student> students,String id){
        int i=0;
        for (i = 0; i <students.size(); i++){
            Student s=students.get(i);
            if(s.getId().equals(id)){
                students.remove(i);
                break;
            }
        }
        if(i>=students.size()){
            System.out.println("要删除的id不存在");
            System.out.println();
        }
    }
    //修改
    public static void update(ArrayList<Student> students,String id){
        Scanner scanner = new Scanner(System.in);
        boolean flag=true;
        for (int i = 0; i <students.size() ; i++) {
            Student student=students.get(i);
            if(student.getId().equals(id)){
                flag=false;
                //存在就修改
                System.out.println("请输入修改学生姓名");
                String name=scanner.next();
                System.out.println("请输入修改学生年龄");
                int age=scanner.nextInt();
                System.out.println("请输入修改学生家庭地址");
                String address=scanner.next();
                student.setName(name);
                student.setAge(age);
                student.setAddress(address);
            }
        }
        if(flag){
            System.out.println("要修改的学生id不存在");
            System.out.println();
        }
    }
    //查询单个id
    public static Student select(ArrayList<Student> students,String id){
        Student student = new Student();
        boolean flag=true;
        for (int i = 0; i < students.size(); i++) {
            student=students.get(i);
            if(student.getId().equals(id)){
                flag=false;
                break;
            }
        }
        if(flag){
            return null;
        }else{
            return student;
        }
    }
    //查询所有数据
    public static void selectAll(ArrayList<Student> students){
        System.out.println("id          姓名      年龄      家庭住址");
        for (int i = 0; i <students.size() ; i++) {
            Student s=students.get(i);
            System.out.println(s.getId()+"     "+s.getName()+"    "+
                    s.getAge()+"     "+s.getAddress());
        }
    }
}
