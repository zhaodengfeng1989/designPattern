package com.zhaodf.templatePattern;

public abstract class Berverage {
    public final void create(){
        boidWater();
        popMaterialsToCup();
        pourHotWaterToCup();
        addAccessories();
    }

    public void boidWater(){
        System.out.println("=====烧水");
    }

    public abstract void popMaterialsToCup();

    public void pourHotWaterToCup(){
        System.out.println("=====倒入开水");
    }

    public abstract void addAccessories();
}
