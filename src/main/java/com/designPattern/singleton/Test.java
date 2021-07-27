package com.designPattern.singleton;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
   for(int i=0;i<50;i++){
       new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println(Thread.currentThread().getName()+"饿汉"+Lazy.getInstance());
           }
       }).start();

   }
   }



}