package fr.formation.recipes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Index;
import javax.persistence.UniqueConstraint;
import javax.persistence.ForeignKey;

@Entity
@Table(name = "steps", indexes = @Index(name = "fk_steps_recipes_idx", columnList = "id_recipe"), uniqueConstraints = @UniqueConstraint(name = "uk_recipe_order", columnNames = {"id_recipe", "step_order" }))
public class Step {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_step", length = 11)
	private Integer idStep;

	@JoinColumn(name = "id_recipe", referencedColumnName = "id_recipe", nullable = false, foreignKey = @ForeignKey(name = "fk_steps_recipes"))
	@ManyToOne
	private Recipe recipe;

	@Column(name = "step_wording", nullable = false, length = 255)
	private String stepWording;

	@Column(name = "step_order", nullable = false, length = 6)
	private short stepOrder;

	public Step() {

	}

	public Integer getIdStep() {
		return idStep;
	}

	public void setIdStep(Integer idStep) {
		this.idStep = idStep;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public String getStepWording() {
		return stepWording;
	}

	public void setStepWording(String stepWording) {
		this.stepWording = stepWording;
	}

	public short getStepOrder() {
		return stepOrder;
	}

	public void setStepOrder(short stepOrder) {
		this.stepOrder = stepOrder;
	}

}
