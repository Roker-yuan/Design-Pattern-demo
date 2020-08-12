package com.roker.design_pattern.GoF_23_Patterns.Creational_Builder.Case.demo01;

/**
 * @Author Roker
 * @Date 2020/08/12 15:45
 * @Title Cilent
 * @Description 客户端
 */

public class Client {
    public static void main(String[] args) {
        //创建Computer组装者(传入Computer构建者)
        ComputerDirector director = new ComputerDirector(new ComputerBuilder());
        Computer computer = director.directComputer();
        computer.install();
        computer.start();
        computer.info();
    }
}
