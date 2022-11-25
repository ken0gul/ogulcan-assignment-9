package com.coderscampus.ogulcanassignment9.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Recipe {
	public Recipe() {

	}

	private Integer cookingMinutes;

	private Boolean dairyFree;

	private Boolean glutenFree;

	private String instructions;

	private Double preparationMinutes;

	private Double pricePerServing;

	private Double readyInMinutes;

	private Integer servings;

	private Double spoonacularScore;

	private String title;

	private Boolean vegan;

	private Boolean vegetarian;

	public Integer getCookingMinutes() {
		return cookingMinutes;
	}

	public void setCookingMinutes(Integer cookingMinutes) {
		this.cookingMinutes = cookingMinutes;
	}

	public Boolean getDairyFree() {
		return dairyFree;
	}

	public void setDairyFree(Boolean dairyFree) {
		this.dairyFree = dairyFree;
	}

	public Boolean getGlutenFree() {
		return glutenFree;
	}

	public void setGlutenFree(Boolean glutenFree) {
		this.glutenFree = glutenFree;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public Double getPreparationMinutes() {
		return preparationMinutes;
	}

	public void setPreparationMinutes(Double preparationMinutes) {
		this.preparationMinutes = preparationMinutes;
	}

	public Double getPricePerServing() {
		return pricePerServing;
	}

	public void setPricePerServing(Double pricePerServing) {
		this.pricePerServing = pricePerServing;
	}

	public Double getReadyInMinutes() {
		return readyInMinutes;
	}

	public void setReadyInMinutes(Double readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}

	public Integer getServings() {
		return servings;
	}

	public void setServings(Integer servings) {
		this.servings = servings;
	}

	public Double getSpoonacularScore() {
		return spoonacularScore;
	}

	public void setSpoonacularScore(Double spoonacularScore) {
		this.spoonacularScore = spoonacularScore;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getVegan() {
		return vegan;
	}

	public void setVegan(Boolean vegan) {
		this.vegan = vegan;
	}

	public Boolean getVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(Boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	@Override
	public String toString() {
		return "Recipe [cookingMinutes=" + cookingMinutes + ", dairyFree=" + dairyFree + ", glutenFree=" + glutenFree
				+ ", instructions=" + instructions + ", preparationMinutes=" + preparationMinutes + ", pricePerServing="
				+ pricePerServing + ", readyInMinutes=" + readyInMinutes + ", servings=" + servings
				+ ", spoonacularScore=" + spoonacularScore + ", title=" + title + ", vegan=" + vegan + ", vegetarian="
				+ vegetarian + "]";
	}

}
