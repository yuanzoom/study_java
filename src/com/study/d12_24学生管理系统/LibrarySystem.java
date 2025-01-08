package study.d12_24学生管理系统;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Information> user=new ArrayList<>();
        menu1();
        toop:while(true){
            int choose1 = scanner.nextInt();
            if (choose1 == 1) {
                System.out.println("-----------注册------------");
                enroll(user);
                System.out.println("=================================");
                menu1();
            } else if (choose1 == 2) {
                System.out.println("-----------登录------------");
                boolean flag=login(user);
                if(flag){
                    System.out.println("登录成功");
                    ArrayList<Student> students=new ArrayList<>();
                    menu2();
                    while(true) {
                        int choose2 = scanner.nextInt();
                        if (choose2 == 1) {
                            System.out.println("-----------添加数据------------");
                            add(students);
                            menu2();
                        } else if (choose2 == 2) {
                            System.out.println("-----------删除数据------------");
                            System.out.println("请输入要删除的id");
                            String delid = scanner.next();
                            del(students, delid);
                            menu2();
                        }else if(choose2==3){
                            System.out.println("-----------修改数据------------");
                            System.out.println("请输入要修改的学生信息id");
                            String updateid=scanner.next();
                            update(students,updateid);
                            menu2();
                        }else if(choose2==4){
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
                            menu2();
                        }else if(choose2==5) {
                            selectAll(students);
                            menu2();
                        }else if(choose2==6){
                            break;
                        }else{
                            System.out.println("没有这个功能，请查询输入");
                            continue;
                        }
                    }
                }
                System.out.println("=================================");
                menu1();
            }else if(choose1==3){
                System.out.println("-----------修改密码------------");
                revisePasswd(user);
                System.out.println("=================================");
                menu1();
            }else if(choose1==4){
                System.out.println("-----------查看用户信息------------");
                printUser(user);
                System.out.println("=================================");
                menu1();
            }else if(choose1==5) {
               break;
            }else {
                System.out.println("没有这个选项，请重新输入");
                continue toop;
            }
        }
    }
    //注册所有流程
    public static void enroll(ArrayList<Information> user){
        Information person=new Information();
        checkUsername(person);
        checkPasswd(person);
        checkPersonid(person);
        checkPhonenum(person);
        int i=0;
        for (i = 0; i < user.size(); i++) {
            Information person2=user.get(i);
            if(person2.getPersonid().equals(person.getPersonid())){
                System.out.println();
                System.out.println("身份证号已注册,注册失败");
                break;
            }else if(person2.getPhonenum().equals(person.getPhonenum())) {
                System.out.println("手机号已注册，注册失败");
                break;
            }
        }
        if(i==user.size()){
            user.add(person);
            System.out.println("注册成功");
        }

    }
    //注册登录菜单
    public static void menu1() {
        System.out.println("--------欢迎来到学生管理系统-----------");
        System.out.println("1：注册");
        System.out.println("2：登录");
        System.out.println("3：修改密码");
        System.out.println("4：查看用户信息");
        System.out.println("5：退出");
        System.out.println("请输入你的选择：");
    }
    //验证码
    public static String Captcha(){
        StringBuilder sb=new StringBuilder();
        String[] str = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
                "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i",
                "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Random random=new Random();
        int number=random.nextInt(10);
        for (int i = 1; i <=4; i++) {
            int m=random.nextInt(52);
            sb.append(str[m]);
        }
        String string=sb.toString()+number;
        char[] chars=string.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            int n=random.nextInt(chars.length);
            char swap;
            swap = chars[i];
            chars[i] = chars[n];
            chars[n] = swap;
        }
        return new String(chars);
    }
    //登录
    public static boolean login(ArrayList<Information> user){
        Scanner scanner = new Scanner(System.in);
        System.out.println("登录请输入用户名");
        String username= scanner.next();
        System.out.println("登录请输入密码");
        String passwd= scanner.next();
        String s=Captcha();
        System.out.println("验证码："+s);
        System.out.println("请输入验证码");
        String captcha= scanner.next();
        for (int i = 0; i < user.size(); i++) {
            Information person=user.get(i);
            if (person.getUsername().equals(username) && person.getPasswd().equals(passwd)&&captcha.equals(s)) {
                return true;
            }
        }
        System.out.println("登录失败，请重新登录");
        return false;
    }
    //修改密码，录入用户名判断是否存在，存在则录入身份证号和手机号修改密码
    //不存在提示没有这个信息
    public static void revisePasswd(ArrayList<Information> user){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改密码的用户名");
        String username= scanner.next();
        int i=0;
                for (i = 0; i < user.size(); i++) {
                    Information person=user.get(i);
                    if(person.getUsername().equals(username)){
                        //录入身份证号和手机号修改密码
                        System.out.println("用户名正确，请输入身份证号码确认");
                        String personid= scanner.next();
                        System.out.println("请输入手机号确认");
                        String phonenum= scanner.next();
                        if(person.getPersonid().equals(personid)&&person.getPhonenum().equals(phonenum)){
                    System.out.println("请输入需要修改的密码");
                    String passwd= scanner.next();
                    person.setPasswd(passwd);
                    System.out.println("密码修改成功");
                }else{
                    System.out.println("信息不一致，修改失败");
                }
                break;
            }
        }
        if(i==user.size()){
            System.out.println("用户不存在，未注册");
        }
    }
    //遍历注册使用者信息
    public static void printUser(ArrayList<Information> user){
        System.out.println("姓名\t\t密码\t\t身份证号\t\t\t\t手机号\t\t\t");
        for (int i = 0; i <user.size() ; i++) {
            Information person=user.get(i);
            System.out.println(person.getUsername()+"\t"+person.getPasswd()+"\t"+
                    person.getPersonid()+"\t"+person.getPhonenum());
        }
    }
    //注册手机号验证
    public static void checkPhonenum(Information person) {
        Scanner scanner = new Scanner(System.in);
        toop:while (true) {
            System.out.println("请输入手机号");
            String phonenum = scanner.next();
            if (phonenum.length() != 11) {
                System.out.println("手机号长度不正确");
                continue;
            }
            char c =phonenum.charAt(0);
            if (c == '0') {
                System.out.println("手机号第一个数字是0");
                continue;
            }
            char[] chars = phonenum.toCharArray();
            for (int i = 0; i < phonenum.length(); i++) {
                if ((chars[i] < '0' || chars[i] > '9')) {
                    System.out.println("手机号里面有不是数字的");
                    continue toop;
                }
            }
            System.out.println("手机号输入正确");
            person.setPhonenum(phonenum);
            break;
        }
    }

    //注册输入身份证号验证
    public static void checkPersonid(Information person) {
        Scanner scanner = new Scanner(System.in);
        toop:
        while (true) {
            System.out.println("请输入身份证号");
            String personid = scanner.next();
            if (personid.length() != 18) {
                System.out.println("身份证号长度不正确");
                continue;
            }
            char c = personid.charAt(0);
            if (c == '0') {
                System.out.println("身份证号第一个数字是0");
                continue;
            }
            char[] chars = personid.toCharArray();
            int length = personid.length();
            int i = 0;
            for (i = 0; i < length - 1; i++) {
                if ((chars[i] < '0' || chars[i] > '9')) {
                    System.out.println("身份证号里面有不是数字的");
                    continue toop;
                }
            }
            if ((chars[length - 1] == 'X' || chars[length - 1] == 'x') ||
                    (chars[length - 1] >= '0' && chars[length - 1] <= '9')) {
                System.out.println("身份证号输入正确");
                person.setPersonid(personid);
                break ;
            } else {
                System.out.println("身份证号最后一位不符合要求");
                continue;
            }
        }
    }

    //注册输入密码验证
    public static void checkPasswd(Information person) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("密请输入注册码");
            String passwd1 = scanner.next();
            System.out.println("请再输入一次确认注册密码");
            String passwd2 = scanner.next();
            if (passwd1.equals(passwd2)) {
                System.out.println("设置密码成功");
                person.setPasswd(passwd1);
                break;
            }
            System.out.println("密码不一致，请重新输入");
        }

    }

    //注册输入用户名验证
    public static void checkUsername(Information person) {
        Scanner scanner = new Scanner(System.in);
        int countletter = 0;
        int countnumber = 0;
        while (true) {
            System.out.println("请输入注册用户名");
            String username = scanner.next();
            int length = username.length();
            char[] chars = username.toCharArray();
            if (length > 15 || length < 3) {
                System.out.println("当前用户名长度不符合");
                continue;
            }
            int i = 0;
            for (i = 0; i < length; i++) {
                if ((chars[i] >= 'A' && chars[i] <= 'Z') || (chars[i] >= 'a' && chars[i] <= 'z')) {
                    countletter++;
                } else if ((chars[i] >= '0' && chars[i] <= '9')) {
                    countnumber++;
                } else {
                    System.out.println("当前用户名不符合条件");
                    continue;
                }
            }
            if (countletter <= 0) {
                System.out.println("用户名至少需包括一个字母");
                continue;
            }
            if (i == length) {
                person.setUsername(username);
                break;
            }
        }

    }

    //输入方法
    public static Student scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生id");
        String id = scanner.next();
        System.out.println("请输入学生姓名");
        String name = scanner.next();
        System.out.println("请输入学生年龄");
        int age = scanner.nextInt();
        System.out.println("请输入学生家庭地址");
        String address = scanner.next();
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        return student;
    }

    //初始菜单
    public static void menu2() {
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
    public static void add(ArrayList<Student> students) {
        Student inputstu = scanner();
        boolean flag = true;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getId().equals(inputstu.getId())) {
                System.out.println("学生id已存在");
                System.out.println();
                flag = false;
                break;
            }
        }
        if (flag) {
            students.add(inputstu);
        }
    }

    //删除数据
    public static void del(ArrayList<Student> students, String id) {
        int i = 0;
        for (i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getId().equals(id)) {
                students.remove(i);
                System.out.println("删除成功");
                break;
            }
        }
        if (i >students.size()) {
            System.out.println("要删除的id不存在");
            System.out.println();
        }
    }

    //修改
    public static void update(ArrayList<Student> students, String id) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId().equals(id)) {
                flag = false;
                //存在就修改
                System.out.println("请输入修改学生姓名");
                String name = scanner.next();
                System.out.println("请输入修改学生年龄");
                int age = scanner.nextInt();
                System.out.println("请输入修改学生家庭地址");
                String address = scanner.next();
                student.setName(name);
                student.setAge(age);
                student.setAddress(address);
            }
        }
        if (flag) {
            System.out.println("要修改的学生id不存在");
            System.out.println();
        }
    }

    //查询单个id
    public static Student select(ArrayList<Student> students, String id) {
        Student student = new Student();
        boolean flag = true;
        for (int i = 0; i < students.size(); i++) {
            student = students.get(i);
            if (student.getId().equals(id)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return null;
        } else {
            return student;
        }
    }

    //查询所有数据
    public static void selectAll(ArrayList<Student> students) {
        System.out.println("id          姓名      年龄      家庭住址");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getId() + "     " + s.getName() + "    " +
                    s.getAge() + "     " + s.getAddress());
        }
    }
}
