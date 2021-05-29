package com.untold.MiniUrl.service;

import org.springframework.stereotype.Component;

/*
 * ShortUrlGenerator : Generates 8 character long short url for given long url
 * 
 *
 * 
 * 
 */

@Component
public class ShortUrlGenerator {

	public static final int GENERATED_STRING_LENGTH = 8;
	public static final int KEY_LENGTH = 62;
	
	public String generateShortUrl(String longUrl) {
		
		String key = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String generatedString = "";
		
		
		for(int i=0;i<ShortUrlGenerator.GENERATED_STRING_LENGTH;i++) {
			generatedString = generatedString.concat(key.charAt((int)(Math.random()*(ShortUrlGenerator.KEY_LENGTH-1)))+"");
		}
		
		return generatedString;
	}
	
}
