package com.mode.composite;

public abstract class Node {
    protected String name; // 节点命名

    public Node(String name) { // 构造节点，传入节点名。
        this.name = name;
    }

    // 增加后续子节点方法
    protected abstract void add(Node child);

    protected void ls(int space) {
        for (int i = 0; i < space; i++) {
            System.out.print(" ");// 先循环输出n个空格；
        }
        System.out.println(name);// 然后再打印自己的名字。
    }
}