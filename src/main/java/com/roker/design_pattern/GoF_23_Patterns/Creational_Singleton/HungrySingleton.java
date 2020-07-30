package com.roker.design_pattern.GoF_23_Patterns.Creational_Singleton;

/**
 * @Author Roker
 * @Date 2020/07/30 16:15
 * @Title HungrySingleton
 * @Description 饿汉式单例
 */

public class HungrySingleton {
    //这里的final主要用来限制变量不允许修改，即instance变量赋值后就不再改变
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }

}

