package com.pandy.consumer.controller;

import com.pandy.bean.UserAddress;
import com.pandy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

	@Autowired
	OrderService orderService;

	@ResponseBody
	@RequestMapping("/initOrder/{userId}")
	public List<UserAddress> initOrder(@PathVariable String userId) {
		return orderService.initOrder(userId);
	}

}
