package com.zhaodf.proxyPattern.jdk;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

public class TestProxy {
    public static void main(String[] args) throws Exception {
        //方法一
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
//        System.out.println(Dengyj.class.getClassLoader());
//
//        GiveGift giveGift = (GiveGift)Proxy.newProxyInstance(
//                Dengyj.class.getClassLoader(),
//                new Class[]{GiveGift.class},
//                new MatchMaker(new Dengyj()));
//        System.out.println(giveGift.getClass().getClassLoader());
//        giveGift.giveChocolate("Angel");
//        giveGift.giveFlower("Angel");
//        giveGift.toString();
//        byte[] proxyClass = ProxyGenerator.generateProxyClass(giveGift.getClass().getSimpleName(), giveGift.getClass().getInterfaces());getInterfaces
//        //将字节码文件保存到D盘，文件名为$Proxy1.class
////        FileOutputStream outputStream = new FileOutputStream(new File("E:\\zdf-pattern\\$Proxy1.class"));
////        outputStream.write(proxyClass);
////        outputStream.flush();
////        outputStream.close();
        //方法一
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        GiveGift giveGift = (GiveGift)Proxy.newProxyInstance(
                Dengyj.class.getClassLoader(),
                new Class[]{GiveGift.class},
                new MatchMaker(new Dengyj()));
        giveGift.giveChocolate("Angel");
        giveGift.giveFlower("Angel");
        giveGift.toString();
    }
}
