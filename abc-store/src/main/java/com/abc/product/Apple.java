package com.abc.product;

import java.util.ArrayList;



public class Apple extends AbstractItem {
	private static final double PRICE=2.00;

	public double discount(double amount) {
		return amount * 0.001;
	}
	
	public double getPrice() {
		return PRICE;
	}

	public int getItemName() {
		return APPLE;
	}


}
