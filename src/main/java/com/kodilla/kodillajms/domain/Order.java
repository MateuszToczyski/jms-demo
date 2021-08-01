package com.kodilla.kodillajms.domain;

import java.io.Serializable;

public class Order implements Serializable {

	private static final long serialVersionUID = 2613991063766885903L;

	private final int productId;
	private final int quantity;

	public Order(final int productId, final int quantity) {
		this.productId = productId;
		this.quantity = quantity;
	}

	public int getProductId() {
		return productId;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Order{" + "productId=" + productId + ", quantity=" + quantity + '}';
	}
}
