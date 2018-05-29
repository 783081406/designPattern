package com.ccjjltx.template;

public class MakeBus extends MakeCar {
    @Override
    public void makeHead() {
        System.out.println("head");
    }

    @Override
    public void makeBody() {
        System.out.println("body");
    }

    @Override
    public void makeInstall() {
        System.out.println("install");
    }
}
