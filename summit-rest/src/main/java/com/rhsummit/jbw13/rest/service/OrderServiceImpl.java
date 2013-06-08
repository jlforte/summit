package com.rhsummit.jbw13.rest.service;

import com.rhsummit.jbw13.model.Order;
import com.rhsummit.jbw13.rest.api.OrderService;

public class OrderServiceImpl implements OrderService {

	@Override
	public Order test() {
		
		Order order = new Order();
		order.setId(1L);
		
		return order;
	}

}
