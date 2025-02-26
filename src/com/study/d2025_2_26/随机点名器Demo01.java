package study.d2025_2_26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class 随机点名器Demo01 {
    //随机点名
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "袁明媛");
        Random random = new Random();
        int n = random.nextInt(list.size());
        String name = list.get(n);
        System.out.println(name);

        //打乱
        Collections.shuffle(list);
        String name2 = list.get(0);
        System.out.println(name2);
    }
}
