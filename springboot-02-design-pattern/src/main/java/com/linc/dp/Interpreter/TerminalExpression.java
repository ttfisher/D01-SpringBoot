package com.linc.dp.Interpreter;

/**
 * 终结符表达式类
 *
 * @author Lin.C
 * @date 2019/7/8 7:23
 */
public class TerminalExpression implements AbstractExpression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String info) {
        if (info.indexOf(data) > -1) {
            return true;
        }
        return false;
    }
}