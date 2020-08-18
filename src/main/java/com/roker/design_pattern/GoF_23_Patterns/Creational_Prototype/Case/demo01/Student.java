package com.roker.design_pattern.GoF_23_Patterns.Creational_Prototype.Case.demo01;

/**
 * @Author Roker
 * @Date 2020/08/18 16:01
 * @Title Student
 * @Description 原型模式基类-学生类
 */

public class Student implements Cloneable {

    private String name;

    private int age;

    private Hobby hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby=" + hobby +
                '}';
    }


    @Override
    protected Student clone() throws CloneNotSupportedException {
        //浅拷贝
//        return (Student) super.clone();
        //深拷贝
        Student clone = (Student) super.clone();
        clone.hobby = new Hobby();
        return clone;
    }
}
