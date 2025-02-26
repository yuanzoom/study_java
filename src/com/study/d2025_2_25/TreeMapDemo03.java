package study.d2025_2_25;

import java.util.TreeMap;

public class TreeMapDemo03 {
    public static void main(String[] args) {
        String str="aabdjieoshjdjjj";
        TreeMap<Character,Integer> treeMap=new TreeMap<>();
        for(int i=0;i<str.length();i++){
           char c=str.charAt(i);
           if(treeMap.containsKey(c)){
               int count=treeMap.get(c);
               count++;
               treeMap.put(c,count);
           }else{
               treeMap.put(c,1);
           }
        }
        StringBuilder sb=new StringBuilder();
        treeMap.forEach((key,value)->sb.append(key).append("(").append(value).append(")"));
        System.out.println(sb);
    }
}
