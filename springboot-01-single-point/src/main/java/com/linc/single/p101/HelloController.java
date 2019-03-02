package com.linc.single.p101;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world demo
 *
 * @Author Lin.C
 * @Date 2019/3/2 15:05
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello() {
        return "Hello world";
    }
}
