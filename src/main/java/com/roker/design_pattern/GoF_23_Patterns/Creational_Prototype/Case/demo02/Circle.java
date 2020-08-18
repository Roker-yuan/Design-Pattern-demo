package com.roker.design_pattern.GoF_23_Patterns.Creational_Prototype.Case.demo02;

/**
 * @Author Roker
 * @Date 2020/08/18 16:25
 * @Title Circle
 * @Description 抽象类的实体类 Circle
 */

public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
