package com.mode.visitor;

public interface Visitor {         // 访问者接口
    public void visit(Candy candy);// 糖果重载方法
    public void visit(Wine wine);  // 酒类重载方法
    public void visit(Fruit fruit);// 水果重载方法
}
