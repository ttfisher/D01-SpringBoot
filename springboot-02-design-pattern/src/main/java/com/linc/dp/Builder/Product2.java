package com.linc.dp.Builder;

import lombok.Getter;
import lombok.Setter;

/**
 * 简化的建造者
 *
 * @author Lin.C
 * @date 2019/5/31 7:43
 */
public class Product2 {

    @Getter
    @Setter
    private String partA;

    public Product2 partASet(String partA) {
        this.partA = partA;
        return this;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Product2().partASet("I am part A"));
    }
}
