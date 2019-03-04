package com.zhaodf.templatePattern;

public class Coffee extends Berverage{
    @Override
    public void popMaterialsToCup() {
        System.out.println("=====放入咖啡");
    }

    @Override
    public void addAccessories() {
        System.out.println("=====添加牛奶");
    }
}
