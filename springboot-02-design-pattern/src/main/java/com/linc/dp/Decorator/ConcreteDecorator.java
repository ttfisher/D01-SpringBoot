package com.linc.dp.Decorator;

/**
 * Decorator添加了装饰的实现类
 *
 * @author Lin.C
 * @date 2019/6/11 8:57
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        // 这里可以做很多事情了，额外调用一些方法什么的都ok
        System.out.println("Wow, I am the decorator itself, i can add sth as i want.");
        super.operation();
    }
}
