package com.roker.design_pattern.GoF_23_Patterns.Creational_Singleton;

/**
 * @Author Roker
 * @Date 2020/07/30 16:34
 * @Title DoubleCheckedSingleton
 * @Description 双检锁/双重校验锁（DCL，即 double-checked locking）
 */

public class DoubleCheckedSingleton {
    private static volatile DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton(){}

    public static DoubleCheckedSingleton getInstance(){
        if (instance == null) {
            synchronized (DoubleCheckedSingleton.class){
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }
}
