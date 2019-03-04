package com.zhaodf.decoratorPattern;

public class TestDecorator {
    public static void main(String[] args){
        PlayDevil playDevil = new Sunstory();
        PlayDevil playDevilToFish = new MythChangeToBee(playDevil);
        playDevilToFish.playTheDevil();
    }
}
