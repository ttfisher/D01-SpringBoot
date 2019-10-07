package com.linc.client;

import com.linc.dp.Command.ConcreteCommand;
import com.linc.dp.Command.Invoker;

/**
 * 命令模式客户端
 *
 * @author Lin.C
 * @date 2019/7/4 8:58
 */
public class CommandClient {

    public static void main(String[] args) {
        Invoker ir = new Invoker(new ConcreteCommand());
        ir.call();
    }
}
