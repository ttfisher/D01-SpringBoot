package com.linc.dp.Interpreter;

/**
 * 上下文
 *
 * @author Lin.C
 * @date 2019/7/8 7:24
 */
public class Context {

    private String[] persons = {"张三", "李四"};

    private String[] types = {"男", "女", "未知"};

    public Context() {
        AbstractExpression expression1 = new TerminalExpression("张三");
        AbstractExpression expression2 = new TerminalExpression("李四");
    }

    public void operation(String info) {
    }
}
