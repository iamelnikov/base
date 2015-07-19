package com.ee.domain.product;


public class NutritiveValueImpl {

//	@JsonProperty("p")
//	@Field("protein")
	private double protein;
	
//	@JsonProperty("c")
//	@Field("carbohydrates")
	private double carbohydrates;
	
//	@JsonProperty("f")
//	@Field("fates")
	private double fats;

	public NutritiveValueImpl(double protein, double carbohydrates, double fats) {
		super();
		this.protein = protein;
		this.carbohydrates = carbohydrates;
		this.fats = fats;
	}

	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}

	public double getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	public double getFats() {
		return fats;
	}

	public void setFats(double fats) {
		this.fats = fats;
	}

}
