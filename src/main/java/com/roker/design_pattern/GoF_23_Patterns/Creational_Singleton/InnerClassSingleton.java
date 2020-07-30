package com.roker.design_pattern.GoF_23_Patterns.Creational_Singleton;

/**
 * @Author Roker
 * @Date 2020/07/30 17:43
 * @Title InnerClassSingleton
 * @Description 登记式/静态内部类
 */

public class InnerClassSingleton {
    //静态内部类
    private static class SingletonHolder{
        //静态初始化器机制初始化本数据（保证了同步控制，线程安全）
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }
    //私有构造方法
    private InnerClassSingleton(){}
    //获得对象实例
    public static InnerClassSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
