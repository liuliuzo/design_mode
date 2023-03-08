package com.mode.interpret;

import java.util.List;

public class Sequence {

    // 指令集序列
    private List<Expression> expressions;

    public Sequence(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public void interpret() {
        // 循环挨个解析每条指令
        expressions.forEach(exp -> exp.interpret());
    }

}
