package study.d12_23;

public class Product {
    public static void main(String[] args) {
        String num1="12";
        String num2="3";
        int sum1=result1(num1);
        int sum2=result1(num2);
        int product=sum1*sum2;
        System.out.println(product);
        String str=result2(product);
        System.out.println(str);
    }
    public static int result1(String str){
        char[] c=str.toCharArray();
        int sum=0;
        for(int i=0;i<c.length;i++){
            sum=sum*10+(c[i]-48);
        }
        return sum;
    }
    public static String result2(int str){
        StringBuilder sb=new StringBuilder();
        while(str!=0){
            sb.append(str%10);
            str/=10;
        }
        sb.reverse();
        return sb.toString();
    }
}
