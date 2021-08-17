package com.designPattern.factory;

import com.designPattern.factory.FactoryMethod.FactoryMethod;
import com.designPattern.factory.FactoryMethod.XiaoMiFactory;
import com.designPattern.factory.FactoryMethod.iPhoneFactory;

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