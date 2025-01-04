package study.d12_25;

public class Lecturer extends Teacher{
    String name="lisi";
    @Override
    public void job(){
        System.out.println("工作");
        T();
    }
    public static void T(){
        System.out.println("讲师");

    }
}
