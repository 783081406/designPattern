package com.ccjjltx.strategy;

public class Base64Strategy implements Strategy {
    @Override
    public void encrypt() {
        System.out.println("执行Base64加密");
    }
}
