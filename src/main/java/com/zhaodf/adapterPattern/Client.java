package com.zhaodf.adapterPattern;

public class Client {
    public static void main(String[] args){
        ThreePhaseElectricalJack threePhaseElectricalJack = new Adapter();
        threePhaseElectricalJack.charge();
    }
}
