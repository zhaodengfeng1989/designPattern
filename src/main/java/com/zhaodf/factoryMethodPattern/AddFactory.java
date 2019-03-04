package com.zhaodf.factoryMethodPattern;

public class AddFactory implements OperationFactory{
    public Operation createOperation(double numberA, double numberB) {
        return new AddOperation(numberA,numberB);
    }
}
