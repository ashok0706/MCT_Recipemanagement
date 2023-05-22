package com.xadmin.swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.swagger.model.Recipe;
import com.xadmin.swagger.model.User;
import com.xadmin.swagger.service.RecipeService;



@RestController
@RequestMapping("/recipe")
public class RecipeController {

	@Autowired
	RecipeService recipeService;
	
	@PostMapping("/add")
	public String addrecipe (@RequestBody User user ) {
	 	recipeService.addrecipe(user);
	 	return "Recipe Added";
	}
	
	@GetMapping("/getAll")
	public List<User>  getallrecipes(){
		return recipeService.getallrecipes();
	}
	
	@GetMapping("/getbyId/{id}")
	public Recipe  getrecipebyId(@RequestParam String id){
		return recipeService.getrecipebyId(id);
	}
	
	@PutMapping("/update")
	public String updaterecipe(Recipe recipe) {
		return recipeService.updaterecipe(recipe);
	}
	
    @DeleteMapping("/deletebyId/{id}")
    public String deleteRecipe(@RequestParam String id) {
    	return recipeService.deleteRecipe(id);
    }
  
}
