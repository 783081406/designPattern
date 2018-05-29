package com.ccjjltx.builder;

public class PingFangBuilder implements HouseBuilder {
    private House house = new House();

    @Override
    public void makeFloor() {
        house.setFloor("平房-->地板");
    }

    @Override
    public void makeWall() {
        house.setWall("平房-->墙");
    }

    @Override
    public void makeHousetop() {
        house.setHousetop("平房-->屋顶");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
