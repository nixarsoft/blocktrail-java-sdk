package com.nixarsoft.blocktrail;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.nixarsoft.blocktrail.model.request.NewAddressRequest;
import com.nixarsoft.blocktrail.model.result.NewAddressResult;
import com.nixarsoft.blocktrail.model.result.WalletResult;

public class Wallet {
	private static final Logger logger = Logger.getLogger(Wallet.class);

	private BlocktrailClient client;
	private HttpURLConnection httpUrlConnection = null;

	private WalletResult information;
	private String name;

	public Wallet(BlocktrailClient client) {
		this.client = client;
	}

	public WalletResult getInformation() {
		return information;
	}

	public void setInformation(WalletResult information) {
		this.information = information;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNewAddress() {
		String targetURL = BlocktrailClient.ENDPOINT + "wallet/" + getName() + "/path?api_key=" + client.getApiKey();

		try {
			NewAddressRequest newAddressRequest = new NewAddressRequest();
			// you must set this for creating new address in wallet
			newAddressRequest.setData("m/0'/0/*");

			// Gson gson = new GsonBuilder().disableHtmlEscaping().create();
			// String requestJsonRaw = gson.toJson(newAddressRequest).replace("/", "\/");
			// TODO You must handle this problem.
			String requestJsonRaw = "{\"path\":\"m\\/0'\\/0\\/*\"}";
			String requestMd5 = HashGenerator.md5(requestJsonRaw);

			logger.debug("Request json raw: " + requestJsonRaw + " requestMd5: " + requestMd5);

			URL url = new URL(targetURL);
			httpUrlConnection = (HttpURLConnection) url.openConnection();

			// httpUrlConnection.setRequestProperty("X-Requested-With", BlocktrailClient.USER_AGENT);
			httpUrlConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			httpUrlConnection.setRequestProperty("Content-MD5", requestMd5);

			httpUrlConnection.setUseCaches(false);
			httpUrlConnection.setDoOutput(true);
			httpUrlConnection.setInstanceFollowRedirects(false);
			httpUrlConnection.setRequestMethod("POST");

			OutputStream os = httpUrlConnection.getOutputStream();
			os.write(requestJsonRaw.getBytes("UTF-8"));
			os.close();

			InputStream is = httpUrlConnection.getInputStream();
			Reader reader = new BufferedReader(new InputStreamReader(is));
			NewAddressResult addressDetail = new Gson().fromJson(reader, NewAddressResult.class);
			return addressDetail.getAddress();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
