package study.d12_23;

import java.util.Scanner;

public class Adjust {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入a字符串");
        String s1=scanner.next();
        System.out.println("请输入b字符串");
        String s2=scanner.next();
        int i=0;
        int count=0;
        for(i=1;i<=s1.length();i++){
            s1=endAdjust(s1);
            count++;
            if(s1.equals(s2)){
                System.out.println(true);
                break;
            }
        }
        if(i>s1.length()){
            System.out.println(false);
        }
        System.out.println(count);

    }

    public static String endAdjust(String str) {
        String s1 = str.substring(0, 1);
        String s2 = str.substring(1);
        return s2 + s1;
    }
}
