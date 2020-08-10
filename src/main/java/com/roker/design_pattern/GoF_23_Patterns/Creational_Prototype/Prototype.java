package com.roker.design_pattern.GoF_23_Patterns.Creational_Prototype;

/**
 * @Author Roker
 * @Date 2020/07/31 17:17
 * @Title ProtoType
 * @Description 原型模式-抽象原型
 */

public class Prototype implements Cloneable {

    @Override
    public Object clone () {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
