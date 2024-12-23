package study.d12_23;

import java.util.StringJoiner;

public class SJMain {
    public static void main(String[] args) {
        String[] arr={"1","2","3"};
        StringJoiner sj=new StringJoiner(",","[","]");
        for(int i=0;i<arr.length;i++){
            sj.add(arr[i]);
        }
        sj.toString();
        System.out.println(sj);
    }
}
