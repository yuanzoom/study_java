package study.d2025_1_8;

import java.util.ArrayList;

public class Demo03 {
    public static void main(String[] args) {
        /*
        *
        * 泛型不具备继承性，但数据具备继承性
        *
        */
        ArrayList<Ye> list1=new ArrayList<>();
        ArrayList<Fu> list2=new ArrayList<>();
        ArrayList<Zi> list3=new ArrayList<>();
        method(list1);
        method(list2);
        method(list3);
        list1.add(new Fu());
        list1.add(new Zi());


    }
    public static<E> void method(ArrayList<E> list){


    }
}
class Ye{

}
class Fu extends  Ye{

}
class Zi extends  Fu{

}
class Student{

}

