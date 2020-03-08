package com.slk.decorator.navigationBar;

public enum  NavigationBarEnum {
    QUEESTION(1,"问答"),ARTICLE(2,"文章"),CLASS(3,"精品课"),
    SHOPPING(4,"商城"),HOMEWORK(5,"作业"),GROWWING(6,"成长墙");

    private final int id;
    private final String name;

    private NavigationBarEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
