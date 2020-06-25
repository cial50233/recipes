package fr.formation.recipes.services;

import org.springframework.stereotype.Service;

import fr.formation.recipes.dtos.IngredientCreateDto;
import fr.formation.recipes.dtos.RecipeCreateDto;
import fr.formation.recipes.dtos.StepCreateDto;
import fr.formation.recipes.entities.Ingredient;
import fr.formation.recipes.entities.Recipe;
import fr.formation.recipes.entities.Step;
import fr.formation.recipes.repositories.IngredientJpaRepository;
import fr.formation.recipes.repositories.RecipeJpaRepository;
import fr.formation.recipes.repositories.StepJpaRepository;

@Service
public class RecipeServiceImpl implements RecipeService{
	
	private final RecipeJpaRepository recipeRepo;
	private final IngredientJpaRepository ingredientRepository;
	private final StepJpaRepository stepRepository;
	
	public RecipeServiceImpl(RecipeJpaRepository recipeRepo, IngredientJpaRepository ingredientRepository, StepJpaRepository stepRepository) {
		this.recipeRepo = recipeRepo;
		this.ingredientRepository = ingredientRepository;
		this.stepRepository = stepRepository;
	}

	@Override
	public void create(RecipeCreateDto dto) {
		Recipe recipe = new Recipe();
		Ingredient ingredient = new Ingredient();
		Step step = new Step();
		
		populateAndSave(dto, recipe, ingredient, step);
	}
	
	private void populateAndSave(RecipeCreateDto dto, Recipe recipe, Ingredient ingredient, Step step){
		
		recipe.setRecipeName(dto.getRecipeName());
		recipe.setPreparingTimeMinutes(dto.getPreparingTimeMinutes());
		recipe.setCookingTimeMinutes(dto.getCookingTimeMinutes());
		recipe.setServings(dto.getServings());
		recipe.setDifficulty(dto.getDifficulty());
		recipe.setDishImageUrl(dto.getDishImageUrl());
		recipeRepo.save(recipe);
		
		Recipe savedRecipe = recipeRepo.findByRecipeName(dto.getRecipeName());
		

		// persisting ingredients

		for (IngredientCreateDto ingredien : dto.getIngredients()) {

			ingredient.setIngredientWording(ingredien.getIngredientWording());
			ingredient.setRecipe(savedRecipe);
		    ingredientRepository.save(ingredient);

		}

		// persisting steps

		for (StepCreateDto ste : dto.getSteps()) {
			step.setStepWording(ste.getStepWording());
			step.setStepOrder(ste.getStepOrder());
			step.setRecipe((savedRecipe));
		    stepRepository.save(step);

		}
	}

}
