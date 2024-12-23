package study.d12_23;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<phone> list=new ArrayList<>();
        phone phone1=new phone("小米",1000);
        phone phone2=new phone("苹果",8000);
        phone phone3=new phone("华为",3999);
        list.add(phone1);
        list.add(phone2);
        list.add(phone3);
        ArrayList<Integer> arr=del(list);
        for (int i = 0; i < arr.size(); i++) {
            phone phone4=list.get(arr.get(i));
            System.out.println(phone4.getName()+" "+phone4.getPrice());
        }

    }
    public static ArrayList<Integer> del(ArrayList<phone> list){
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            phone phone1=list.get(i);
            if(phone1.getPrice()<3000){
                arr.add(i);
            }
        }
        return arr;
    }
}
