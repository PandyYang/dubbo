package com.pandy.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @Author Pandy
 * @Date 2021/8/7 12:42
 */
public class ConsumerApplication {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService bean = classPathXmlApplicationContext.getBean(OrderService.class);
        while (true) {
            bean.initOrder("1");
            TimeUnit.SECONDS.sleep(3);
        }
    }
}
