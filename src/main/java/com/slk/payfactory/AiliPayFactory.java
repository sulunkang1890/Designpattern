package com.slk.payfactory;

public class AiliPayFactory implements  PayFactory{
    public IAccount getAccount() {
        return new AlipayAccount();
    }
}
