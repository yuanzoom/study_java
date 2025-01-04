package study.d2025_1_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int a=scan.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=scan.nextInt();
        }
        int sum=scan.nextInt();
        int x=0;
        int y=0;
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<a-1;i++){
            for(int j=i+1;j<a;j++){
                if((arr[i]+arr[j])==sum){
                    x=i;
                    y=j;
                    int m=i+j;
                    arrayList.add(m);
                }
            }
        }
        scan.close();
    }




}


