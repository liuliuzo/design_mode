package com.mode.decorator;

public class FoundationMakeup extends Decorator {

    // 调用化妆品父类注入
    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("打粉底(");
        showable.show();
        System.out.print(")");
    }
}