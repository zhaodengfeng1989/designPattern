package com.zhaodf.factoryMethodPattern;

public class AddOperation implements Operation {
    private double numberA;
    private double numberB;

    public AddOperation(double numberA, double numberB){
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public double getResult() {
        return this.numberA+this.numberB;
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
