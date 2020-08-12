package com.roker.design_pattern.GoF_23_Patterns.Creational_Builder.Case.demo01;


/**
 * @Author Roker
 * @Date 2020/08/12 14:33
 * @Title Computer
 * @Description 产品类：电脑
 */

public class Computer {

    /**
     * 主机
     */
    private Mainframe mainframe;

    /**
     * 显示器
     */
    private Monitor monitor;

    /**
     * 键鼠套件
     */
    private Keyboards keyboards;

    /**
     * 组装子组件
     */
    public void install(){
        System.out.println("***新电脑组装开始***");
        mainframe.connection();
        monitor.connection();
        keyboards.connection();
        System.out.println("***新电脑组装完成***");
    }

    public void start(){
        System.out.println("新电脑开机");
    }

    public void info(){
        System.out.println("新电脑参数信息：");
        System.out.println("主机： 品牌：" + mainframe.getBrandName() + ";型号：" + mainframe.getModel());
        System.out.println("显示器： 品牌：" + monitor.getBrandName() + ";型号：" + monitor.getModel());
        System.out.println("键鼠套件： 品牌：" + keyboards.getBrandName() + ";型号：" + keyboards.getModel());
    }

    public Mainframe getMainframe() {
        return mainframe;
    }

    public void setMainframe(Mainframe mainframe) {
        this.mainframe = mainframe;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboards getKeyboards() {
        return keyboards;
    }

    public void setKeyboards(Keyboards keyboards) {
        this.keyboards = keyboards;
    }
}
