package com.example.linhu.studio6test.singleton;

/**
 * Author:linhu
 * Email:lhzheng@grandstream.cn
 * Date:19-4-24
 */
public class Singleton {
    private static Singleton instance;
    private Singleton(){}
    //1. 懒汉模式获取单例模式
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    //2. Double Check Lock（DCL）实现单例
    public static Singleton getInstance2(){
        if(instance ==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    //3. 静态内部类单例模式
    public static Singleton getInstance3(){
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder{
        private static final Singleton sInstance = new Singleton();
    }

    //4. 枚举单例



}
