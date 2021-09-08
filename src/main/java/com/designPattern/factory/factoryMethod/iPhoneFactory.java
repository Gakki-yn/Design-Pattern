package com.designPattern.factory.factoryMethod;

import com.designPattern.factory.Iphone;
import com.designPattern.factory.Phone;

public class iPhoneFactory implements FactoryMethod{
    @Override
    public Phone phoneCall() {
        return new Iphone();
    }
}