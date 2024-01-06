package com.gl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Ticket")
public class Ticket {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

@Column(name="title")
private String title;
private String shortDescription;
private String Content;
private String createdOn;


public Ticket() {
	
}
   public Ticket(int id, String title, String shortDescription, String content, String createdOn) {
	//super();
	this.id = id;
	this.title = title;
	this.shortDescription = shortDescription;
	Content = content;
	this.createdOn = createdOn;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getShortDescription() {
	return shortDescription;
}
public void setShortDescription(String shortDescription) {
	this.shortDescription = shortDescription;
}
public String getContent() {
	return Content;
}
public void setContent(String content) {
	Content = content;
}
public String getCreatedOn() {
	return createdOn;
}
public void setCreatedOn(String createdOn) {
	this.createdOn = createdOn;
}


}
