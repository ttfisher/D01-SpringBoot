package com.linc.dp.Prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型产品抽象
 *
 * @author Lin.C
 * @date 2019/6/11 7:52
 */
public class PrototypeExt implements Cloneable {

    @Getter
    @Setter
    private List<String> list = new ArrayList<>();

    public void add(String name) {
        list.add(name);
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "list='" + list + '\'' +
                '}';
    }

    @Override
    public PrototypeExt clone() {
        PrototypeExt clone = null;
        try {
            clone = (PrototypeExt) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
