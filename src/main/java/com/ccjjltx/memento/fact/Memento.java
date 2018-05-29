package com.ccjjltx.memento.fact;

public class Memento {

    private String name;
    private String sex;
    private int age;

    public Memento() {
    }

    public Memento(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 创建备份
     *
     * @return 备份实例化
     */
    public Memento createMemento() {
        return new Memento(name, sex, age);
    }

    /**
     * 备份还原
     *
     * @param e 实例化
     */
    public void backMenento(Memento e) {
        this.name = e.name;
        this.sex = e.sex;
        this.age = e.age;
    }
}
