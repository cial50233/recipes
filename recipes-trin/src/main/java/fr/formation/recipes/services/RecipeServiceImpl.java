package fr.formation.recipes.services;

import java.util.List;

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
		
		populateAndSave(dto, recipe);
	}
	
	private void populateAndSave(RecipeCreateDto dto, Recipe recipe){
		
		recipe.setRecipeName(dto.getRecipeName());
		recipe.setPreparingTimeMinutes(dto.getPreparingTimeMinutes());
		recipe.setCookingTimeMinutes(dto.getCookingTimeMinutes());
		recipe.setServings(dto.getServings());
		recipe.setDifficulty(dto.getDifficulty());
		recipe.setDishImageUrl(dto.getDishImageUrl());
		Recipe savedRecipe = recipeRepo.save(recipe);
		
		//Recipe savedRecipe = recipeRepo.findByRecipeName(dto.getRecipeName());

		// add ingredient to table

	/*	for (IngredientCreateDto ingredien : dto.getIngredients()) {
			Ingredient ingredient = new Ingredient();
			ingredient.setIngredientWording(ingredien.getIngredientWording());
			ingredient.setRecipe(savedRecipe);
		    ingredientRepository.save(ingredient);

		}
		
	*/
		List<IngredientCreateDto> ingredients = dto.getIngredients();

	    ingredients.forEach(

	        ingredientCreateDto -> {

	          Ingredient ingredientToCreate = new Ingredient();

	          ingredientToCreate.setIngredientWording(ingredientCreateDto.getIngredientWording());

	          ingredientToCreate.setRecipe(savedRecipe);

	          ingredientRepository.save(ingredientToCreate);

	        });

		// add steps to table
/*
		for (StepCreateDto ste : dto.getSteps()) {
			
			step.setStepWording(ste.getStepWording());
			step.setStepOrder(ste.getStepOrder());
			step.setRecipe((savedRecipe));
		    stepRepository.save(step);

		}
	
*/
		List<StepCreateDto> steps = dto.getSteps();

	    steps.forEach(

	        stepCreateDto -> {

	          Step stepToCreate = new Step();

	          stepToCreate.setStepWording(stepCreateDto.getStepWording());
	          
	          stepToCreate.setStepOrder(stepCreateDto.getStepOrder());

	          stepToCreate.setRecipe(savedRecipe);

	          stepRepository.save(stepToCreate);

	        });
	}
}
