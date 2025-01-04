package study.d2025_1_3;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        long status=System.currentTimeMillis();
        int sum1 = 0;
        int sum2 = 0;
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            sum1 += chars1[i];
        }
        for (int i = 0; i < chars2.length; i++) {
            sum2 += chars2[i];
        }
        System.out.println((char)(Math.abs(sum1 - sum2)));
        scan.close();
        long exit=System.currentTimeMillis();
        System.out.println(exit-status);
    }
}
