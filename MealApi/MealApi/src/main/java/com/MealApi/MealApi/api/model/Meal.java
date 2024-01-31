package com.MealApi.MealApi.api.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Meal {

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String comment;

// public Meal(String name,String comment) {
// 	id = UUID.randomUUID();
// 	this.name = name;
// 	this.comment = comment;
// }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}