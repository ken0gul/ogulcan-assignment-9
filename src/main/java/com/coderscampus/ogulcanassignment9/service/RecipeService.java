package com.coderscampus.ogulcanassignment9.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
		
		if(CollectionUtils.isEmpty(recipes)) {
			try {
				recipes = fileService.readFile("recipe.txt");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return recipes;
	}
	
}
