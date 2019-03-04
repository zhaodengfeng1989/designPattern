package com.zhaodf.templatePattern;

public class Test {
    public static void main(String[]args){
        Berverage berverage = new Coffee();
        berverage.create();


        berverage = new Tea();
        berverage.create();
    }
}