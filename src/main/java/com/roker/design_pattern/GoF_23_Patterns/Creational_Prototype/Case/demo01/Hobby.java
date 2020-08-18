package com.roker.design_pattern.GoF_23_Patterns.Creational_Prototype.Case.demo01;

/**
 * @Author Roker
 * @Date 2020/08/18 16:02
 * @Title Hobby
 * @Description 学生爱好类
 */

public class Hobby {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby() {
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                '}';
    }
}
