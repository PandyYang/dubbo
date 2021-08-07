package com.pandy.service.impl;

import com.pandy.bean.UserAddress;
import com.pandy.service.OrderService;
import com.pandy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Pandy
 * @Date 2021/8/7 11:27
 *
 * 将服务提供者注册至注册中心
 * 让服务消费者去注册中心订阅服务提供者
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    public List<UserAddress> initOrder(String userId) {

        System.out.println("用户id: " + userId);

        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : userAddressList) {
            System.out.println("userAddress = " + userAddress.getUserAddress());
        }
        return userAddressList;
    }
}
