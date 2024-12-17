package com.study.d12_11;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("name",20);
        Student student = new Student(2459,95);
        System.out.println(person.say());
        System.out.println(student.say());
    }
}
