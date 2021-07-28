package com.designPattern.factory;

/*
以手机来举例
 */



public class SimpleFactory {

     public static Phone createPhone(String phoneName){
         Phone phone =null;
         switch (phoneName){
             case "魅族":
                 phone= new MEIZU();
                 break;
             case  "小米":
                 phone= new XIAOMI();
                 break;
             case   "苹果":
                 phone = new IPHONE();
                 break;
         }
         return phone;
     }
}

 abstract class Phone{

      public abstract void call();
 }


class  XIAOMI extends Phone {
    @Override
    public void call(){
        System.out.println("小米手机打电话");
    }

}
class  MEIZU extends Phone{
    @Override
    public void call(){
        System.out.println("魅族手机打电话");
    }

}
class  IPHONE  extends Phone{
    @Override
    public void call(){
        System.out.println("IPHONE手机打电话");
    }

}