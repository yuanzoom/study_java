package study.d2025_2_25;

import java.util.*;

public class HashMapDemp02 {
    public static void main(String[] args){
        String[] chooes={"A","B","C","D"};
        ArrayList<String> list=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<80;i++){
            int index=random.nextInt(chooes.length);
            list.add(chooes[index]);
        }
        HashMap<String,Integer> map=new HashMap<>();
        for(String name:list){
            if(map.containsKey(name)){
                    int count=map.get(name);
                    count++;
                    map.put(name,count);
            }else{
                map.put(name,1);
            }
        }

        int max=0;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String,Integer> entry:entries){
            int count=entry.getValue();
            if(count>max){
                max=count;
            }
        }
        System.out.println(map);
        System.out.println(max);
        for(Map.Entry<String,Integer> entry:entries){
            String key=entry.getKey();
            int count=entry.getValue();
            if(count==max){
               System.out.println(key);
            }
        }


    }
}
