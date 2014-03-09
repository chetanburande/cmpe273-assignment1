package edu.sjsu.cmpe.library.domain;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonPropertyOrder({ "id" , "rating" , "comment"})
public class Review {
	private long id;
	@NotEmpty
	private int rating;
	@NotEmpty
	private String comment;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	

}
