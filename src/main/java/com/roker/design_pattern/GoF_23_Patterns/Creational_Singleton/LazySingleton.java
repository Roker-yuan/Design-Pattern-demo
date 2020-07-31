package com.roker.design_pattern.GoF_23_Patterns.Creational_Singleton;

/**
 * @Author Roker
 * @Date 2020/07/30 15:51
 * @Title LazySingleton
 * @Description 懒汉式单例
 */

public class LazySingleton {
    //声明一个私有的对象引用。private保护其不被直接访问修改,static保护本类唯一，volatile保证有线程对该变量修改时,另一个线程中该变量的缓存行无效,读取时直接到内存读
    //保证 instance 在所有线程中同步
    private static volatile LazySingleton instance = null;
    //构造函数私有化,使不能从外部创建本类对象
    private LazySingleton(){}

    //获得单例实例的静态方法作外部访问点
    //用synchronized修饰为同步,确保多线程环境下只创建这一个对象
    public static synchronized LazySingleton getInstance(){
        //getInstance 方法前加同步
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

/**如果编写的是多线程程序，则不要删除上例代码中的关键字 volatile 和 synchronized，否则将存在线程非安全的问题。
   如果不删除这两个关键字就能保证线程安全，但是每次访问时都要同步，会影响性能，且消耗更多的资源，这是懒汉式单例的缺点。*/
