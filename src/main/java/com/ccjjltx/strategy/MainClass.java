package com.ccjjltx.strategy;

public class MainClass {
    public static void main(String[] args) {
//        Strategy stra = new MD5Strategy();
//        stra.encrypt();
        Context context = new Context(new MD5Strategy());
        context.encrypt();
    }
}
