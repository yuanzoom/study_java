package study.d12_18;

import java.util.Scanner;

public class Two_arrays {
    public static void main(String[] args) {
        int[][] arr=new int[4][3];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int num=scanner.nextInt();
                arr[i][j]=num;
            }
        }
        int[] arr2=Quarter(arr);
        int sum=0;
        for(int m=0;m<arr2.length;m++){
            System.out.println("第"+(m+1)+"季度的营业额"+arr2[m]);
            sum=sum+arr2[m];
        }
        System.out.println("全年的营业额为"+sum);
    }
    public static int[] Quarter(int[][] arr){
        int[] quarter=new int[4];

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for (int j = 0; j <arr[i].length ; j++) {
                sum=sum+arr[i][j];
            }
            quarter[i]=sum;
        }
        return quarter;
    }

}
