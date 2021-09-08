package com.designPattern.factory.factoryMethod;

import com.designPattern.factory.MiPhone;
import com.designPattern.factory.Phone;

public class XiaoMiFactory implements FactoryMethod{

    @Override
    public Phone phoneCall() {
        return new MiPhone();
    }
}