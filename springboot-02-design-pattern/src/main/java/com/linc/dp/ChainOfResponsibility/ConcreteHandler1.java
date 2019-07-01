package com.linc.dp.ChainOfResponsibility;

/**
 * 具体的Handler
 *
 * @author Lin.C
 * @date 2019/6/14 7:25
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("A")) {
            System.out.println("I am ConcreteHandler1 dealing request.");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("No handler can deal this request.");
            }
        }
    }
}
