package com.coderscampus.ogulcanassignment9.web;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.ogulcanassignment9.domain.Recipe;
import com.coderscampus.ogulcanassignment9.service.FileService;

@RestController
public class FileController {

	@Autowired
	private FileService fileService;

	@GetMapping("/all-recipes")
	public List<Recipe> getAllRecipes() throws IOException {
		 List<Recipe> list =  fileService.readFile("recipe.txt");
		 return list;
		
		
		
	}
	
	
	@GetMapping("/gluten-free") 
	public List<Recipe>  getGlutenFree() throws Exception {
		List<Recipe> list = fileService.readFile("recipe.txt");
		return list.stream()
			.filter(item -> item.getGlutenFree())
			.collect(Collectors.toList());
	}
	
	@GetMapping("/vegan-and-gluten-free")
	public List<Recipe>  getVeganAndGlutenFree() throws Exception {
		List<Recipe> list = fileService.readFile("recipe.txt");
		return list.stream()
			.filter(item -> item.getGlutenFree())
			.filter(i -> i.getVegan())
			.collect(Collectors.toList());
	}
	@GetMapping("/vegetarian")
	public List<Recipe>  getVegetarian() throws Exception {
		List<Recipe> list = fileService.readFile("recipe.txt");
		return list.stream()
			.filter(item -> item.getVegetarian())
			.collect(Collectors.toList());
	}
	
	
}
