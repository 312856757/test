package com.boot.test.com.boot.test.service;

import org.springframework.stereotype.Service;

/**
 * Created by WangJun on 2017/5/16.
 */
@Service
public class TestService {
    public void test() throws InterruptedException {
        synchronized(this){
            for(int i=0;i<10;i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
        System.out.println("not sync");
    }
}
