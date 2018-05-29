package com.ccjjltx.builder;

public class MainClass {
    public static void main(String[] args) {
        //客户直接造房子
/*        House house = new House();
        house.setFloor("地板");
        house.setWall("墙");
        house.setHousetop("屋顶");*/

        //由工程队来修
        HouseBuilder builder = new PingFangBuilder();
        //调用工程队来修理
        builder.makeFloor();
        builder.makeWall();
        builder.makeHousetop();
        House house = builder.getHouse();
        System.out.println(house);
    }
}
