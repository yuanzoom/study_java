package study.d12_23;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("abc");
        arr.add("cde");
        arr.add("efg");
        arr.add("ghi");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }
}
