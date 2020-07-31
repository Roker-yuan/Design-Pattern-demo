package com.roker.design_pattern.GoF_23_Patterns.Creational_Singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author Roker
 * @Date 2020/07/31 15:02
 * @Title ManagerSingleton
 * @Description 登记式管理类
 */

public class ManagerSingleton {
    //线程安全的容器,饿汉式保证容器对象本身为单例
    private static Map<String,Object> MANAGER = new ConcurrentHashMap();
    //外部访问点,传入类名,返回该类的单例对象.该类会被登记进入上面的容器进行单例管理
    //在类中务必保证构造方法私有化,对这一点这个管理类是无法控制的,需要自己保证
    public static Object getInstance(String className) {
        //如果还没登记到容器
        if (!MANAGER.containsKey(className)) {
            //用反射的方式创建对象(因为已经构造函数私有化),并登记到容器中
            try {
                MANAGER.put(className, Class.forName(className).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        //从容器中获取管理的单例对象并返回
        return MANAGER.get(className);
    }
}
