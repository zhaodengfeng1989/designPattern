package com.zhaodf.singleton;

public class Singleton4 {
    //1、先声明一个静态内部类
    //private 私有的保证别人不能修改
    //static 保证全局唯一
    private static class  LazyHolder{
        private static final Singleton4 INSTANCE = new Singleton4();
    }
    //将默认构造方法私有化,如果不提供，默认有一个public修饰的某人构造方法，就意味着在代码中随时可以new出来，就不是单例了
    private Singleton4(){

    }
    //3、同样提供静态方法获取实例
    //final 确保别人不能覆盖
    public static final Singleton4 getInstance(){
        //方法中的逻辑，是哟啊在用户调用时候才开始执行的
        //方法中实现逻辑需要分配内存，在调用时候才分配
        return  LazyHolder.INSTANCE;
    }
    //类装载到JVM的过程
    //1、从上往下（声明在前，使用在后
    //2、先属性后方法
    //3、先静态后动态
}
