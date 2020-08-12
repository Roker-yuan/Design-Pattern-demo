package com.roker.design_pattern.GoF_23_Patterns.Creational_Builder;

/**
 * @Author Roker
 * @Date 2020/08/12 11:13
 * @Title Director
 * @Description 指挥者：调用建造者中的方法完成复杂对象的创建
 */

public class Director {

    private Builder builder;
    //构造方法
    public Director(Builder builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
