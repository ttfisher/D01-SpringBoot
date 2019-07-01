package com.linc.dp.Prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * 原型产品抽象
 *
 * @author Lin.C
 * @date 2019/5/31 7:52
 */
public class Prototype implements Cloneable {

    @Getter
    @Setter
    protected String name;

    public void doSomething() {
        System.out.println("I am : " + name + "; i am working.");
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public Prototype clone() {
        Prototype clone = null;
        try {
            clone = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
