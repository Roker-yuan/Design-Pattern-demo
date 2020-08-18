package com.roker.design_pattern.GoF_23_Patterns.Creational_Prototype;

/**
 * @Author Roker
 * @Date 2020/07/31 17:39
 * @Title Client
 * @Description 原型模式-客户端
 */

public class Client {
    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        prototype.setName("原型类");
        prototype.setAge(18);
        System.out.println("创建原型基类：" + prototype);
        //克隆
        Prototype clone = prototype.clone();
        System.out.println("复制克隆类：" + clone);
        //判断原型类和克隆类的属性
        System.out.println("基类==克隆类：" + (clone == prototype));
        //改变克隆类属性值
        clone.setName("克隆类");
        System.out.println("复制克隆类-修改后：");
        System.out.println("复制克隆类：" + clone);
        System.out.println("创建原型基类：" + prototype);
    }
}
