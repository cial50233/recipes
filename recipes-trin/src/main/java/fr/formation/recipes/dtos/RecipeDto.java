package fr.formation.recipes.dtos;

import java.util.List;

import fr.formation.recipes.entities.Difficulty;

public class RecipeDto {


	private String recipeName;

	private short preparingTimeMinutes;

	private short cookingTimeMinutes;

	private short servings;

	private Difficulty difficulty;

	private String dishImageUrl;
	
    List<IngredientCreateDto> ingredients;
    List<StepCreateDto> steps;



	public List<IngredientCreateDto> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<IngredientCreateDto> ingredients) {
		this.ingredients = ingredients;
	}

	public List<StepCreateDto> getSteps() {
		return steps;
	}

	public void setSteps(List<StepCreateDto> steps) {
		this.steps = steps;
	}

	public RecipeDto() {
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public short getPreparingTimeMinutes() {
		return preparingTimeMinutes;
	}

	public void setPreparingTimeMinutes(short preparingTimeMinutes) {
		this.preparingTimeMinutes = preparingTimeMinutes;
	}

	public short getCookingTimeMinutes() {
		return cookingTimeMinutes;
	}

	public void setCookingTimeMinutes(short cookingTimeMinutes) {
		this.cookingTimeMinutes = cookingTimeMinutes;
	}

	public short getServings() {
		return servings;
	}

	public void setServings(short servings) {
		this.servings = servings;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	public String getDishImageUrl() {
		return dishImageUrl;
	}

	public void setDishImageUrl(String dishImageUrl) {
		this.dishImageUrl = dishImageUrl;
	}

	@Override
	public String toString() {
		return "RecipeDto [recipeName=" + recipeName + ", preparingTimeMinutes=" + preparingTimeMinutes
				+ ", cookingTimeMinutes=" + cookingTimeMinutes + ", servings=" + servings + ", difficulty=" + difficulty
				+ ", dishImageUrl=" + dishImageUrl + "]";
	}
	

}
