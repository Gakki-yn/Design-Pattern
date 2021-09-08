package com.designPattern.factory.abstractFactory;

import com.designPattern.factory.PC;
import com.designPattern.factory.Phone;

public interface AbstractFactory {
    Phone phoneCall();
    PC pcWork();
}