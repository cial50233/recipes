package fr.formation.recipes.dtos;

public class IngredientDto {
	
    private Long recipeId;

    private String ingredientWording;

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
		return "IngredientDto [recipeId=" + recipeId + ", ingredientWording=" + ingredientWording + "]";
	}
    
    
}
