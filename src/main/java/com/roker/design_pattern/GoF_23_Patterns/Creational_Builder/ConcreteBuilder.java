package com.roker.design_pattern.GoF_23_Patterns.Creational_Builder;

/**
 * @Author Roker
 * @Date 2020/08/12 11:10
 * @Title ConcreteBuilder
 * @Description 具体建造者：实现了抽象建造者接口
 */

public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}
