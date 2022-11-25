package com.coderscampus.ogulcanassignment9.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.coderscampus.ogulcanassignment9.domain.Recipe;

@Service
public class RecipeService {

	@Autowired
	private FileService fileService;

	private List<Recipe> recipes = new ArrayList<>();

	public List<Recipe> getAllRecipes() {

		if (CollectionUtils.isEmpty(recipes)) {
			try {
				recipes = fileService.readFile("recipe.txt");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return recipes;
	}
	
	
	public List<Recipe> getGlutenFree() {
		return getAllRecipes().stream()
				 .filter(Recipe::getGlutenFree)
				 .collect(Collectors.toList());
	}
	
	public List<Recipe> getVeganAndGlutenFree() {
		return getAllRecipes().stream()
				  .filter(Recipe::getGlutenFree)
				  .filter(Recipe::getVegan)
				  .collect(Collectors.toList());
	}
	public List<Recipe> getVegetarian() {
		return getAllRecipes().stream()
				 .filter(Recipe::getVegetarian)
				 .collect(Collectors.toList());
	}
	public List<Recipe> getVegan() {
		return getAllRecipes().stream()
				 .filter(Recipe::getVegan)
				 .collect(Collectors.toList());
	}
}
