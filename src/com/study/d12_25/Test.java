package study.d12_25;

public class Test {
    public static void main(String[] args) {
        //继承
        //static修饰的静态属性可以理解成一个共享的属性
        //static修饰的方法只能调用静态方法和静态属性
        //非静态方法都可以调用
        Employee a=new Lecturer();
        System.out.println(a.name);
        Lecturer b=(Lecturer)a;
        System.out.println(b.name);
    }

}
