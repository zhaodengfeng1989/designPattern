package com.zhaodf.factoryMethodPattern;

public class SubFactory implements OperationFactory{
    public Operation createOperation(double numberA, double numberB) {
        return new SubOperation(numberA,numberB);
    }
}
