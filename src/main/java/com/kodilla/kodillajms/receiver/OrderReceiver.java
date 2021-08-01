package com.kodilla.kodillajms.receiver;

import com.kodilla.kodillajms.constants.Queues;
import com.kodilla.kodillajms.domain.Order;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class OrderReceiver {

	@JmsListener(containerFactory = "jmsFactory", destination = Queues.ORDERS)
	public void receive(Order order) {
		System.out.println("Received order: " + order);
	}

}