package com.untold.MiniUrl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "url_map")
public class UrlMap {

	@Id
	@Column(name = "short_url")
	private String shortUrl;
	@Column(name = "long_url")
	private String longUrl;
	
	public String getShortUrl() {
		return shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	public String getLongUrl() {
		return longUrl;
	}
	public void setLongUrl(String longUrl) {
		this.longUrl = longUrl;
	}
	
	public UrlMap(String shortUrl, String longUrl) {
		super();
		this.shortUrl = shortUrl;
		this.longUrl = longUrl;
	}
	public UrlMap() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
