package com.slk.gpproxy.client;

public class ChengduHouse implements IHouse {

    protected String str;
    @Override
    public void saleHouse(String name) {
        System.out.println("成都:我要卖房子");
    }
}
