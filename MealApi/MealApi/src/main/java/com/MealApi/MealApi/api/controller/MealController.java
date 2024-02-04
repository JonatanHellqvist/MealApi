package com.MealApi.MealApi.api.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MealApi.MealApi.api.MealRepository;
import com.MealApi.MealApi.api.model.Meal;

@CrossOrigin(origins = "*")
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
	public Meal getMeal(@RequestParam int id) {
		return mealRepository.findById(id).orElse(null);
	}

	@GetMapping("/meals")
	public Iterable<Meal> getMeals() {
		return mealRepository.findAll();
	}

	@PostMapping("/meal")
		public ResponseEntity<Void>addMeal(@RequestBody Meal meal) {
		mealRepository.save(meal);
		return ResponseEntity.ok().build();
	}

	// @PostMapping("/meal")
	// 	public String addMeal(@RequestParam int idMeal, @RequestParam String strMeal, @RequestParam String comment) {

	// 	Meal meal = new Meal();
		
	// 	meal.setId(idMeal);
	// 	meal.setName(strMeal);
	// 	meal.setComment("test");

	// 	mealRepository.save(meal);

	// 	return "redirect:/";
	// 	}

	@DeleteMapping ("/meal")
	public String removeMeal(@RequestParam int id) {
		mealRepository.deleteById(id);
		return "redirect:/";
	}
	
	// @DeleteMapping ("/meal")
	// public ResponseEntity <Void> removeMeal(@RequestParam int id) {
	// 	mealRepository.deleteById(id);
	// 	return ResponseEntity.ok().build();
	// }

	@PatchMapping ("/meal/edit")
	public Meal editMeal (@RequestParam UUID id) {
		return null;
	}

	@PatchMapping ("/meal/editcomment")
	public ResponseEntity<Void> editComment(@RequestParam int id, @RequestParam String comment) {
		mealRepository.editComment(comment, id);
		return ResponseEntity.ok().build();
	}
}
