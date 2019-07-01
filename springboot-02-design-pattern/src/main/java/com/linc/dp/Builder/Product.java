package com.linc.dp.Builder;

import lombok.Getter;
import lombok.Setter;

/**
 * 产品实体
 *
 * @author Lin.C
 * @date 2019/5/31 7:20
 */
public class Product {

    @Getter
    @Setter
    private String partA;

    @Getter
    @Setter
    private String partB;

    @Getter
    @Setter
    private String partC;

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}';
    }
}
