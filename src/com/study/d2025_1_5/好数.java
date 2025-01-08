package study.d2025_1_5;

import java.util.Scanner;

public class 好数 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int count=0;
        int g=0;
        for(int i=1;i<=N;i++) {
            int m=i;
            g=m%10;
            boolean flag=false;
            toop:while(m!=0) {
                if(flag==false&&g%2==1){
                    flag=true;
                    m=m/10;
                    g=m%10;
                }else{
                    break toop;
                }
                if(flag==true&&g%2==0) {
                    flag=false;
                    m=m/10;
                    g=m%10;
                }else{
                    break toop;
                }
                if(g==0&&m==0){
                    count++;
                    break toop;
                }
            }

        }
        System.out.println(count);
    }
}
