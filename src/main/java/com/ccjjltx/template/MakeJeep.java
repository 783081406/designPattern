package com.ccjjltx.template;

public class MakeJeep extends MakeCar {
    @Override
    public void makeHead() {
        System.out.println("jeep:head");
    }

    @Override
    public void makeBody() {
        System.out.println("jeep:body");
    }

    @Override
    public void makeInstall() {
        System.out.println("jeep:install");
    }
}
