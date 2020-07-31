package com.roker.design_pattern.GoF_23_Patterns.Creational_Singleton;

/**
 * @Author Roker
 * @Date 2020/07/30 16:15
 * @Title HungrySingleton
 * @Description 饿汉式单例
 */

public class HungrySingleton {
    //这里的final主要用来限制变量不允许修改，即instance变量赋值后就不再改变
    //在类加载时创建对象
    private static final HungrySingleton instance = new HungrySingleton();

    //构造函数私有化,使不能从外部创建本类对象
    private HungrySingleton(){}

    //调用到此方法时类一定已经加载过了,直接返回
    //不需要synchronized同步
    public static HungrySingleton getInstance(){
        return instance;
    }

}

/**在这种方式中，巧妙利用了Java的类装载过程来保证了线程安全，因为这个类只加载一次，所以这个对象一定是唯一的。
   并且因为没有synchronized对访问点的限制，这种方式的访问效率比较高。
   除了要注意内存浪费之外，还应注意到“类装载时”不一定是”第一次调用访问点时”，
   因为类中还可能存在其它的static方法在此前调用导致对象被创建，所以饿汉式不能保证懒加载，可能早在调用其它静态方法时就把这个对象创建好了。*/