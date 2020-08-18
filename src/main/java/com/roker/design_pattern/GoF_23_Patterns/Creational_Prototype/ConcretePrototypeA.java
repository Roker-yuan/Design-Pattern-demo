package com.roker.design_pattern.GoF_23_Patterns.Creational_Prototype;

/**
 * @Author Roker
 * @Date 2020/07/31 17:37
 * @Title ConcretePrototypeA
 * @Description 原型模式-具体原型A
 */

public class ConcretePrototypeA extends Prototype{

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void show(){
        System.out.println("具体原型A信息展示：" + this.getName() + "," + this.getAge() + "," + this.getType());
    }

}
