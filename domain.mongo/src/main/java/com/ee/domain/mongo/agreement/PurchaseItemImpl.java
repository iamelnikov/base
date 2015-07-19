package com.ee.domain.mongo.agreement;

import com.ee.domain.product.Product;


public class PurchaseItemImpl<T extends Number> {

//	private static final String P_JSON_PROPERTY = "p";
//	private static final String PRODUCT_JSON_PROPERTY = "product";

//	private static final String C_JSON_PROPERTY = "c";
//	private static final String COUNT_JSON_PROPERTY = "count";

//	@Field(P_JSON_PROPERTY)
//	@JsonProperty(PRODUCT_JSON_PROPERTY)
//	@DBRef

//	@JsonProperty(C_JSON_PROPERTY)
//	@Field(COUNT_JSON_PROPERTY)
	
	private Product product;
	private T count;

	public PurchaseItemImpl(Product product) {
		super();
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public T getCount() {
		return count;
	}

	public void setCount(T count) {
		this.count = count;
	}
}
