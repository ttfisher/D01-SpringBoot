package com.linc.dp.Interpreter;

/**
 * 抽象表达式类
 *
 * @author Lin.C
 * @date 2019/7/8 7:21
 */
interface AbstractExpression {

    /**
     * 解释方法
     *
     * @param info
     * @return
     */
    boolean interpret(String info);
}