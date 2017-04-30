package com.nixarsoft.blocktrail.model.result.webhook;

import java.math.BigInteger;

public class WebhookDataInput {
	private Integer index;
	private String output_hash;
	private Integer output_index;
	private BigInteger value;
	private BigInteger sequence;
	private String address;
	private String type;
	private Object multisig;
	private Object multisig_addresses;
	private String script_signature;

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getOutput_hash() {
		return output_hash;
	}

	public void setOutput_hash(String output_hash) {
		this.output_hash = output_hash;
	}

	public Integer getOutput_index() {
		return output_index;
	}

	public void setOutput_index(Integer output_index) {
		this.output_index = output_index;
	}

	public BigInteger getValue() {
		return value;
	}

	public void setValue(BigInteger value) {
		this.value = value;
	}

	public BigInteger getSequence() {
		return sequence;
	}

	public void setSequence(BigInteger sequence) {
		this.sequence = sequence;
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

	public String getScript_signature() {
		return script_signature;
	}

	public void setScript_signature(String script_signature) {
		this.script_signature = script_signature;
	}
}
