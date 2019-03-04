package com.zhaodf.prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        ConcreteProtype cp = new ConcreteProtype();
        cp.setAge(18);
        List<String> list = new ArrayList<String>();
        list.add("zhaodf");
        cp.setList(list);
        try {
            ConcreteProtype copy = (ConcreteProtype) cp.clone();
            System.out.println(copy.getList()==cp.getList());
            System.out.println(copy.getAge());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
