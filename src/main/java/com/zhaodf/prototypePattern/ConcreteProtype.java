package com.zhaodf.prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteProtype implements Cloneable  {
    private Person person = new Person();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
