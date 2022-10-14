package Valtechspring.orm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("article")
public class Article extends Book {
	
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Article(String name, int whenPublished, String url) {
		super(name, whenPublished);
		this.url = url;
	}

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Article(String url) {
		super();
		this.url = url;
	}

	@Override
	public String toString() {
		return "Article [url=" + url + ", getId()=" + getId() + ", getName()=" + getName() + ", getWhenPublished()="
				+ getWhenPublished() + ", getPublisher()=" + getPublisher() + ", getAuthors()=" + getAuthors() + "]";
	}


	

	

}
