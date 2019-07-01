package com.linc.dp.Decorator;

/**
 * Component实现类
 *
 * @author Lin.C
 * @date 2019/6/11 8:58
 */
public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("I am the ConcreteComponent, i am doing my work.");
    }
}
