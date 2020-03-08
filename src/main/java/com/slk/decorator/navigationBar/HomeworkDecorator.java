package com.slk.decorator.navigationBar;

import static com.slk.decorator.navigationBar.DateSourceNavigationBar.navigationBarData;

public class HomeworkDecorator extends NavigationBarDecorator {
    public HomeworkDecorator(NavigationBar navigationBar) {
        super(navigationBar);
        navigationBarData.add(NavigationBarEnum.HOMEWORK.getName());
    }

    @Override
    public void showmenu() {

        super.showmenu();
    }
}
