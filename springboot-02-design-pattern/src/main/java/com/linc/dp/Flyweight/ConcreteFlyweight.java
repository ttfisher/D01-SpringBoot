package com.linc.dp.Flyweight;

/**
 * 实际享元角色
 *
 * @author Lin.C
 * @date 2019/6/13 7:12
 */
public class ConcreteFlyweight extends Flyweight {

    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("I am ConcreteFlyweight, extrinsic :" + extrinsic);
    }
}
