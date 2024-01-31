package com.MealApi.MealApi.api;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.MealApi.MealApi.api.model.Meal;

import jakarta.transaction.Transactional;

public interface MealRepository extends CrudRepository <Meal,Integer> {

	@Transactional
	@Modifying
	@Query("UPDATE Meal m SET m.comment = :newComment WHERE m.id = :id")
	void editComment(@Param ("newComment") String newComment,@Param("id") int id);

}
