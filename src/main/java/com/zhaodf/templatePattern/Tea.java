package com.zhaodf.templatePattern;

public class Tea extends Berverage{
    @Override
    public void popMaterialsToCup() {
        System.out.println("=====放入绿茶");
    }

    @Override
    public void addAccessories() {
        System.out.println("=====不用放辅料");
    }
}
