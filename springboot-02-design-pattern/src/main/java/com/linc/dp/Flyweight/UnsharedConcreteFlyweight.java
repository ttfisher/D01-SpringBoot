package com.linc.dp.Flyweight;

/**
 * 实际享元角色（不需要共享）
 *
 * @author Lin.C
 * @date 2019/6/13 7:12
 */
public class UnsharedConcreteFlyweight extends Flyweight {

    public UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("I am UnsharedConcreteFlyweight, extrinsic :" + extrinsic);
    }
}
