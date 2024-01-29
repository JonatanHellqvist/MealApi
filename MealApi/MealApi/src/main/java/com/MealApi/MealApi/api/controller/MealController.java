package com.MealApi.MealApi.api.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MealApi.MealApi.api.model.Meal;
import com.MealApi.MealApi.service.MealService;

@RestController
public class MealController {
	
	private MealService mealService;

	@Autowired
	public MealController(MealService mealService) {
		this.mealService = mealService;
	}

	@GetMapping("/meal")
	public Meal getMeal(@RequestParam UUID id) {
		return mealService.getMeal(id);
	}

	@GetMapping("/meals")
	public List<Meal> getMeals() {
		return mealService.getMeals();
	}

	@PostMapping ("/meal")
	public Meal addMeal(@RequestBody Meal meal) {
		System.out.println("new meal: " + meal);
		return mealService.addMeal(meal);
	}

	@DeleteMapping ("/meal/delete")
	public Meal removeMeal(@RequestParam UUID id) {
		return mealService.removeMeal(id);
	}

	@PatchMapping ("/meal/edit")
	public Meal editMeal (@RequestParam UUID id) {
		return null;
	}

	@PatchMapping ("/meal/editcomment")
	public Meal editMealComment () {
		return null;
	}
}
