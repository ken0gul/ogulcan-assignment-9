package com.coderscampus.ogulcanassignment9.service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVFormat.Builder;
import org.apache.commons.csv.CSVRecord;
import  org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.coderscampus.ogulcanassignment9.config.JavaConfig;
import com.coderscampus.ogulcanassignment9.domain.Recipe;

@Service
public class FileService {
	enum headers {
		CookingMinutes, dairyFree, glutenFree, instructions, preparationMinutes, pricePerServing, readyInMinutes,
		servings, spoonacularScore, title, vegan, vegetarian

	}
	List<Recipe> list = new LinkedList<>();

	
	
//	@Autowired
//	private Recipe recipe;

	public List<Recipe> readFile(String fileName) throws IOException {
		
		Reader in = new FileReader(fileName);
		Builder builder = CSVFormat.DEFAULT.builder().setEscape('\\').setIgnoreSurroundingSpaces(true)
				.setIgnoreSurroundingSpaces(true)
				.setHeader(headers.class)
		;
		

		List<CSVRecord> records = builder.build().parse(in).getRecords();
		System.out.println(records.size());
		
	
		
		for (CSVRecord record : records) {
		    ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		    Recipe recipe =  context.getBean(Recipe.class);
			if (record.getRecordNumber() != 1) {
				Integer cookingMinutes = Integer.parseInt(record.get(headers.CookingMinutes));
				Boolean isDairyFree = Boolean.valueOf(record.get(headers.dairyFree));
				Boolean isGlutenFree = Boolean.valueOf(record.get(headers.glutenFree));
				String instructions = record.get(headers.instructions);
				Double prepMinutes =Double.valueOf(record.get(headers.preparationMinutes));
				Double pricePerServing = Double.valueOf(record.get(headers.pricePerServing));
				Double readyInMinutes = Double.parseDouble(record.get(headers.readyInMinutes));
				Integer servings = Integer.valueOf(record.get(headers.servings));
				Double spoonacularScore = Double.valueOf(record.get(headers.spoonacularScore));
				String title =record.get(headers.title);
				Boolean isVegan = Boolean.valueOf(record.get(headers.vegan));
				Boolean isVegaratian= Boolean.valueOf(record.get(headers.vegetarian));
				
				recipe.setCookingMinutes(cookingMinutes);
				recipe.setDairyFree(isDairyFree);
				recipe.setGlutenFree(isGlutenFree);
				recipe.setInstructions(instructions);
				recipe.setPreparationMinutes(prepMinutes);
				recipe.setPricePerServing(pricePerServing);
				recipe.setReadyInMinutes(readyInMinutes);
				recipe.setServings(servings);
				recipe.setSpoonacularScore(spoonacularScore);
				recipe.setTitle(title);
				recipe.setVegan(isVegan);
				recipe.setVegetarian(isVegaratian);
			list.add(recipe);
			
			}
			
		}
		
		
		return list;

	}

}