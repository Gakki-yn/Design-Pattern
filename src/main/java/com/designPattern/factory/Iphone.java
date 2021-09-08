package com.designPattern.factory;

public class Iphone implements Phone{

    public Iphone() {
        this.call();
    }
    @Override
    public void call() {
        System.out.println("iphone 打电话");
    }
}