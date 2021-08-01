package com.kodilla.kodillajms.controller;

import com.kodilla.kodillajms.constants.Queues;
import com.kodilla.kodillajms.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private JmsTemplate jmsTemplate;

	@GetMapping(path = "/create/{productId}/{quantity}")
	public void processMessage(@PathVariable int productId, @PathVariable int quantity) {
		jmsTemplate.convertAndSend(Queues.ORDERS, new Order(productId, quantity));
	}

}
