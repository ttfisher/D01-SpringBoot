package com.linc.dp.Interpreter;

/**
 * 非终结符表达式类
 *
 * @author Lin.C
 * @date 2019/7/8 7:23
 */
public class NonterminalExpressionOr implements AbstractExpression {

    private AbstractExpression expression1;

    private AbstractExpression expression2;

    public NonterminalExpressionOr(AbstractExpression expression1, AbstractExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String info) {
        return expression1.interpret(info) || expression2.interpret(info);
    }
}
