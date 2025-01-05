package study.d2025_1_4;

import java.util.Scanner;

public class 奇怪的捐赠 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int total = 1000000;
        int[] powers = new int[8];
        int maxparts = 0;
        for (int i = 0; i < powers.length; i++) {
            powers[i] = (int) Math.pow(7, i);
            System.out.print(powers[i]+"   ");
        }
        System.out.println();
        for (int i = powers.length - 1; i >= 0; i--) {
            int count = Math.min(5, total / powers[i]);
            System.out.print(count+"   ");
            maxparts += count;
            total -= count * powers[i];
            System.out.print("剩余的"+total);
            System.out.println();

        }
        double a=Math.pow(7,2);
        System.out.println(a);
        System.out.println(maxparts);
        scan.close();
    }
}

