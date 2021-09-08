package com.designPattern.factory;

import com.designPattern.factory.abstractFactory.AbstractFactory;
import com.designPattern.factory.factoryMethod.FactoryMethod;
import com.designPattern.factory.factoryMethod.XiaoMiFactory;
import com.designPattern.factory.factoryMethod.iPhoneFactory;

public class Test {
    public static void main(String[] args) {
//      Phone phone =SimpleFactory.createPhone("小米");
//      phone.call();
        FactoryMethod xiaomi = new XiaoMiFactory();
        xiaomi.phoneCall();

        FactoryMethod iphone = new iPhoneFactory();
        iphone.phoneCall();


    }
}