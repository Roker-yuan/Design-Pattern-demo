package com.roker.design_pattern.GoF_23_Patterns.Creational_Singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author Roker
 * @Date 2020/07/31 14:42
 * @Title RegisterSingleton
 * @Description 登记式单例
 */

public class RegisterSingleton {
    //用ConcurrentHashMap来维护映射关系，线程安全
    private static final Map<String,Object> REGISTER = new ConcurrentHashMap<>();
    static {
        //把RegisterSingleton自己也纳入容器管理
        RegisterSingleton registerSingleton = new RegisterSingleton();
        REGISTER.put(registerSingleton.getClass().getName(),registerSingleton);
    }
    //构造方法私有化
    private RegisterSingleton(){}
    public static Object getInstance(String className){
        //如果传入的类名为空，就返回RegisterSingleton实例
        if (className == null) {
            className = RegisterSingleton.class.getName();
        }
        //如果没有登记就用反射实例化
        if (!REGISTER.containsKey(className)) {
            //没有登记就进入同步块
            synchronized (RegisterSingleton.class){
                //再次检测是否登记
                if (!REGISTER.containsKey(className)) {
                    try {
                        //反射，实例化对象
                        REGISTER.put(className,Class.forName(className).newInstance());
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        //返回单例
        return REGISTER.get(className);
    }
}


