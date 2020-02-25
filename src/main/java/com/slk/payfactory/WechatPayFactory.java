package com.slk.payfactory;

public class WechatPayFactory implements  PayFactory {
    public IAccount getAccount() {
        return new WechatAccount();
    }
}
