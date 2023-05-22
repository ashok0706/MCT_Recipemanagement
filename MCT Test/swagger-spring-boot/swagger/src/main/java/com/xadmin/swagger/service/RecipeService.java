package com.xadmin.swagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.xadmin.swagger.dao.RecipeRepo;
import com.xadmin.swagger.dao.UserRepo;
import com.xadmin.swagger.model.Recipe;
import com.xadmin.swagger.model.User;



@Service
public class RecipeService {
   @Autowired
   UserRepo userRepo;
   
   @Autowired
   RecipeRepo recipeRepo;
	
	public void addrecipe(@RequestBody User user ) {
	
		userRepo.save(user);
		
	}

	public List<User> getallrecipes() {
		
		return userRepo.findAll();
	}


	public String updaterecipe(Recipe recipe) {
		Recipe ref = recipeRepo.findById(recipe.getRecipeId()).get();
		if(ref!=null)  {
			recipeRepo.save(recipe);
			return  "recipe Updated";
		}
		return " No Such recipe Id found";
	}

	public Recipe getrecipebyId(String id) {
		
		return recipeRepo.findById(id).get() ;
	}

	public String deleteRecipe(String id) {
		
	 Recipe ref = 	recipeRepo.findById(id).get();
	 if(ref!=null) {
		 recipeRepo.deleteById(id);
		 return "Recipe Succefully deleted";
	 }
	 return "No such Recipe Id Found";
	}

}
