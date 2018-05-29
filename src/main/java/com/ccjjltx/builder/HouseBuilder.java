package com.ccjjltx.builder;

public interface HouseBuilder {
    //修地板
    void makeFloor();

    //修墙
    void makeWall();

    //修屋顶
    void makeHousetop();

    House getHouse();
}
