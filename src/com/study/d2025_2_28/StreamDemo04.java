package study.d2025_2_28;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StreamDemo04 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);
        Set<String> key=map.keySet();
        key.stream().limit(2).forEach(s->System.out.println(s));
    }
}
