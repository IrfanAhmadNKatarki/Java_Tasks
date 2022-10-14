package com.valtecg.demo.boot.entity;

	import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

	@Entity
	@DiscriminatorValue("Bbook")
	public class Blog extends Book{
		private String url;
		private int visitedno;
		public Blog() {
			super();
		}
		public Blog(String url, int visitedno) {
			super();
			this.url = url;
			this.visitedno = visitedno;
		}
		public Blog(String name, int whenPublishing, String url, int visitedno) {
			super(name, whenPublishing);
			this.url = url;
			this.visitedno = visitedno;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public int getVisitedno() {
			return visitedno;
		}
		public void setVisitedno(int visitedno) {
			this.visitedno = visitedno;
		}
		@Override
		public String toString() {
			return "Blog [url=" + url + ", visitedno=" + visitedno + ", getId()=" + getId() + ", getName()=" + getName()
					+ ", getWhenPublishing()=" + getWhenPublishing() + "]";
		}
		
		
	

}
