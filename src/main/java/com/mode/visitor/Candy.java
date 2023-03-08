package com.mode.visitor;

import java.time.LocalDate;

public class Candy extends Product implements Acceptable { // 糖果类
    public Candy(String name, LocalDate producedDate, float price) {
        super(name, producedDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);// 把自己交给拜访者。
    }
}