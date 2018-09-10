package com.br.twitter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.br.twitter.controller.TwitterServiceController;

@RestController
public class TwitterSaveService {
	
	@Autowired
    private TwitterServiceController twitterRetrieveService;

	//Metodo realiza a mesma regra que os de cima porem usando o Feign para consumir o serviço, melhor performace
	@GetMapping("/save")
	public void savePosts(@RequestParam(value="tag") String tag) throws Exception {
		
		twitterRetrieveService.savePost(tag);
	}
}