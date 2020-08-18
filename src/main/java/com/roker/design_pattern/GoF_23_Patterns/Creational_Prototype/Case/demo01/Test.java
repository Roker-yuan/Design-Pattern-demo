package com.roker.design_pattern.GoF_23_Patterns.Creational_Prototype.Case.demo01;

/**
 * @Author Roker
 * @Date 2020/08/18 16:07
 * @Title Test
 * @Description 测试类
 */

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        student.setName("科比");
        student.setAge(36);
        student.setHobby(new Hobby("篮球"));
        System.out.println("原型基类：" + student);
        //克隆
        Student clone = student.clone();
        System.out.println("原型克隆类：" + clone);
        //修改基类属性值
        student.getHobby().setName("足球");
        System.out.println("原型基类修改后：" );
        System.out.println("原型基类：" + student);
        System.out.println("原型克隆类：" + clone);
        //修改克隆类属性值
        clone.getHobby().setName("排球");
        System.out.println("原型克隆类修改后：" );
        System.out.println("原型基类：" + student);
        System.out.println("原型克隆类：" + clone);


    }
}
