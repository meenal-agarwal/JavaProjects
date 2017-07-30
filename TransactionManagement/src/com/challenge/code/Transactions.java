package com.challenge.code;

public class Transactions {
	
	public long transaction_id = 00000000;
	private double amount;
	private String type;
	private long parent_id;

	public Transactions(double amount, String type, long parent_id){
		this.amount = amount;
		this.type = type;
		this.parent_id = parent_id;
		transaction_id++;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setParent_id(long parent_id) {
		this.parent_id = parent_id;
	}
	
	public double getAmount() {
		return amount;
	}

	public String getType() {
		return type;
	}

	public long getParent_id() {
		return parent_id;
	}
}
