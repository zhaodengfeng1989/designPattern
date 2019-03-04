package com.zhaodf.prototypePattern;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DeepProtype implements Cloneable,Serializable {
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
