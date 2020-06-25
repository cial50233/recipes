package fr.formation.recipes.services;

import org.springframework.stereotype.Service;

import fr.formation.recipes.dtos.IngredientCreateDto;
import fr.formation.recipes.entities.Ingredient;
import fr.formation.recipes.entities.Recipe;
import fr.formation.recipes.repositories.IngredientJpaRepository;
import fr.formation.recipes.repositories.RecipeJpaRepository;

@Service
public class IngredientServiceImpl implements IngredientService {


    private final IngredientJpaRepository ingredientRepository;
    private final RecipeJpaRepository recipeRepository;



    public IngredientServiceImpl(IngredientJpaRepository ingredientRepository, RecipeJpaRepository recipeRepository) {

        this.ingredientRepository = ingredientRepository;
        this.recipeRepository = recipeRepository;

    }
	
	@Override
	public void create(IngredientCreateDto dto) {

        Ingredient ingredient = new Ingredient();
        populateAndSave(dto, ingredient);

	}
	

    private void populateAndSave(IngredientCreateDto dto, Ingredient ingredient){

       ingredient.setIngredientWording(dto.getIngredientWording());

        Recipe recipe = recipeRepository.getOne(dto.getRecipeId());

       ingredient.setRecipe(recipe);

       ingredientRepository.save(ingredient);

    }

}
