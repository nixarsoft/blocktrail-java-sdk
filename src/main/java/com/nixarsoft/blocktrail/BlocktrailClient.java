package com.nixarsoft.blocktrail;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.nixarsoft.blocktrail.model.result.address.AddressDetails;
import com.nixarsoft.blocktrail.model.result.wallet.WalletResult;

public class BlocktrailClient {
	private static final Logger logger = Logger.getLogger(BlocktrailClient.class);

	private static final String ENDPOINT = "https://api.blocktrail.com/v1/";
	public static final String USER_AGENT = "Java Sdk - https://github.com/nixarsoft/blocktrail-java-sdk";

	private URLConnection connection = null;

	private String apiKey;
	private String apiSecret;
	private String coinType;
	private static boolean isTestNet;

	public BlocktrailClient(String apiKey, String apiSecret, boolean isTestNet) {
		this.apiKey = apiKey;
		this.apiSecret = apiSecret;
		this.isTestNet = isTestNet;
	}

	public static String getEndpoint() {
		if (isTestNet)
			return ENDPOINT + "tBTC/";
		return ENDPOINT + "BTC/";
	}

	public AddressDetails getAddressDetail(String address) {
		String targetURL = getEndpoint() + "address/" + address + "?api_key=" + this.apiKey;

		try {
			URL url = new URL(targetURL);
			connection = url.openConnection();
			connection.setRequestProperty("X-Requested-With", USER_AGENT);
			connection.setRequestProperty("Content-Language", "en-US");
			connection.setUseCaches(false);
			connection.setDoOutput(true);

			InputStream is = connection.getInputStream();
			Reader reader = new BufferedReader(new InputStreamReader(is));

			AddressDetails addressDetail = new Gson().fromJson(reader, AddressDetails.class);
			return addressDetail;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Wallet getWallet(String identifier) {
		// https://api.blocktrail.com/v1/BTC/wallet/TestWallet?api_key=5fd6d36dd68759382c2b78e98c9dfd65f59af73f
		String targetURL = getEndpoint() + "wallet/" + identifier + "?api_key=" + this.apiKey;

		try {
			Wallet wallet = new Wallet(this);

			URL url = new URL(targetURL);
			connection = url.openConnection();
			connection.setRequestProperty("X-Requested-With", USER_AGENT);
			connection.setRequestProperty("Content-Language", "en-US");
			connection.setUseCaches(false);
			connection.setDoOutput(true);

			InputStream is = connection.getInputStream();
			Reader reader = new BufferedReader(new InputStreamReader(is));
			WalletResult walletResult = new Gson().fromJson(reader, WalletResult.class);

			wallet.setName(identifier);
			wallet.setInformation(walletResult);

			return wallet;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public URLConnection getConnection() {
		return connection;
	}

	public String getApiKey() {
		return apiKey;
	}

	public String getApiSecret() {
		return apiSecret;
	}

	public String getCoinType() {
		return coinType;
	}

	public boolean isTestNet() {
		return isTestNet;
	}
}
