package com.ee.domain.product;

import java.util.Date;

import com.ee.core.impl.AbstractPersistentObject;

public class ProductCatalogItemImpl extends AbstractPersistentObject{

	private ProductImpl product;
	private boolean available;
	private long count;
	private Date expirationDate;
	
	public ProductCatalogItemImpl(String id, ProductImpl product, boolean available, long count, Date expirationDate) {
		super(id);
		this.product = product;
		this.available = available;
		this.count = count;
		this.expirationDate = expirationDate;
	}
	
	public ProductImpl getProduct(){
		return product;
	}
	
	public Boolean isAvailable(){
		return available;
	}
	
	public long getCount(){
		return this.count;
	}

	public void setProduct(ProductImpl product) {
		this.product = product;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
}
