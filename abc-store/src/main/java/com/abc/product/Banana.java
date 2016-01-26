package com.abc.product;

import java.util.ArrayList;

import com.abc.transaction.Transaction;

public class Banana extends AbstractItem {
	private static final double PRICE = 1.00;

	public Banana() {
		this.transactions = new ArrayList<Transaction>();
	}

	public double discount(double amount) {
		return amount * 0.001;
	}

	public double getPrice() {
		return PRICE;
	}

	public int getItemName() {
		return BANANA;
	}



}
