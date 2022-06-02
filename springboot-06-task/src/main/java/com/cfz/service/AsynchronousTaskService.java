package com.cfz.service;

import org.springframework.stereotype.Service;

@Service
public class AsynchronousTaskService {
    public void hello() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("数据正在处理中。。。");
    }
}
