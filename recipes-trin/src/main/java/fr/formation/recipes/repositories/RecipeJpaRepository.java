package fr.formation.recipes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.recipes.entities.Recipe;

@Repository
public interface RecipeJpaRepository extends JpaRepository<Recipe, Long> {
		Recipe findByRecipeName(String recipeName);
}
