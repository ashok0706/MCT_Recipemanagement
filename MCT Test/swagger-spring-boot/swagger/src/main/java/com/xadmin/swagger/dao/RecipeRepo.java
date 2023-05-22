package com.xadmin.swagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xadmin.swagger.model.Recipe;

public interface RecipeRepo extends JpaRepository<Recipe, String> {

}
