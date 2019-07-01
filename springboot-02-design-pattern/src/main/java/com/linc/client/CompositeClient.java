package com.linc.client;

import com.linc.dp.Composite.Component;
import com.linc.dp.Composite.Leaf;

/**
 * 组合模式客户类
 *
 * @author Lin.C
 * @date 2019/6/11 8:12
 */
public class CompositeClient {

    public static void main(String[] args) {

        Component leaf1A = new Leaf("Level 1-A");
        Component leaf1B = new Leaf("Level 1-B");

        Component componentB = new Component("Level 2");
        componentB.add(leaf1A);
        componentB.add(leaf1B);

        Component componentA = new Component("Level 3");
        componentA.add(componentB);

        System.out.println(componentA);
    }
}
