package com.nixarsoft.blocktrail.model.result.webhook;

import java.math.BigInteger;
import java.util.List;

public class WebhookResultWallet {
	private String identifier;
	private List<String> addresses;
	private BigInteger balance;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	public BigInteger getBalance() {
		return balance;
	}

	public void setBalance(BigInteger balance) {
		this.balance = balance;
	}
}
