package fr.formation.recipes.dtos;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import fr.formation.recipes.entities.Difficulty;

public class RecipeCreateDto {

	@NotBlank
	@Size(min = 3, max = 100)
	private String recipeName;

	@NotNull
	@Min(value=1)
	@Max(value=120)
	private short preparingTimeMinutes;


	private short cookingTimeMinutes;

	@NotNull
	@Min(value=1)
	@Max(value=10)
	private short servings;

	@NotNull
	private Difficulty difficulty;

	@NotBlank
	@Size(min = 7, max = 2500)
	private String dishImageUrl;
	
    @Size(min = 1, max = 50)
    List<@Valid IngredientCreateDto> ingredients;


    @Size(min = 1, max = 50)
    List<@Valid StepCreateDto> steps;

	public RecipeCreateDto() {
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
	
	

}

