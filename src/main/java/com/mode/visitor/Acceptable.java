package com.mode.visitor;

public interface Acceptable {
    // 主动接受拜访者
    public void accept(Visitor visitor);
}
