package com.untold.MiniUrl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.untold.MiniUrl.repository.UrlRepository;

@Service
public class UrlService {

	@Autowired
	private UrlRepository urlRepository;
	
	public String saveUrl(String longUrl) {
		
		return null;
	}
	
	public boolean saveUrl(String shortUrl, String longUrl) {
		
		return false;
	}
	
}
