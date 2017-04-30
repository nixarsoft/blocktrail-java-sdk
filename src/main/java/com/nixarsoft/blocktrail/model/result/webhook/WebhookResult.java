package com.nixarsoft.blocktrail.model.result.webhook;

import java.math.BigInteger;
import java.util.HashMap;

public class WebhookResult {
	public static final String EVENT_ADDRESS_TRANSACTIONS = "address-transactions";

	private String network;
	private String event_type;
	private WebhookData data;
	private Integer retry_count;
	private HashMap<String, BigInteger> addresses;
	private WebhookResultWallet wallet;

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getEvent_type() {
		return event_type;
	}

	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}

	public WebhookData getData() {
		return data;
	}

	public void setData(WebhookData data) {
		this.data = data;
	}

	public Integer getRetry_count() {
		return retry_count;
	}

	public void setRetry_count(Integer retry_count) {
		this.retry_count = retry_count;
	}

	public HashMap<String, BigInteger> getAddresses() {
		return addresses;
	}

	public void setAddresses(HashMap<String, BigInteger> addresses) {
		this.addresses = addresses;
	}

	public WebhookResultWallet getWallet() {
		return wallet;
	}

	public void setWallet(WebhookResultWallet wallet) {
		this.wallet = wallet;
	}
}
