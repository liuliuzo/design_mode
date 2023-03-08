package com.mode.decorator;

public class Demo {
    public static void main(String[] args) {
        // 口红包裹粉底，再包裹女友。
        Showable madeupGirl = new Lipstick(new FoundationMakeup(new Girl()));
        madeupGirl.show();
        // 运行结果：涂口红(打粉底(女孩的脸庞))
    }
}
