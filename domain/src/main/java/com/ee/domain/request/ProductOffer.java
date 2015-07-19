package com.ee.domain.request;

import java.util.Date;

import com.ee.domain.product.Product;

public interface ProductOffer {

	public Product getProduct();

	public int getPartSize();

	public String getDetails();

	public String getSalesManagerContact();

	public Date getOfferEndDate();

	public Date getOfferStartDate();
}
