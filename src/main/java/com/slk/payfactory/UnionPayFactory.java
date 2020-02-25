package com.slk.payfactory;

public class UnionPayFactory implements PayFactory {
    public IAccount getAccount() {
        return  new UnionAccount();
    }
}
