package com.mode.visitor;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        // 三件商品加入购物车
        List<Acceptable> products = Arrays.asList(
                new Candy("小黑兔奶糖", LocalDate.of(2018, 10, 1), 20.00f),
                new Wine("猫泰白酒", LocalDate.of(2017, 1, 1), 1000.00f),
                new Fruit("草莓", LocalDate.of(2018, 12, 26), 10.00f, 2.5f));

        Visitor discountVisitor = new DiscountVisitor(LocalDate.of(2019, 1, 1));
        // 迭代购物车轮流结算
        for (Acceptable product : products) {
            product.accept(discountVisitor);
        }
        /*
         * 打印输出： 结算日期：2019-01-01 =====糖果【小黑兔奶糖】打折后价格===== ￥18.00 =====酒品【猫泰白酒】无折扣价格=====
         * ￥1,000.00 =====水果【草莓】打折后价格===== ￥12.50
         */
    }
}