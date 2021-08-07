package com.pandy.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Pandy
 * @Date 2021/8/7 12:42
 */
public class MainApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService bean = classPathXmlApplicationContext.getBean(OrderService.class);
        bean.initOrder("1");
    }
}
