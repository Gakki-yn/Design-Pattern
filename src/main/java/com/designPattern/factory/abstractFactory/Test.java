package com.designPattern.factory.abstractFactory;

public class Test {
    public static void main(String[] args) {

        AbstractFactory miFactory = new XiaoMiFactory();
        miFactory.pcWork();
        miFactory.pcWork();
    }
}