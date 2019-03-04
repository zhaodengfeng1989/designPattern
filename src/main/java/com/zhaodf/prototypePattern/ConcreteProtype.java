package com.zhaodf.prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteProtype implements Cloneable  {
    private int age;
    private List<String> list = new ArrayList<String>();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
