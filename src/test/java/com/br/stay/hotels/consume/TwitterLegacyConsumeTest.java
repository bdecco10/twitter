package com.br.stay.hotels.consume;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.br.twitter.controller.TwitterServiceController;
import com.br.twitter.repository.TwitterRepository;

import twitter4j.QueryResult;
import twitter4j.Twitter;

@RunWith(MockitoJUnitRunner.Silent.class) 
public class TwitterLegacyConsumeTest {

	
	@InjectMocks
	private TwitterServiceController twitterServiceController;
	
	@Mock 
	private TwitterRepository repository;
	
	@Mock
	private Twitter twitter;
	
	@Test(expected=Exception.class)
	public void savePost() throws Exception {

		QueryResult result = null;

		when(twitter.search(null)).thenReturn(result);
		
		twitterServiceController.savePost(null);
		
	}
	
	@Test(expected=Exception.class)
	public void getAllPostByHourException() throws Exception {

		twitterServiceController.getAllPostByHour(null);
		
	}
	
	@Test
	public void getAmountPostByHourSucess() throws Exception {

		when(repository.getAllPostByHour(new Date())).thenReturn(3L);
		
		Long result = twitterServiceController.getAllPostByHour("07:25:44");
		
		assertNotNull(result);
	}
	
}
