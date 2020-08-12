package com.roker.design_pattern.GoF_23_Patterns.Creational_Builder.Case.demo01;



/**
 * @Author Roker
 * @Date 2020/08/12 15:19
 * @Title Builder
 * @Description 抽象构建
 */

abstract class Builder {
    //创建产品对象
    protected Computer product=new Computer();
    public abstract Mainframe buildMainframe(String name, String type);
    public abstract Monitor buildMonitor(String name, String type);
    public abstract Keyboards buildKeyboards(String name, String type);
    //返回产品对象
    public Computer getComputer()
    {
        return product;
    }
}
