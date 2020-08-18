package com.roker.design_pattern.GoF_23_Patterns.Creational_Prototype.Case.demo02;

/**
 * @Author Roker
 * @Date 2020/08/18 16:24
 * @Title Rectangle
 * @Description 抽象类的实体类 Rectangle
 */

public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
