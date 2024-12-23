package study.d12_22;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int str=scanner.nextInt();
        System.out.println(str);
        String result="";
        while(true){
            int ge=str%10;
            str=str/10;
            String s1=Convert(ge);
            result=s1+result;
            if(str==0){
                break;
            }
        }
        System.out.println(result);
        int count=7-result.length();
        for (int i = 0; i < count; i++) {
            result="零"+result;
        }
        String[] s2={"百","十","万","千","百","十","元"};
        char c;
        String s3="";
        for (int i = 0; i <7 ; i++) {
            c=result.charAt(i);
            s3=s3+c+s2[i];
        }
        System.out.println(s3);
    }
    public static String Convert(int number){
        String[] arr={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}
