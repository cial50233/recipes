package fr.formation.recipes.services;

import org.springframework.stereotype.Service;

import fr.formation.recipes.dtos.StepCreateDto;
import fr.formation.recipes.entities.Recipe;
import fr.formation.recipes.entities.Step;
import fr.formation.recipes.repositories.RecipeJpaRepository;
import fr.formation.recipes.repositories.StepJpaRepository;

@Service
public class StepServiceImpl implements StepService {

	private final StepJpaRepository stepRepository;
    private final RecipeJpaRepository recipeRepository;



    public StepServiceImpl(StepJpaRepository stepRepository, RecipeJpaRepository recipeRepository) {

        this.stepRepository = stepRepository;
        this.recipeRepository = recipeRepository;

    }



    @Override

    public void create(StepCreateDto dto) {

        Step step = new Step();

        populateAndSave(dto, step);

    }



    private void populateAndSave(StepCreateDto dto, Step step){

        step.setStepOrder(dto.getStepOrder()); 
        step.setStepWording(dto.getStepWording());
        Recipe recipe = recipeRepository.getOne(dto.getRecipeId());
        step.setRecipe(recipe);

        stepRepository.save(step);

    }

}
