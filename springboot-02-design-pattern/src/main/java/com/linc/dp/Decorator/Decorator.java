package com.linc.dp.Decorator;

/**
 * Decorator
 *
 * @author Lin.C
 * @date 2019/6/11 8:56
 */
public class Decorator implements Component {

    public Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        // 实际上在这里已经可以做装饰了，但为何还要衍生一个子类ConcreteDecorator？还不是太明白
        component.operation();
    }
}
