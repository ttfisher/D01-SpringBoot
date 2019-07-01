package com.linc.dp.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 合成部件
 *
 * @author Lin.C
 * @date 2019/6/11 8:04
 */
public class Component {

    private String name;

    private List<Component> list;

    public Component(String name) {
        this.name = name;
        list = new ArrayList<>();
    }

    public void operation() {
    }

    public void add(Component e) {
        list.add(e);
    }

    public void remove(Component e) {
        list.remove(e);
    }
}
