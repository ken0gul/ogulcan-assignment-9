package com.coderscampus.ogulcanassignment9.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coderscampus.ogulcanassignment9.domain.Recipe;

@Configuration

public class JavaConfig {

	@Bean
	public Recipe createRecipe() {
		return new Recipe();
	}

}
