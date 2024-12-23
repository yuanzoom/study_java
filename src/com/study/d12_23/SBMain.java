package study.d12_23;

import java.util.Scanner;

public class SBMain {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        String s=scanner.next();
//        StringBuilder sb=new StringBuilder();
//        String s1=sb.append(s).reverse().toString();
//        if(s1.equals(s)){
//            System.out.println("是对称");
//        }else{
//            System.out.println("不是对称");
//        }
        int[] arr={1,2,3};
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <arr.length ; i++) {

          if(i==arr.length-1){
              sb.append(arr[i]);
          }
          else{
              sb.append(arr[i]).append(",");
          }

        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
