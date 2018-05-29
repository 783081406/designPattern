package com.ccjjltx.builder;

public class House {
    private String floor;
    private String wall;
    private String housetop;

    public House(String floor, String wall, String housetop) {
        this.floor = floor;
        this.wall = wall;
        this.housetop = housetop;
    }

    public House() {
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getHousetop() {
        return housetop;
    }

    public void setHousetop(String housetop) {
        this.housetop = housetop;
    }

    @Override
    public String toString() {
        return "House{" +
                "floor='" + floor + '\'' +
                ", wall='" + wall + '\'' +
                ", housetop='" + housetop + '\'' +
                '}';
    }
}
