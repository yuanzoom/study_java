package study.d2025_2_24;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapAPI {
    public static void main(String[] args){
        Map<String,String> m=new HashMap<>();
        m.put("a","1");
        m.put("b","2");
        m.put("c","3");
        //通过键找值
        //获取中所有的键，把这些键放到一个单列集合
        //Set<String> keys=m.keySet();
        //增强for遍历
       /* for (String key:keys) {
            String value=m.get(key);
            System.out.println(value);
        }*/

        //迭代器遍历

        /*Iterator<String> it=keys.iterator();
        while(it.hasNext()){
            String s=it.next();
            String value=m.get(s);
            System.out.println(value);
        }*/

        //Lambda表达式遍历
        /*m.forEach((key,value)->{
            System.out.println(value);
        });*/



        //遍历键值对
        //增强for遍历
        Set<Map.Entry<String, String>> entries = m.entrySet();
        for(Map.Entry<String,String> entry:entries){
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
