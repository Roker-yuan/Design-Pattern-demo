package com.roker.design_pattern.GoF_23_Patterns.Creational_Prototype.Case.demo02;

/**
 * @Author Roker
 * @Date 2020/08/18 16:24
 * @Title Square
 * @Description 抽象类的实体类 Square
 */

public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
