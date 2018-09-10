package com.br.twitter.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.br.twitter.enums.TwitterMessage;

/**
 * Classe responsavel por validar todos os payloads
 * @author Bdecco
 *
 */
public abstract class TwitterRersourceValidate {

	public void validateRequestSave(String tag) throws Exception{

		if(tag.isEmpty())
			throw new Exception(TwitterMessage.ERROR_SAVE.getDescricao());

	}

	public void validateRequestByHour(String hour) throws Exception {
		DateFormat df = new SimpleDateFormat ("HH:mm:ss");
		try{
			df.parse(hour);

		}catch (Exception e) {
			throw new Exception(TwitterMessage.ERROR_RETRIEVE_HOUR.getDescricao());
		}

	}

}
