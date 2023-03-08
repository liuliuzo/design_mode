package com.mode.visitor;

import java.time.LocalDate;

public class Fruit extends Product implements Acceptable {// 水果
    private float weight;

    public Fruit(String name, LocalDate producedDate, float price, float weight) {
        super(name, producedDate, price);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);// 把自己交给拜访者。
    }
}