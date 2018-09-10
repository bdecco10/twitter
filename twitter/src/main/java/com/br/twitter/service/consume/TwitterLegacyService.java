package com.br.twitter.service.consume;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.twitter.controller.TwitterServiceController;
import com.br.twitter.utils.TwitterRersourceValidate;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.User;

@Component
public class TwitterLegacyService extends TwitterRersourceValidate {

	@Autowired
	private TwitterServiceController twitterServiceController;
	
	@Autowired
	private Twitter twitter;
	
	public void savePost(String tag) throws Exception{

		validateRequestSave(tag);
		
		Query query = new Query("#"+tag);
		query.setCount(100);
		
		QueryResult result = twitter.search(query);
		
		List<User> listtwitter = result.getTweets().stream().map(item -> item.getUser()).collect(Collectors.toList());

		twitterServiceController.savePost(listtwitter);
		
	}
}