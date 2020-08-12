package com.roker.design_pattern.GoF_23_Patterns.Creational_Builder;

/**
 * @Author Roker
 * @Date 2020/08/12 11:16
 * @Title Client
 * @Description 客户类
 */

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
