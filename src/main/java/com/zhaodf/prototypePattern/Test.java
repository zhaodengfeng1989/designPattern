package com.zhaodf.prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
//        ConcreteProtype cp = new ConcreteProtype();
//        Person person = cp.getPerson();
//        person.setAge(18);
//        List<String> list = new ArrayList<String>();
//        list.add("zhaodf");
//        person.setList(list);
//        try {
//            ConcreteProtype copy = (ConcreteProtype) cp.clone();
//            System.out.println(copy.getPerson()==cp.getPerson());
//            System.out.println(copy.getPerson().getAge());
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }

        DeepProtype dp = new DeepProtype();
        Person person = dp.getPerson();
        person.setAge(18);
        List<String> list = new ArrayList<String>();
        list.add("zhaodf");
        person.setList(list);

        DeepProtype copy = (DeepProtype) dp.clone();
        System.out.println(copy.getPerson()==dp.getPerson());


        person = dp.getPerson();
        person.setAge(28);
        System.out.println(copy.getPerson().getAge());
    }
}
