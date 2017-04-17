package com.nixarsoft.blocktrail;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;
import com.nixarsoft.blocktrail.model.AddressDetail;

public class BlocktrailClient {
	private static final String ENDPOINT = "https://api.blocktrail.com/v1/btc/";

	private URLConnection connection = null;

	private String apiKey;
	private String apiSecret;
	private String coinType;
	private boolean isTestNet;

	public BlocktrailClient(String apiKey, String apiSecret, String coinType, boolean isTestNet) {
		this.apiKey = apiKey;
		this.apiSecret = apiSecret;
		this.coinType = coinType;
		this.isTestNet = isTestNet;
	}

	public AddressDetail getAddressDetail(String address) {
		String targetURL = ENDPOINT + "address/" + address + "?api_key=" + this.apiKey;

		try {
			URL url = new URL(targetURL);
			connection = url.openConnection();
			connection.setRequestProperty("X-Requested-With", "Curl");
			connection.setRequestProperty("Content-Language", "en-US");
			connection.setUseCaches(false);
			connection.setDoOutput(true);

			InputStream is = connection.getInputStream();
			Reader reader = new BufferedReader(new InputStreamReader(is));

			AddressDetail addressDetail = new Gson().fromJson(reader, AddressDetail.class);
			return addressDetail;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
