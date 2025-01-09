package study.d2025_1_8;

public class Demo01 {
    public static void main(String[] args) {
        MyArraylist<Integer> list1=new MyArraylist<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1.get(1));
        System.out.println(list1);
    }
}
