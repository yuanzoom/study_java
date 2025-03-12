package study.d2025_3_2;

import java.util.Scanner;

public class exceptionDemo01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        int age=scanner.nextInt();
        boolean index=true;
        while(index){
            try{
                if((name.length()>=3&&name.length()<=10)&&(age>=18&&age<=40)){
                    index=false;
                    System.out.println("输入成功");
                }else{
                    throw new RuntimeException();
                }
            }catch (RuntimeException e){
                System.out.println("输入异常，请重新输入");
                name=scanner.next();
                age=scanner.nextInt();
            }
        }

    }
}
