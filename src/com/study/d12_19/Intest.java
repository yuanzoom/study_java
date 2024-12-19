package study.d12_19;

import java.util.Scanner;

public class Intest {
    public static void main(String[] args) {
        login s=new login();
        s.setName("张祖恩");
        s.setPasswd("3198077036");
        Scanner scanner = new Scanner(System.in);
        int i=0;
        for(i=1;i<=3;i++){
            System.out.println("第"+i+"次登录");
            System.out.println("请输入姓名");
            String name=scanner.next();
            System.out.println("请输入密码");
            String passwd=scanner.next();
            if(name.equals(s.getName())&&passwd.equals(s.getPasswd())){
                System.out.println("登录成功");
                break;
            }
            System.out.println("密码或用户名错误，还剩"+(3-i)+"次");
        }
        if(i>3){
            System.out.println("三次机会用完" );
        }
    }
}
