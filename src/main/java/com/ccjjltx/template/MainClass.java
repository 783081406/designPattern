package com.ccjjltx.template;

public class MainClass {
    public static void main(String[] args) {
        MakeCar bus = new MakeBus();
        bus.makeHead();
        bus.makeBody();
        bus.makeInstall();
        System.out.println("============================");
        MakeCar jeep = new MakeJeep();
        jeep.makeHead();
        jeep.makeBody();
        jeep.makeInstall();
    }
}
