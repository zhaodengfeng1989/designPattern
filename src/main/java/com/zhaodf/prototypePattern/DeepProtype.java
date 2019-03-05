package com.zhaodf.prototypePattern;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DeepProtype implements Serializable{
    private Person person = new Person();

    protected Object clone() {
        //序列化
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        //反序列化
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtype dp = (DeepProtype) ois.readObject();
            return dp;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
