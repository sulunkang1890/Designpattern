package com.slk.gpproxy.client;

public class ChongqingHouse implements IHouse {

    int a;

    @Override
    public String toString() {
        return "ChongqingHouse{" +
                "a=" + a +
                '}';
    }

    @Override
    public void saleHouse(String name) {
        System.out.println("重庆:我要卖房子");
    }
}
