package com.designPattern.factory;

public class MiPhone implements Phone {

    public MiPhone() {
        this.call();
    }
    @Override
    public void call() {
        System.out.println("xiaomi 打电话");
    }
}