package com.ccjjltx.adapter;

public class Adapter extends Current {
    public void use18V() {
        System.out.println("使用适配器");
        this.user220v();
    }
}
