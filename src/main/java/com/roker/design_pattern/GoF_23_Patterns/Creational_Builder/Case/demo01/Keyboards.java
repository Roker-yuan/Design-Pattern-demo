package com.roker.design_pattern.GoF_23_Patterns.Creational_Builder.Case.demo01;

/**
 * @Author Roker
 * @Date 2020/08/12 14:45
 * @Title Keyboards
 * @Description
 */

public class Keyboards {

    /**
     * 品牌
     */
    private String brandName;

    /**
     * 型号
     */
    private String model;


    /**
     * method：安装连接
     */
    public void connection(){
        System.out.println("键鼠套装-连接安装成功！");
    }

    public Keyboards(String brandName, String model) {
        this.brandName = brandName;
        this.model = model;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
