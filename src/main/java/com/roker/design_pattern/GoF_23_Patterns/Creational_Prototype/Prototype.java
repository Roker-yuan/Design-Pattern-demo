package com.roker.design_pattern.GoF_23_Patterns.Creational_Prototype;

/**
 * @Author Roker
 * @Date 2020/07/31 17:17
 * @Title ProtoType
 * @Description 原型模式-抽象原型
 */

public class Prototype implements Cloneable {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public Prototype clone () {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
