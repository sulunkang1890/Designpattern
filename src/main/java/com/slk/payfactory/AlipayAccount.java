package com.slk.payfactory;

public class AlipayAccount implements IAccount {
    public AlipayAccount() {
        super();
    }

    public void pay() {
        System.out.println("我习惯用支付宝消费");
    }
}
