// package com.MealApi.MealApi.service;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.UUID;

// import org.springframework.stereotype.Service;

// import com.MealApi.MealApi.api.model.Meal;

// @Service
// public class MealService {

// 	private List<Meal> mealList;
	
// 	public MealService() {
// 		mealList = new ArrayList<>();
// 		mealList.add(new Meal("Tikamasala", "gott"));
// 		mealList.add(new Meal("Kött", "gött mos"));
// 		mealList.add(new Meal("Taco", "gött mos"));
// 		mealList.add(new Meal("Gröt", "gött mos"));
// 		mealList.add(new Meal("PyttiPanna", "gött mos"));
		
// 	}

// 	public Meal getMeal(UUID id) {
// 		return mealList.stream()
// 		.filter(meal -> id.equals(meal.getId()))
// 		.findFirst()
// 		.orElse(null);
// 	}

// 	public List<Meal> getMeals() {
// 		return mealList;
// 	}

// 	public Meal addMeal(Meal meal) {
// 		mealList.add(meal);
// 		return meal;
// 	}

// 	public Meal removeMeal(UUID id) {
// 		Meal meal = getMeal(id);
// 		if (meal != null) {
// 			mealList.remove(meal);
// 		}
// 		return meal;	
// 	}

// 	public Meal editMeal (UUID id) {
// 		return null;
// 	}

// 	public Meal editComment() {
// 		return null;
// 	}
// }
