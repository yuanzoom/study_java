package study.d2025_2_26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class 随机点名器Demo03 {
    //随机点名被点过了的不会再点了，只有都点完了再开启第二轮
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list,"范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "袁明媛");
        Random random=new Random();
        int size=list.size();
        for(int j=1;j<=3;j++){
            System.out.println("=====================================");
            for(int i=0;i<size;i++){
                int index=random.nextInt(list.size());
                String name=list.get(index);
                list.remove(name);
                list2.add(name);
                System.out.println(name);
            }
            list.addAll(list2);
            list2.clear();
        }

    }
}
