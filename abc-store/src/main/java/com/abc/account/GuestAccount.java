package com.abc.account;

import java.util.ArrayList;
import java.util.Collection;

import com.abc.transaction.Transaction;

public class GuestAccount extends AbstractAccount {

	public GuestAccount() {
		this.transactions = new ArrayList<Transaction>();
	}

	public int getAccountType() {
		return GUEST_BUYER;
	}
}
