package study.d2025_2_26.斗地主3;

import java.util.*;

public class PokerGame {
    //准备牌
    static ArrayList<String> list = new ArrayList<>();
    //牌的价值
    static HashMap<String, Integer> hm = new HashMap<>();

    static {
        //序号

        String[] color = {"♥", "♠", "♣", "♦"};
        String[] number = {"3", "4", "5", "6",
                "7", "8", "9", "10", "J",
                "Q", "K", "A", "2"};
        for (String n : number) {
            for (String c : color) {
                list.add(c+n);

            }
        }
        list.add(" 小王");
        list.add(" 大王");
        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
        hm.put("小王", 50);
        hm.put("大王", 100);

    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);


        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String index = list.get(i);
            //底牌
            if (i <= 2) {
                lord.add(index);
                continue;
            }
            //给三个人轮流发牌
            if (i % 3 == 0) {
                player1.add(index);
            } else if (i % 3 == 1) {
                player2.add(index);
            } else {
                player3.add(index);
            }
        }


        order(lord);
        order(player1);
        order(player2);
        order(player3);


        loopPoker("lord",lord);
        loopPoker("player1",player1);
        loopPoker("player2",player2);
        loopPoker("player3",player3);
    }

    //看牌
    public void loopPoker(String name, ArrayList<String> list){
        System.out.print(name+": ");
        for(String poker:list){
            System.out.print(poker+" ");
        }
        System.out.println();
    }
    //利用牌的价值进行排序
    //参数：集合
    //♥5 ♥3 ♥6 ♥7 ♥9
    public void order(ArrayList<String> list) {
        Collections.sort(list, new Comparator<String>() {
            //Array.sort （插入排序 + 二分查找）
            @Override
            public int compare(String o1, String o2) {
                //o1：表示当前要插入到有序序列中的牌
                //o2：表示已经在有序序列中存在的牌

                //负数：o1小 插入到前面
                //正数：o1大 插入到后面
                //0：o1的数字跟o2的数字是一样的，需要按照花色再次排序

                //1.计算o1的花色和价值   大王
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);

                //2.计算o2的花色和价值
                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);

                //3.比较o1和o2的价值    ♥3  ♠3
                int i = value1 - value2;
                return i == 0 ? color1.compareTo(color2) : i;

            }
        });
    }

    //计算牌的价值
    //参数：牌
    //返回值：价值
    public int getValue(String poker) {//♥3
        //获取牌上的数字
        String number = poker.substring(1);//把这里截取出来的结果，让这个结果再Map集合中存在 “ 大王”
        //拿着数字到map集合中判断是否存在
        if (hm.containsKey(number)) {
            //存在，获取价值
            return hm.get(number);
        } else {
            //不存在，类型转换
            return Integer.parseInt(number);
        }
    }
}
