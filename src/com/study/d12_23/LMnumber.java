package study.d12_23;

import java.util.Scanner;
import java.util.StringJoiner;

//阿拉伯数字转换
public class LMnumber {
    public static void main(String[] args) {
        //录入1-9的字符串，if有0则置空
        Scanner scanner = new Scanner(System.in);
        String str="";
        while(true){
            str = scanner.next();
            if(checkArr(str)){
                break;
            }
        }
        System.out.println(str);
        String str2=swapChar(str);
        System.out.println(str2);
    }
    public static String swapChar(String str){
        String[] strings={"Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        StringJoiner sj=new StringJoiner(" ");
        for(int i=0;i<str.length();i++){
            sj.add(strings[str.charAt(i)-49]);
        }
        String string=sj.toString();
        return string;
    }

    public static boolean checkArr(String str) {
        if (str.length() > 9) {
            System.out.println("请重新输入，长度超过9");
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if ( c<='0'||c>'9') {
                System.out.println("输入不是合法数字");
                return false;
            }
        }
        return true;
    }
}
