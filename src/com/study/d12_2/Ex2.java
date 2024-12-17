package com.study.d12_2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        T t = new T();
        t.setName("zhangsan");
        t.setAge(20);
        t.setSalary(6000);
        System.out.println(t.getName() + t.getAge() + t.getSalary());

    }
}

class T {

    public String name;
    private int age;
    private double salary;

    public T() {
    }

    public T(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入密码");

        int password = 123456;
        while (true) {
            int n = scanner.nextInt();
            if (n == password) {
                this.salary = salary;
                break;
            } else {
                System.out.println("请重新输入密码");
            }
        }
    }


}
