package com.designPattern.factory.FactoryMethod;

public class iPhoneFactory implements FactoryMethod{
    @Override
    public Phone phoneCall() {
        return new Iphone();
    }
}