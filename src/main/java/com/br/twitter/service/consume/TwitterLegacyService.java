package com.br.twitter.service.consume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.twitter.controller.TwitterServiceController;

@Component
public class TwitterLegacyService {

	@Autowired
	private TwitterServiceController twitterServiceController;
	
	public void saveTopFive(String tag) throws Exception{

		twitterServiceController.savePost(tag);
		
	}
}