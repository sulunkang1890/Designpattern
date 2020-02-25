package com.slk.payfactory;

public class PayTest {

    public static void main(String[] args) {
         PayFactory payFactory = new AiliPayFactory();
         IAccount iAccount= payFactory.getAccount();
         iAccount.pay();
    }
}
