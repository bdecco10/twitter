package com.br.twitter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.br.twitter.controller.TwitterServiceController;
import com.br.twitter.model.TwitterEntity;

@RestController
public class TwitterRetrieveService {
	
	@Autowired
    private TwitterServiceController twitterRetrieveService;
	
	//Qual o total de postagens, agrupadas por hora do
	//dia (independentemente da #hashtag)?
	@GetMapping("/get/AllPostByHr")
	public Long getAllPostByHour(@RequestParam(value="hour") String hour) throws Exception{
		
		Long twitterEntity = twitterRetrieveService.getAllPostByHour(hour);
		
		return twitterEntity;
	}
	
	//Quais são os 5 (cinco) usuários, da amostra
	//coletada, que possuem mais seguidores?
	@GetMapping("/get/topFiveFollowes")
	public List<TwitterEntity> getTopFiveFollowes() throws Exception {
		
		List<TwitterEntity> twitterEntity = twitterRetrieveService.getTopFiveFollowers();
		
		return twitterEntity;
	}
	
	//Qual o total de postagens para cada uma das
	//#tag por idioma/país do usuário que postou;
	@GetMapping("/get/AllPostByTag")
	public List<TwitterEntity> getAllPostByTag() throws Exception {
		
		List<TwitterEntity> twitterEntity = twitterRetrieveService.getAllPostByTag();
		
		return twitterEntity;
	}
	
}