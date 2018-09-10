package com.br.twitter.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "twitter")
public class TwitterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TWITTER_SEQ")
	@SequenceGenerator(sequenceName = "twitter_seq", allocationSize = 1, name = "TWITTER_SEQ")
	private Long id;
	@Temporal(TemporalType.DATE)
	@Column(name="date")
	private Date date;
	@Temporal(TemporalType.TIME)
	@Column(name="hour")
	private Date hour;
	@Column(name="countre")
	private String countre;
	@Column(name="language")
	private String language;
	@Column(name="user")
	private String user;
	@Column(name="followers")
	private int followers;

	public TwitterEntity() {}

	public TwitterEntity(Date date, Date hour, String countre, String language, String user, int followers) {
		super();
		this.date = date;
		this.hour = hour;
		this.countre = countre;
		this.language = language;
		this.user = user;
		this.followers = followers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getHour() {
		return hour;
	}

	public void setHour(Date hour) {
		this.hour = hour;
	}

	public String getCountre() {
		return countre;
	}

	public void setCountre(String countre) {
		this.countre = countre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getFollowers() {
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

}