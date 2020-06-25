package fr.formation.recipes.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class IngredientCreateDto {

    @NotNull
    private Long recipeId;


    @NotBlank
    @Size(max = 255)
    private String ingredientWording;


	public IngredientCreateDto() {
		// TODO Auto-generated constructor stub
	}


	public Long getRecipeId() {
		return recipeId;
	}


	public void setRecipeId(Long recipeId) {
		this.recipeId = recipeId;
	}


	public String getIngredientWording() {
		return ingredientWording;
	}


	public void setIngredientWording(String ingredientWording) {
		this.ingredientWording = ingredientWording;
	}


	@Override
	public String toString() {
		return "IngredientCreateDto [recipeId=" + recipeId + ", ingredientWording=" + ingredientWording + "]";
	}
    
    

}
