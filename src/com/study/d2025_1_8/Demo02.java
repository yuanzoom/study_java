package study.d2025_1_8;

import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args){
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ListUtil.addAll(list1,"a","b","c");
        System.out.println(list1);
    }
}
