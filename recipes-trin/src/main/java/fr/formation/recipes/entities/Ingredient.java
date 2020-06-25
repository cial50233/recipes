package fr.formation.recipes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "ingredients", indexes = {
			@Index(name = "fk_ingredients_recipes_idx", columnList = "id_ingredient") }, uniqueConstraints = 
					@UniqueConstraint(name = "uk_recipe_ingredient", columnNames = {"id_recipe", "ingredient_wording" }))
public class Ingredient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ingredient", length = 11)
	private Integer idIngredient;

	
	@JoinColumn(name = "id_recipe", referencedColumnName = "id_recipe", nullable = false, foreignKey = @ForeignKey(name = "fk_ingredients_recipes"))
	@ManyToOne
	private Recipe recipe;

	@Column(name = "ingredient_wording", nullable = false, length = 255)
	private String ingredientWording;

	public Ingredient() {
	}

	public Integer getIdIngredient() {
		return idIngredient;
	}

	public void setIdIngredient(Integer idIngredient) {
		this.idIngredient = idIngredient;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public String getIngredientWording() {
		return ingredientWording;
	}

	public void setIngredientWording(String ingredientWording) {
		this.ingredientWording = ingredientWording;
	}



}
