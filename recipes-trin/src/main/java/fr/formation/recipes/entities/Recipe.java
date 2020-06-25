package fr.formation.recipes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "recipes", uniqueConstraints = @UniqueConstraint(name = "uk_recipe_name", columnNames = {"recipe_name" }))
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_recipe")
	private Integer idRecipe;

	@Column(name = "recipe_name", nullable = false, length = 100)
	private String recipeName;

	@Column(name = "preparing_time_minutes", nullable = false, length = 6)
	private short preparingTimeMinutes;

	@Column(name = "cooking_time_minutes", length = 6)
	private short cookingTimeMinutes;

	@Column(name = "servings", nullable = false)
	private short servings;

    @Column(name = "difficulty", nullable = false)
    @Enumerated(EnumType.STRING)
	private Difficulty difficulty;

	@Column(name = "dish_image_url", nullable = false, length = 2500)
	private String dishImageUrl;

	public Recipe() {
	}

	public Integer getIdRecipe() {
		return idRecipe;
	}

	public void setIdRecipe(Integer idRecipe) {
		this.idRecipe = idRecipe;
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

	
	
}
