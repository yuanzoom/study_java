package study.d2025_2_26.斗地主1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    //准备牌
    static ArrayList<String > list=new ArrayList<>();

    static{
        String[] color={"♥","♠","♣","♦"};
        String[] number = {"3", "4", "5", "6",
                "7", "8", "9", "10", "J",
                "Q", "K", "A", "2"};
        for(String n:number){
            for(String c:color){
                list.add(n+c);
            }
        }
        list.add("小王");
        list.add("大王");
    }

    public PokerGame(){
        //洗牌
        Collections.shuffle(list);


        //发牌
        ArrayList<String> lord=new ArrayList<>();
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();

        for(int i=0;i<list.size();i++){
            String poker=list.get(i);
            //底牌
            if(i<=2){
                lord.add(poker);
                continue;
            }
            //给三个人轮流发牌
            if(i%3==0){
                player1.add(poker);
            }else if(i%3==1){
                player2.add(poker);
            }else{
                player3.add(poker);
            }
        }

        loopPoker("lord",lord);
        loopPoker("player1",player1);
        loopPoker("player2",player2);
        loopPoker("player3",player3);
    }

    //看牌
    public void loopPoker(String name,ArrayList<String> list){
        System.out.print(name+": ");
        for(String poker:list){
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
