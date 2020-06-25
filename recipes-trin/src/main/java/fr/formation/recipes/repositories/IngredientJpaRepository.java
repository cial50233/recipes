package fr.formation.recipes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.recipes.entities.Ingredient;

@Repository
public interface IngredientJpaRepository extends JpaRepository<Ingredient, Long> {

}
