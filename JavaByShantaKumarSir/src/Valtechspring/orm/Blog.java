package Valtechspring.orm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("blog")
public class Blog extends Book {

	
	
		private String url;
		private int visitedNo;
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public int getVisitedNo() {
			return visitedNo;
		}
		public void setVisitedNo(int visitedNo) {
			this.visitedNo = visitedNo;
		}
		public Blog() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public Blog(String url, int visitedNo) {
			super();
			this.url = url;
			this.visitedNo = visitedNo;
		}
		public Blog(String name, int whenPublished, String url, int visitedNo) {
			super(name, whenPublished);
			this.url = url;
			this.visitedNo = visitedNo;
		}
		@Override
		public String toString() {
			return "Blog [url=" + url + ", visitedNo=" + visitedNo + ", getId()=" + getId() + ", getName()=" + getName()
					+ ", getWhenPublished()=" + getWhenPublished() + ", getPublisher()=" + getPublisher()
					+ ", getAuthors()=" + getAuthors() + "]";
		}
		

		
		
}
