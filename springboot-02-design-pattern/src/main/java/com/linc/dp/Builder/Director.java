package com.linc.dp.Builder;

import lombok.Getter;
import lombok.Setter;

/**
 * 导演类
 *
 * @author Lin.C
 * @date 2019/5/31 7:28
 */
public class Director {

    @Getter
    @Setter
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 生产产品
     *
     * @return
     */
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
