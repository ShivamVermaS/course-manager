package com.springrest.SpringRest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Courses {
	
	
	@Id
	private long id;
	@NotNull
	@Column(length = 50)
	private String title;
	@NotNull
	@Column(length = 20)
	private String duration;
	@NotNull
	private long fee;
	@NotNull
	@Column(length = 50)
	private String Category;
	@NotNull
	private String image;
	@NotNull
	String discription;
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Courses(@NotEmpty @Size(min = 1, max = 20, message = "Name Should not be empty") long id,
			@NotNull String title, @NotNull String duration,
			@NotNull @Size(min = 1, max = 20, message = "fee Should not be empty") long fee, @NotNull String category,
			@NotNull String image, @NotNull String discription) {
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