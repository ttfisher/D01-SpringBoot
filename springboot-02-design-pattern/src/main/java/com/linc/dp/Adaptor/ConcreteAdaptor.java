package com.linc.dp.Adaptor;

/**
 * 适配实现
 *
 * @author Lin.C
 * @date 2019/6/3 7:50
 */
public class ConcreteAdaptor implements Adaptor {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void operation() {
        // 直接通过被适配对象进行操作，但对外接口的兼容性已改变
        adaptee.adaptedOperation();
    }
}
