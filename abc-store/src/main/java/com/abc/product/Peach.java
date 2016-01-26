package com.abc.product;

import java.util.ArrayList;

import com.abc.transaction.Transaction;

public class Peach extends AbstractItem {
	private static final double PRICE=5.00;
	public Peach() {
		this.transactions = new ArrayList<Transaction>();
	}

	public double discount(double amount) {
		return amount * 0.001;
	}
	public double getPrice(){
		return PRICE;
	}
	public int getItemName() {
		return PEACH;
	}
}
