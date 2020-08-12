package com.roker.design_pattern.GoF_23_Patterns.Creational_Builder.Case.demo01;

/**
 * @Author Roker
 * @Date 2020/08/12 15:07
 * @Title ComputerBuilder
 * @Description 构建类
 *              具体电脑构建
 */

public class ComputerBuilder extends Builder {


    @Override
    public Mainframe buildMainframe(String name, String type) {
        System.out.println("完成主机构建：" + name + "-" + type);
        return new Mainframe(name,type);
    }

    @Override
    public Monitor buildMonitor(String name, String type) {
        System.out.println("完成显示器构建：" + name + "-" + type);
        return new Monitor(name,type);
    }

    @Override
    public Keyboards buildKeyboards(String name, String type) {
        System.out.println("完成键鼠套装构建：" + name + "-" + type);
        return new Keyboards(name,type);
    }
}
