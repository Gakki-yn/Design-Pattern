package com.designPattern.factory.FactoryMethod;

public class XiaoMiFactory implements FactoryMethod{

    @Override
    public Phone phoneCall() {
        return new MiPhone();
    }
}