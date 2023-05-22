package com.xadmin.swagger.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class User {

	
	
	/**
	 * @param userId
	 * @param firstname
	 * @param lastName
	 * @param gmail
	 * @param recipe
	 */
	public User(String userId, String firstname, String lastName, String gmail, List<Recipe> recipe) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.lastName = lastName;
		
		this.gmail = gmail;
		this.recipe = recipe;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String userId;
	private String firstname;
	private String lastName;
	private String gmail;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Recipe>  recipe;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public List<Recipe> getRecipe() {
		return recipe;
	}

	public void setRecipe(List<Recipe> recipe) {
		this.recipe = recipe;
	}
}
