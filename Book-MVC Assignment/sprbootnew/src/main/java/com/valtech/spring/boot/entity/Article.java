package com.valtech.spring.boot.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Abook")

public class Article extends Book {

	private String url;

	public Article() {
		super();
	}

	public Article(String url) {
		super();
		this.url = url;
	}

	public Article(String name, int whenPublishing, String url) {
		super(name, whenPublishing);
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Article [url=" + url + ", getId()=" + getId() + ", getName()=" + getName() + ", getWhenPublishing()="
				+ getWhenPublishing() + "]";
	}

}
