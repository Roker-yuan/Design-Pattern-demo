package com.roker.design_pattern.GoF_23_Patterns.Creational_Builder.Case.demo01;

/**
 * @Author Roker
 * @Date 2020/08/12 15:36
 * @Title ComputerDirector
 * @Description 具体指挥者
 */

public class ComputerDirector {

    /**
     * 持有具体构建者
     */
    private ComputerBuilder builder;

    /**
     * 构造器(传入具体构建者)
     * @param builder
     */
    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer directComputer() {
        //创建子组件
        Mainframe mainframe = builder.buildMainframe("微星", "GE62");
        Monitor monitor = builder.buildMonitor("惠普", "HP592");
        Keyboards keyboards = builder.buildKeyboards("雷蛇", "KEY005");

        //装配成主机
        Computer computer = new Computer();
        computer.setMainframe(mainframe);
        computer.setMonitor(monitor);
        computer.setKeyboards(keyboards);


        return computer;
    }

}
