package com.nixarsoft.blocktrail.model;

import java.util.Date;

public class AddressDetail {

	private String address;
	private String hash160;
	private Double balance;
	private Integer received;
	private Integer sent;
	private Integer transactions;
	private Integer utxos;
	private Integer unconfirmedReceived;
	private Integer unconfirmedSent;
	private Integer unconfirmedTransactions;
	private Integer unconfirmedUtxos;
	private Integer totalTransactionsIn;
	private Integer totalTransactionsOut;
	private String category;
	private String tag;
	private Date firstSeen;
	private Date lastSeen;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHash160() {
		return hash160;
	}

	public void setHash160(String hash160) {
		this.hash160 = hash160;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Integer getReceived() {
		return received;
	}

	public void setReceived(Integer received) {
		this.received = received;
	}

	public Integer getSent() {
		return sent;
	}

	public void setSent(Integer sent) {
		this.sent = sent;
	}

	public Integer getTransactions() {
		return transactions;
	}

	public void setTransactions(Integer transactions) {
		this.transactions = transactions;
	}

	public Integer getUtxos() {
		return utxos;
	}

	public void setUtxos(Integer utxos) {
		this.utxos = utxos;
	}

	public Integer getUnconfirmedReceived() {
		return unconfirmedReceived;
	}

	public void setUnconfirmedReceived(Integer unconfirmedReceived) {
		this.unconfirmedReceived = unconfirmedReceived;
	}

	public Integer getUnconfirmedSent() {
		return unconfirmedSent;
	}

	public void setUnconfirmedSent(Integer unconfirmedSent) {
		this.unconfirmedSent = unconfirmedSent;
	}

	public Integer getUnconfirmedTransactions() {
		return unconfirmedTransactions;
	}

	public void setUnconfirmedTransactions(Integer unconfirmedTransactions) {
		this.unconfirmedTransactions = unconfirmedTransactions;
	}

	public Integer getUnconfirmedUtxos() {
		return unconfirmedUtxos;
	}

	public void setUnconfirmedUtxos(Integer unconfirmedUtxos) {
		this.unconfirmedUtxos = unconfirmedUtxos;
	}

	public Integer getTotalTransactionsIn() {
		return totalTransactionsIn;
	}

	public void setTotalTransactionsIn(Integer totalTransactionsIn) {
		this.totalTransactionsIn = totalTransactionsIn;
	}

	public Integer getTotalTransactionsOut() {
		return totalTransactionsOut;
	}

	public void setTotalTransactionsOut(Integer totalTransactionsOut) {
		this.totalTransactionsOut = totalTransactionsOut;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Date getFirstSeen() {
		return firstSeen;
	}

	public void setFirstSeen(Date firstSeen) {
		this.firstSeen = firstSeen;
	}

	public Date getLastSeen() {
		return lastSeen;
	}

	public void setLastSeen(Date lastSeen) {
		this.lastSeen = lastSeen;
	}
}
