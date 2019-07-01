package com.linc.dp.Facade;

/**
 * Component实现类
 *
 * @author Lin.C
 * @date 2019/6/11 9:33
 */
public class ConcreteComponentA implements Component {

    @Override
    public void operation() {
        System.out.println("This is component A operating.");
    }
}
