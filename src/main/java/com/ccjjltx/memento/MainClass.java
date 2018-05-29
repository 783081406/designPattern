package com.ccjjltx.memento;

public class MainClass {
    public static void main(String[] args) {
        Person per = new Person("ccj", "男", 23);

        //保存内部状态
        Person backup = new Person();
        backup.setName(per.getName());
        backup.setSex(per.getSex());
        backup.setAge(per.getAge());

        System.out.println(per.toString());

        //修改
        per.setAge(20);
        System.out.println(per.toString());

        //回滚 还原
        per.setName(backup.getName());
        per.setSex(backup.getSex());
        per.setAge(backup.getAge());

        System.out.println(per.toString());
    }
}
