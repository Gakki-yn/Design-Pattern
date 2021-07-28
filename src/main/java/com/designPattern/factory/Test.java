package com.designPattern.factory;

public class Test {
    public static void main(String[] args) {
      Phone phone =SimpleFactory.createPhone("小米");
      phone.call();
    }
}