package com.slk.decorator.navigationBar;

public class Test  {
    public static void main(String[] args) {
        NavigationBar defaultNavigationBar=new BaseNavigation();
        defaultNavigationBar.showmenu();
        System.out.println("===========");
        NavigationBar defaultNavigationBar1=new HomeworkDecorator(defaultNavigationBar);
        defaultNavigationBar1.showmenu();
        System.out.println("===============");
        NavigationBar defaultNavigationBar2=new HomeworkDecorator(defaultNavigationBar1);
        defaultNavigationBar2.showmenu();
        System.out.println("===============");
        NavigationBar defaultNavigationBar3=new HomeworkDecorator(defaultNavigationBar1);
        defaultNavigationBar3.showmenu();
    }
}
