package com.linc.dp.Flyweight;

import lombok.Getter;
import lombok.Setter;

/**
 * 抽象享元角色
 *
 * @author Lin.C
 * @date 2019/6/13 7:14
 */
public abstract class Flyweight {

    @Setter
    @Getter
    // 内部状态
    public String intrinsic;

    // 外部状态
    protected final String extrinsic;

    /**
     * 通过构造方法强制享元角色必须接受一个外部状态参数
     */
    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public abstract void operate(int extrinsic);
}