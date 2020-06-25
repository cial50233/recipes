package fr.formation.recipes.dtos;

public class StepDto {

	private String stepWording;

	private short stepOrder;

	private Long recipeId;

	public StepDto() {
		// TODO Auto-generated constructor stub
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

	public Long getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(Long recipeId) {
		this.recipeId = recipeId;
	}

	@Override
	public String toString() {
		return "SteoCreateDto [stepWording=" + stepWording + ", stepOrder=" + stepOrder + ", recipeId=" + recipeId
				+ "]";
	}
}
