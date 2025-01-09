package study.d2025_1_6;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Animal> list1=new ArrayList<>();
        ArrayList<Cat> list2=new ArrayList<>();
        ArrayList<Dog> list3=new ArrayList<>();
        keepPet(list1);//父类
//        keepPet(list2);都不是所以不能使用
        keepPet(list3);//本身
    }

    public static void keepPet(ArrayList<? super Dog> list){//本身和父类可以使用

    }
}
