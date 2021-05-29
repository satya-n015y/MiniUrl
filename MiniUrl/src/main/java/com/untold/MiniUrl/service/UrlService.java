package com.untold.MiniUrl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.untold.MiniUrl.model.UrlMap;
import com.untold.MiniUrl.repository.UrlRepository;

@Service
public class UrlService {

	@Autowired
	private UrlRepository urlRepository;
	@Autowired
	private ShortUrlGenerator shortUrlGenerator;
	
	public String saveUrl(String longUrl) {
		String generatedUrl = shortUrlGenerator.generateShortUrl(longUrl);
		
		while(!mapUrl(generatedUrl, longUrl)) {
			generatedUrl = shortUrlGenerator.generateShortUrl(longUrl);
		}
		
		return generatedUrl;
	}
	
	public boolean saveUrl(String shortUrl, String longUrl) {
		
		return mapUrl(shortUrl, longUrl);
	}
	
	public boolean mapUrl(String shortUrl, String longUrl) {
		if(urlRepository.existsById(shortUrl)) {
			return false;
		}
		
		urlRepository.save(new UrlMap(shortUrl, longUrl));
		
		return true;
	}
	
}
