package com.nixarsoft.blocktrail.model.result.wallet;

import java.util.List;

public class WalletResult {
	private String wallet_version;
	private String primary_mnemonic;
	private String encrypted_primary_seed;
	private String encrypted_secret;
	private String recovery_secret;
	private List<String> backup_public_key;
	private String checksum;
	private List<List<String>> blocktrail_public_keys;
	private List<List<String>> primary_public_keys;
	private String key_index;
	private String upgrade_key_index;

	public String getWallet_version() {
		return wallet_version;
	}

	public void setWallet_version(String wallet_version) {
		this.wallet_version = wallet_version;
	}

	public String getPrimary_mnemonic() {
		return primary_mnemonic;
	}

	public void setPrimary_mnemonic(String primary_mnemonic) {
		this.primary_mnemonic = primary_mnemonic;
	}

	public String getEncrypted_primary_seed() {
		return encrypted_primary_seed;
	}

	public void setEncrypted_primary_seed(String encrypted_primary_seed) {
		this.encrypted_primary_seed = encrypted_primary_seed;
	}

	public String getEncrypted_secret() {
		return encrypted_secret;
	}

	public void setEncrypted_secret(String encrypted_secret) {
		this.encrypted_secret = encrypted_secret;
	}

	public String getRecovery_secret() {
		return recovery_secret;
	}

	public void setRecovery_secret(String recovery_secret) {
		this.recovery_secret = recovery_secret;
	}

	public List<String> getBackup_public_key() {
		return backup_public_key;
	}

	public void setBackup_public_key(List<String> backup_public_key) {
		this.backup_public_key = backup_public_key;
	}

	public String getChecksum() {
		return checksum;
	}

	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}

	public List<List<String>> getBlocktrail_public_keys() {
		return blocktrail_public_keys;
	}

	public void setBlocktrail_public_keys(List<List<String>> blocktrail_public_keys) {
		this.blocktrail_public_keys = blocktrail_public_keys;
	}

	public List<List<String>> getPrimary_public_keys() {
		return primary_public_keys;
	}

	public void setPrimary_public_keys(List<List<String>> primary_public_keys) {
		this.primary_public_keys = primary_public_keys;
	}

	public String getKey_index() {
		return key_index;
	}

	public void setKey_index(String key_index) {
		this.key_index = key_index;
	}

	public String getUpgrade_key_index() {
		return upgrade_key_index;
	}

	public void setUpgrade_key_index(String upgrade_key_index) {
		this.upgrade_key_index = upgrade_key_index;
	}

}
