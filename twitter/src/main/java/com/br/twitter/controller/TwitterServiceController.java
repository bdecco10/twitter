package com.br.twitter.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.twitter.model.TwitterEntity;
import com.br.twitter.repository.TwitterRepository;
import com.br.twitter.utils.TwitterRersourceValidate;

import twitter4j.TwitterException;
import twitter4j.User;

@Component
public class TwitterServiceController extends TwitterRersourceValidate{

	@Autowired
	private TwitterRepository repository;
	
	public List<TwitterEntity> getTopFiveFollowers() throws TwitterException{

		List<TwitterEntity> twitterEntity = repository.getTopFiveFollowers();

		return twitterEntity;
	}

	public Long getAllPostByHour(String horario) throws Exception{

		validateRequestByHour(horario);
		
		Long twitterEntity = repository.getAllPostByHour(
				new SimpleDateFormat("HH:mm:ss").parse(horario));

		return twitterEntity;
	}

	public List<TwitterEntity> getAllPostByTag() throws TwitterException{

		List<TwitterEntity> twitterEntity = repository.getAllPostByTag(1L);

		return twitterEntity;
	}

	public void savePost(List<User> listtwitter) throws Exception{

		for (User user : listtwitter) {
			repository.save(new TwitterEntity(user.getCreatedAt(),user.getCreatedAt(), user.getLocation(),user.getLang(),user.getName(),user.getFollowersCount()));
		}


	}

}