package com.nixarsoft.blocktrail.model.result.webhook;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public class WebhookData {

	private String raw;
	private String hash;
	private Date first_seen_at;
	private Date last_seen_at;
	private Integer block_height;
	private Date block_time;
	private String block_hash;
	private Byte confirmations;
	private Boolean is_coinbase;
	private BigInteger estimated_value;
	private BigInteger total_input_value;
	private Integer total_fee;
	private Integer estimated_change;
	private String estimated_change_address;
	private Boolean high_priority;
	private Boolean enough_fee;
	private Boolean contains_dust;
	private List<WebhookDataInput> inputs;
	private List<WebhookDataOutput> outputs;
	private Boolean opt_in_rbf;
	private Object lock_time_timestamp;
	private Object lock_time_block_height;
	private Integer size;

	public String getRaw() {
		return raw;
	}

	public void setRaw(String raw) {
		this.raw = raw;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public Date getFirst_seen_at() {
		return first_seen_at;
	}

	public void setFirst_seen_at(Date first_seen_at) {
		this.first_seen_at = first_seen_at;
	}

	public Date getLast_seen_at() {
		return last_seen_at;
	}

	public void setLast_seen_at(Date last_seen_at) {
		this.last_seen_at = last_seen_at;
	}

	public Integer getBlock_height() {
		return block_height;
	}

	public void setBlock_height(Integer block_height) {
		this.block_height = block_height;
	}

	public Date getBlock_time() {
		return block_time;
	}

	public void setBlock_time(Date block_time) {
		this.block_time = block_time;
	}

	public String getBlock_hash() {
		return block_hash;
	}

	public void setBlock_hash(String block_hash) {
		this.block_hash = block_hash;
	}

	public Byte getConfirmations() {
		return confirmations;
	}

	public void setConfirmations(Byte confirmations) {
		this.confirmations = confirmations;
	}

	public Boolean getIs_coinbase() {
		return is_coinbase;
	}

	public void setIs_coinbase(Boolean is_coinbase) {
		this.is_coinbase = is_coinbase;
	}

	public BigInteger getEstimated_value() {
		return estimated_value;
	}

	public void setEstimated_value(BigInteger estimated_value) {
		this.estimated_value = estimated_value;
	}

	public BigInteger getTotal_input_value() {
		return total_input_value;
	}

	public void setTotal_input_value(BigInteger total_input_value) {
		this.total_input_value = total_input_value;
	}

	public Integer getTotal_fee() {
		return total_fee;
	}

	public void setTotal_fee(Integer total_fee) {
		this.total_fee = total_fee;
	}

	public Integer getEstimated_change() {
		return estimated_change;
	}

	public void setEstimated_change(Integer estimated_change) {
		this.estimated_change = estimated_change;
	}

	public String getEstimated_change_address() {
		return estimated_change_address;
	}

	public void setEstimated_change_address(String estimated_change_address) {
		this.estimated_change_address = estimated_change_address;
	}

	public Boolean getHigh_priority() {
		return high_priority;
	}

	public void setHigh_priority(Boolean high_priority) {
		this.high_priority = high_priority;
	}

	public Boolean getEnough_fee() {
		return enough_fee;
	}

	public void setEnough_fee(Boolean enough_fee) {
		this.enough_fee = enough_fee;
	}

	public Boolean getContains_dust() {
		return contains_dust;
	}

	public void setContains_dust(Boolean contains_dust) {
		this.contains_dust = contains_dust;
	}

	public List<WebhookDataInput> getInputs() {
		return inputs;
	}

	public void setInputs(List<WebhookDataInput> inputs) {
		this.inputs = inputs;
	}

	public List<WebhookDataOutput> getOutputs() {
		return outputs;
	}

	public void setOutputs(List<WebhookDataOutput> outputs) {
		this.outputs = outputs;
	}

	public Boolean getOpt_in_rbf() {
		return opt_in_rbf;
	}

	public void setOpt_in_rbf(Boolean opt_in_rbf) {
		this.opt_in_rbf = opt_in_rbf;
	}

	public Object getLock_time_timestamp() {
		return lock_time_timestamp;
	}

	public void setLock_time_timestamp(Object lock_time_timestamp) {
		this.lock_time_timestamp = lock_time_timestamp;
	}

	public Object getLock_time_block_height() {
		return lock_time_block_height;
	}

	public void setLock_time_block_height(Object lock_time_block_height) {
		this.lock_time_block_height = lock_time_block_height;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}
}
