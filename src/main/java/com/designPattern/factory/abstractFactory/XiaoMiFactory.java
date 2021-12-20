package com.designPattern.factory.abstractFactory;

import com.designPattern.factory.MiPhone;
import com.designPattern.factory.PC;
import com.designPattern.factory.Phone;

public class XiaoMiFactory implements AbstractFactory{

    @Override
    public Phone phoneCall() {
        return new MiPhone();
    }

    @Override
    public PC pcWork() {
        return null;
    }


}