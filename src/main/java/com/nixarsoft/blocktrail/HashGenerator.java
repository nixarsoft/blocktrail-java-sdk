package com.nixarsoft.blocktrail;

import java.nio.charset.Charset;
import java.security.MessageDigest;

import org.apache.commons.codec.binary.Hex;

public class HashGenerator {
	public static String md5(String str) {
		try {
			final MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.reset();
			messageDigest.update(str.getBytes(Charset.forName("UTF8")));
			final byte[] resultByte = messageDigest.digest();

			return new String(Hex.encodeHex(resultByte));

		} catch (Exception e) {
			return null;
		}
	}
}
