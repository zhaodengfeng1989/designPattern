package com.zhaodf.strategyPattern.strategy;

public class CashNomal implements CashSuper {

    public double cashTotal(double total) {
        return total;
    }
}
