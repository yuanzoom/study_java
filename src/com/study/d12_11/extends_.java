package com.study.d12_11;

public class extends_ {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
    }
}
class A{
    int n1=100;
    public A() {
        System.out.println("A");
    }
}
class B extends  A{
    public B() {
        System.out.println(super.n1);
    }
}

