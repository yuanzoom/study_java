package study.d2025_2_26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class 随机点名器Demo02 {
    //随机点名器，并且要求男的概率70%，女的概率30%
    public static void main(String[] args) {
        //创建集合
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        Collections.shuffle(list);
        Random random=new Random();
        int n=random.nextInt(list.size());
        int m=list.get(n);
        System.out.println(m);
        //分别创建男和女的集合
        ArrayList<String> boylist=new ArrayList<>();
        ArrayList<String> girllist=new ArrayList<>();
        Collections.addAll(boylist,"范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼藤");
        Collections.addAll(girllist,"朱益群", "朱穆朗玛峰", "袁明媛");
        if(m==1){
            //男
            int i=random.nextInt(boylist.size());
            String boy=boylist.get(i);
            System.out.println(boy);
        }else{
            //女
            int j=random.nextInt(girllist.size());
            String girl=girllist.get(j);
            System.out.println(girl);
        }
    }
}
