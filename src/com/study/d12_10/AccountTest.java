package com.study.d12_10;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("张三");
        account.setSalary(50);
        account.setPassward("123456");
        System.out.println(account.getName() + account.getSalary());
    }
}
