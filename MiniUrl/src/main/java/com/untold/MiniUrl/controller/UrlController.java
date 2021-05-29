package com.untold.MiniUrl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.untold.MiniUrl.service.UrlService;

@Controller
public class UrlController {
	
	@Autowired
	private UrlService service;
	
	@RequestMapping(value = "/facePage", method = RequestMethod.GET)
	public String showFacePage() {
		return null;
	}

}
