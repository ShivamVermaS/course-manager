package com.springrest.SpringRest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {
	
	@Id
	private long id;
	private String title;
	private String duration;
	private long fee;
	private String Category;
	private String image;
	String discription;
	
	
		public Courses()
	{
		super();
		
	}
		
	
public Courses(long id, String title, String duration, long fee, String category, String image,
				String discription) {
			super();
			this.id = id;
			this.title = title;
			this.duration = duration;
			this.fee = fee;
			Category = category;
			this.image = image;
			this.discription = discription;
		}



	public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


public String getDuration() {
	return duration;
}


public void setDuration(String duration) {
	this.duration = duration;
}


public long getFee() {
	return fee;
}


public void setFee(long fee) {
	this.fee = fee;
}


public String getCategory() {
	return Category;
}


public void setCategory(String category) {
	Category = category;
}


public String getImage() {
	return image;
}


public void setImage(String image) {
	this.image = image;
}


public String getDiscription() {
	return discription;
}


public void setDiscription(String discription) {
	this.discription = discription;
}


@Override
public String toString() {
	return "Courses [id=" + id + ", title=" + title + ", duration=" + duration + ", fee=" + fee + ", Category="
			+ Category + ", image=" + image + ", discription=" + discription + "]";
}

	
}
