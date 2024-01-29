package com.MealApi.MealApi.api.model;

import java.util.UUID;

public class Meal {
	private UUID id;
	private String mealName;
	private String comment;


public Meal(String mealName,String comment) {
	id = UUID.randomUUID();
	this.mealName = mealName;
	this.comment = comment;
}


public UUID getId() {
	return id;
}


public void setId(UUID id) {
	this.id = id;
}


public String getMealName() {
	return mealName;
}


public void setMealName(String mealName) {
	this.mealName = mealName;
}


public String getComment() {
	return comment;
}


public void setComment(String comment) {
	this.comment = comment;
}

}