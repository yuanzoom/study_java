package study.d2025_2_26.斗地主2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    //准备牌
    static ArrayList<Integer> list=new ArrayList<>();
    static HashMap<Integer,String> hm=new HashMap<>();

    static{
        //序号
        int serialNumber = 1;
        String[] color={"♥","♠","♣","♦"};
        String[] number = {"3", "4", "5", "6",
                "7", "8", "9", "10", "J",
                "Q", "K", "A", "2"};
        for(String n:number){
            for(String c:color){
                hm.put(serialNumber,n+c);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber,"小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber,"大王");
        list.add(serialNumber);

    }

    public PokerGame(){
        //洗牌
        Collections.shuffle(list);


        //发牌
        TreeSet<Integer> lord=new TreeSet<>();
        TreeSet<Integer> player1=new TreeSet<>();
        TreeSet<Integer> player2=new TreeSet<>();
        TreeSet<Integer> player3=new TreeSet<>();

        for(int i=0;i<list.size();i++){
            int index=list.get(i);
            //底牌
            if(i<=2){
                lord.add(index);
                continue;
            }
            //给三个人轮流发牌
            if(i%3==0){
                player1.add(index);
            }else if(i%3==1){
                player2.add(index);
            }else{
                player3.add(index);
            }
        }


        loopPoker("lord",lord);
        loopPoker("player1",player1);
        loopPoker("player2",player2);
        loopPoker("player3",player3);
    }

    //看牌
    public void loopPoker(String name, TreeSet<Integer> list){
        System.out.print(name+": ");
        for(int index:list){
            String poker=hm.get(index);
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
