package fr.formation.recipes.dtos;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class StepCreateDto {
	
    @NotBlank
    @Size(max = 255)
    private String stepWording;


    @NotNull
    @Min(1)
    @Max(20)
    private short stepOrder;


    @NotNull
    private Long recipeId;


	public StepCreateDto() {
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
		return "StepCreateDto [stepWording=" + stepWording + ", stepOrder=" + stepOrder + ", recipeId=" + recipeId
				+ "]";
	}
	
}
