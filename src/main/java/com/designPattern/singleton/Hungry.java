package com.designPattern.singleton;


/*
 饿汉式：类加载的时候就会实例化，并且创建单例对象(预先加载方式)
 */
public class Hungry {

    private Hungry(){}

    private static final Hungry hungry = new Hungry();

    public static Hungry  getInstance(){
        return hungry;
    }

}