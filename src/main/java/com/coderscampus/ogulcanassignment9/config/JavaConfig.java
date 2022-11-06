package com.coderscampus.ogulcanassignment9.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.coderscampus.ogulcanassignment9.domain.Recipe;

@Configuration


public class JavaConfig {

//	
//	@Bean("John")
//	@Scope("prototype")
//	public Recipe createRecipe(Integer cookingMinutes, Boolean dairyFree, Boolean glutenFree, String instructions,
//			Double preparationMinutes, Double pricePerServing, Double readyInMinutes, Integer servings,
//			Double spoonacularScore, String title, Boolean vegan, Boolean vegetarian) {
//	
//	return new Recipe(cookingMinutes,dairyFree,glutenFree,instructions,preparationMinutes,pricePerServing,readyInMinutes,servings,spoonacularScore,title,vegan,vegetarian);
//	}
	
	@Bean
	@Scope("prototype")
	public Recipe createRecipe() {
		return new Recipe();
	}
	
}
