package com.designPattern.singleton;

public class Lazy {

    private Lazy(){}
    //默认不会实例化，什么时候用什么时候new
    private static Lazy lazy=null;

   /* public static  Lazy getInstance(){
        if(lazy==null){
            lazy=new Lazy();
        }
        return lazy;
    }*/
    //改进,但是每次调用该方法每次都要检测锁，效率不高。继续改进
   /*   public static synchronized Lazy getInstance(){
        if(lazy==null){
            lazy=new Lazy();
        }
        return lazy;
    }*/
      public static  Lazy getInstance(){
        if(lazy==null){
            //若对象不存在上锁，分配对象
            synchronized (Lazy.class)
            {
                if (lazy==null){
                    lazy=new Lazy();
                }
            }
            lazy=new Lazy();
        }
        return lazy;
    }
}