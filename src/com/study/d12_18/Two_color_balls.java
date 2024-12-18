package study.d12_18;

import java.util.Random;
import java.util.Scanner;

//双色球系统
public class Two_color_balls {
    public static void main(String[] args) {
        int[] arr1 = new int[7];
        int[] arr2 = new int[7];
        balls(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("请输入你要买的号");
        Myballs(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        int redcount = 0;
        int bulecount = 0;
        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1; j++) {
                if (arr2[i] == arr1[j]) {
                    redcount++;
                }
            }
        }
        if (arr2[arr2.length - 1] == arr1[arr1.length - 1]) {
            bulecount++;
        }
        System.out.println(redcount);
        System.out.println(bulecount);
        if(redcount==6&&bulecount==1){
            System.out.println("中奖1000万");
        }else if(redcount==6){
            System.out.println("中奖500万");
        }else if(redcount==5&&bulecount==1){
            System.out.println("中奖3000");
        }else if(redcount==5||(redcount==4&&bulecount==1)) {
            System.out.println("中奖200");
        }else if(redcount==4||(redcount==3&&bulecount==1)){
            System.out.println("中奖10");
        }else{
            System.out.println("中奖5");
        }
    }

    public static void Myballs(int[] arr) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        for (int i = 0; i < arr.length - 1; ) {
            number = scanner.nextInt();
            boolean flag = RepeatBall(arr, number);
            if (number <= 33 && number >= 1 && !flag) {
                arr[i] = number;
                i++;
            } else if (flag) {
                System.out.println("输入的数重复");
            } else {
                System.out.println("输入的数超出范围");
            }

        }
        number = scanner.nextInt();
        if (number >= 1 && number <= 16) {
            arr[arr.length - 1] = number;
        }
    }

    public static void balls(int[] arr) {
        Random reaballs = new Random();
        for (int i = 0; i < arr.length - 1; ) {
            int number = reaballs.nextInt(33) + 1;
            boolean flag = RepeatBall(arr, number);
            if (!flag) {
                arr[i] = number;
                i++;
            }
        }
        arr[arr.length - 1] = reaballs.nextInt(16) + 1;
    }

    public static boolean RepeatBall(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
