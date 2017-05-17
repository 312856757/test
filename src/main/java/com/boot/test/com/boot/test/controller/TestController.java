package com.boot.test.com.boot.test.controller;

import com.boot.test.com.boot.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WangJun on 2017/4/10.
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;
    private int a=1;
    @GetMapping("/test/{c}")
    private String test(@PathVariable String c) throws InterruptedException {
        if("abc".equals(c)){
            a++;
            Thread.currentThread().sleep(3000);
            System.out.println(a);
            return "abc";
        }
        return "123";
    }

    @GetMapping("/testS")
    private void sysn() throws InterruptedException {

                testService.test();

        System.out.println(111);
    }
}
