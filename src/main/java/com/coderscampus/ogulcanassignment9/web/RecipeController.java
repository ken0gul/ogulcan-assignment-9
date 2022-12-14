package com.coderscampus.ogulcanassignment9.web;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.ogulcanassignment9.domain.Recipe;
import com.coderscampus.ogulcanassignment9.service.FileService;

@RestController
public class RecipeController {	
	
	@GetMapping("/all-recipes")
	public List<Recipe> getAllRecipes() throws IOException {
		FileService fileService = new FileService();
		 
		
		 return fileService.readFile("recipe.txt");
	}
	
	
	@GetMapping("/gluten-free") 
	public List<Recipe>  getGlutenFree() throws Exception {
		FileService fileService = new FileService();
		return fileService.readFile("recipe.txt").stream()
												 .filter(Recipe::getGlutenFree)
												 .collect(Collectors.toList());
	}
	
	@GetMapping("/vegan-and-gluten-free")
	public List<Recipe>  getVeganAndGlutenFree() throws Exception {
		
		FileService fileService = new FileService();
			
			return  fileService.readFile("recipe.txt").stream()
													  .filter(Recipe::getGlutenFree)
													  .filter(Recipe::getVegan)
													  .collect(Collectors.toList());
	}
	
	@GetMapping("/vegetarian")
	public List<Recipe>  getVegetarian() throws Exception {
		FileService fileService = new FileService();
		return fileService.readFile("recipe.txt").stream()
												 .filter(Recipe::getVegetarian)
												 .collect(Collectors.toList());
	}
	
	@GetMapping("/vegan")
	public List<Recipe>  getVegan() throws Exception {
		FileService fileService = new FileService();
		return fileService.readFile("recipe.txt").stream()
												 .filter(Recipe::getVegan)
												 .collect(Collectors.toList());
	}
	
	
}
