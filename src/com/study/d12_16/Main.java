package com.study.d12_16;

public class Main {
    public static void main(String[] args) {
        Object object = new Student();
        System.out.println(object instanceof Student);
        System.out.println(object instanceof Person);
        System.out.println(object instanceof Object);
    }
}
