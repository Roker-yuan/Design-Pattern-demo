package com.roker.design_pattern.GoF_23_Patterns.Creational_Singleton;

/**
 * @Author Roker
 * @Date 2020/07/30 16:34
 * @Title DoubleCheckedSingleton
 * @Description 双检锁/双重校验锁（DCL，即 double-checked locking）
 */

public class DoubleCheckedSingleton {
    //声明一个私有的对象引用。private保护其不被直接访问修改,static保护本类唯一，volatile保证有线程对该变量修改时,另一个线程中该变量的缓存行无效,读取时直接到内存读
    private static volatile DoubleCheckedSingleton instance;
    //构造函数私有化,使不能从外部创建本类对象
    private DoubleCheckedSingleton(){}

    //使用DCL锁保证线程安全,不需要对整个方法synchronized同步
    public static DoubleCheckedSingleton getInstance(){
        //如果该线程发现该对象未创建
        if (instance == null) {
            //那么首先要和其它线程竞争本类的锁
            synchronized (DoubleCheckedSingleton.class){
                //获得锁以后,才能执行这部分代码
                //这时再次检查是否为null
                //如果还是null,说明自己是第一个竞争到锁的,本线程负责创建对象
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
                //如果不是null了,说明自己这份锁已经是别人用过,创建好对象以后释放出来的
                //这时对象已经被创建过了,本线程什么都不用做,直接释放锁即可
            }
        }
        return instance;
    }
}

/**
 * 这种方式最复杂，性能损失较小但也并非最好，其优势在于在创建对象时能做的事情非常多。*/