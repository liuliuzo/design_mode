package com.mode.decorator;

public abstract class Decorator implements Showable {

    protected Showable showable;

    protected Decorator(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
        showable.show();// 直接调用不做加任何粉饰。
    }

}