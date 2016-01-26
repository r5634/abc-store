package com.abc.account;

import java.util.ArrayList;
import java.util.Collection;

import com.abc.transaction.Transaction;

public class WholesaleBuyerAccount extends AbstractAccount {
	
	public WholesaleBuyerAccount() {
		this.transactions = new ArrayList<Transaction>();
	}

	public int getAccountType() {
		return WHOLESALE_BUYER;
	}

}
