package com.linc.dp.Command;

/**
 * 命令实现类
 *
 * @author Lin.C
 * @date 2019/7/4 8:56
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}