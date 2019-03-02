package com.linc.single.p201;

import java.util.Random;

/**
 * 模拟演示jvisualvm的BTrace插件的使用
 *
 * @Author Lin.C
 * @Date 2019/3/2 15:06
 */
public class BTraceDemo {

    /**
     * 加法运算
     * @param a
     * @param b
     * @return
     */
    public static int add(int a, int b) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a + b;
    }

    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        while (true) {
            System.out.println(add(random.nextInt(10), random.nextInt(10)));
        }
    }

    /* BTrace Script Template *//*
    import com.sun.btrace.annotations.*;
    import static com.sun.btrace.BTraceUtils.*;

    @BTrace
    public class TracingScript {

        @OnMethod(
                clazz = "com.linc.single.p201.BTraceDemo",
                method = "add",
                location = @Location(Kind.RETURN)
        )
        public static void sayHello(int a, int b, @Return int result) {
            println("a: " + a);
            println("b: " + b);
            println(result);
        }
    }*/
}
