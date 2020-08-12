package com.roker.design_pattern.GoF_23_Patterns.Creational_Builder;

/**
 * @Author Roker
 * @Date 2020/08/12 10:37
 * @Title Product
 * @Description 产品角色：包含多个组成部件的复杂对象
 */

public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void show()
    {
        //显示产品的特性
        System.out.println("产品-Product特性：包含partA、partB、partC");
        System.out.println("产品-Product特性：partA:" + partA);
        System.out.println("产品-Product特性：partB:" + partB);
        System.out.println("产品-Product特性：partC:" + partC);
    }

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
}
