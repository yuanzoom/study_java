package com.study.d12_11;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String say(){
        return name+","+age;
    }
}
