package com.mode.interpret;

public class Move implements Expression {
    // 鼠标位置坐标
    private int x, y;

    public Move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void interpret() {
        System.out.println("移动鼠标：【" + x + "," + y + "】");
    }

}