package com.app.models;

/**
 * Model with same field names as DB
 * @author Jalal Kiswani
 *
 */
public class Account {
	int id;
	String name;
	double balance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
