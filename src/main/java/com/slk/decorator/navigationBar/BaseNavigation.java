package com.slk.decorator.navigationBar;

import static com.slk.decorator.navigationBar.DateSourceNavigationBar.navigationBarData;

public class BaseNavigation extends NavigationBar {
    BaseNavigation(){
        navigationBarData.add(NavigationBarEnum.SHOPPING.getName());
        navigationBarData.add(NavigationBarEnum.CLASS.getName());
        navigationBarData.add(NavigationBarEnum.ARTICLE.getName());

    }
    @Override
    public void showmenu() {
        navigationBarData.forEach(item-> System.out.println(item));
    }
}
