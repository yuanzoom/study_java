package study.d12_23;

import java.util.Random;
import java.util.Scanner;

public class Dislocate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1=scanner.next();
        String s2=check(s1);
        System.out.println(s2);

    }
    public static String check(String arr){
        char[] s1=arr.toCharArray();
        Random random=new Random();
        for (int i = 0; i <arr.length() ; i++) {
            int num=random.nextInt(arr.length());
            System.out.println(num);
            char swap;
            swap=s1[i];
            s1[i]=s1[num];
            s1[num]=swap;
        }
        String s2= new String(s1);
        return s2;
    }
}
