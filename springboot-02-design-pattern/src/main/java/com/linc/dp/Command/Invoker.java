package com.linc.dp.Command;

import lombok.Getter;
import lombok.Setter;

/**
 * 发送请求者
 *
 * @author Lin.C
 * @date 2019/7/4 8:56
 */
public class Invoker {

    @Getter
    @Setter
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("I am the invoker called...");
        command.execute();
    }
}
