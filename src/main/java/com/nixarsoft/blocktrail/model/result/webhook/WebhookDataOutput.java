package com.nixarsoft.blocktrail.model.result.webhook;

import java.math.BigInteger;

public class WebhookDataOutput {

	private Integer index;
	private BigInteger value;
	private String address;
	private String type;
	private Object multisig;
	private Object multisig_addresses;
	private String script;
	private String script_hex;
	private Object spent_hash;
	private Integer spent_index;

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public BigInteger getValue() {
		return value;
	}

	public void setValue(BigInteger value) {
		this.value = value;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Object getMultisig() {
		return multisig;
	}

	public void setMultisig(Object multisig) {
		this.multisig = multisig;
	}

	public Object getMultisig_addresses() {
		return multisig_addresses;
	}

	public void setMultisig_addresses(Object multisig_addresses) {
		this.multisig_addresses = multisig_addresses;
	}

	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	}

	public String getScript_hex() {
		return script_hex;
	}

	public void setScript_hex(String script_hex) {
		this.script_hex = script_hex;
	}

	public Object getSpent_hash() {
		return spent_hash;
	}

	public void setSpent_hash(Object spent_hash) {
		this.spent_hash = spent_hash;
	}

	public Integer getSpent_index() {
		return spent_index;
	}

	public void setSpent_index(Integer spent_index) {
		this.spent_index = spent_index;
	}
}
