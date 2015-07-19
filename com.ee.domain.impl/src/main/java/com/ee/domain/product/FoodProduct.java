package com.ee.domain.product;

import com.ee.domain.company.Producer;
import com.ee.domain.product.nutrition.NutritionProduct;

public class FoodProduct extends ProductImpl implements NutritionProduct{

//	@JsonProperty("nv")
//	@Field("nutritiveValue")
	protected NutritiveValueImpl nutritiveValue;
	
	protected static final int foodProductType = 1;

	public FoodProduct(String id, String reference, String name, String category, Producer producer) {
		super(id, reference, name, category, producer);
	}

}
