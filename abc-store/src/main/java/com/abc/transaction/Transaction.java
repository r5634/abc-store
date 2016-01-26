package com.abc.transaction;

import java.util.Date;

import com.abc.product.Item;
import com.abc.util.DateProvider;
import com.abc.util.DateUtil;

public class Transaction {
	private final Date transactionDate;
	private final String transactionType;
	private final Item item;
	private static String dFormat = "yyyyMMdd";

	public Transaction(Item item,String transactionType) {
		this(item, transactionType, DateUtil.convertFromDateToString(DateProvider.getInstance().now(), dFormat), dFormat);
	}

	public Transaction(Item item,String transactionType, String dateString, String dFormat) {
		this.item = item;
		this.transactionDate = DateUtil.convertfromStringToDate(dateString, dFormat);
		this.transactionType=transactionType;
	}

	public Item getItem() {
		return item;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public String getTransactionType() {
		return transactionType;
	}

}
