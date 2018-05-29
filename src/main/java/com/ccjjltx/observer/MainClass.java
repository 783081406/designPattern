package com.ccjjltx.observer;

public class MainClass {
    public static void main(String[] args) {
        Person person = new Person();
        //注册观察者
        person.addObserver(new MyObserver());
        person.setName("ccj");
        person.setAge(23);
        person.setSex("男");
    }
}
