package com.MealApi.MealApi.api.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MealApi.MealApi.api.MealRepository;
import com.MealApi.MealApi.api.model.Meal;


@RestController
public class MealController {
	
	// private MealService mealService;
	
	// @Autowired
	// public MealController(MealService mealService) {
	// 	this.mealService = mealService;
	// }

	@Autowired
	private MealRepository mealRepository;

	@GetMapping("/meal")
	public Meal getMeal(@RequestParam UUID id) {
		return mealRepository.findById(id).orElse(null);
	}

	@GetMapping("/meals")
	public Iterable<Meal> getMeals() {
		return mealRepository.findAll();
	}

	@PostMapping("/meal")
		public String addMeal(@RequestBody Meal meal) {
		mealRepository.save(meal);
		return "redirect:/";
	}

	@DeleteMapping ("/meal")
	public String removeMeal(@RequestParam UUID id) {
		mealRepository.deleteById(id);
		return "redirect:/";
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
