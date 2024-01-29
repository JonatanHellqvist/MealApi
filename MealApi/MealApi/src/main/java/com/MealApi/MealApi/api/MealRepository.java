package com.MealApi.MealApi.api;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.MealApi.MealApi.api.model.Meal;

public interface MealRepository extends CrudRepository <Meal,UUID> {

}
