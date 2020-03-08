package com.slk.decorator.navigationBar;


import static com.slk.decorator.navigationBar.DateSourceNavigationBar.navigationBarData;

public abstract class NavigationBarDecorator extends NavigationBar {

    private NavigationBar navigationBar;
    public NavigationBarDecorator(NavigationBar navigationBar){
        this.navigationBar=navigationBar;

    }
    @Override
    public void showmenu() {
       navigationBar.showmenu();
    }
}
