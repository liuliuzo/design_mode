package com.mode.memento;

public class History {
    private String body; // 用于备忘文章内容

    public History(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
