package com.study.d12_10;

public class Account {
    private String name;
    private int salary;
    private String passward;

    public Account() {
    }

    public Account(String name, int salary, String passward) {
        setName(name);
        setSalary(salary);
        setPassward(passward);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 4 && name.length() >= 2) {
            this.name = name;
        } else {
            System.out.println("请重新输入密码");
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 20) {
            this.salary = salary;
        } else {
            System.out.println("余额不足");
        }
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        if (passward.length() == 6) {
            this.passward = passward;
        } else {
            System.out.println("请重新输入密码");
        }
    }
}
