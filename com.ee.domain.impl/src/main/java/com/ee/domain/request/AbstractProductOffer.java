package com.ee.domain.request;

import java.util.Date;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.product.Product;
import com.ee.domain.request.ProductOffer;

public class AbstractProductOffer extends AbstractPersistentObject implements ProductOffer{
	
//	private static final String P_JSON_PROPERTY_CONSTANT = "p";
//	private static final String PRODUCT_JSON_PROPERTY_CONSTANT = "product";
//	
//	private static final String PS_JSON_PROPERTY_CONSTANT = "ps";
//	private static final String PARTSIZE_JSON_PROPERTY_CONSTANT = "partSize";
//	
//	private static final String D_JSON_PROPERTY_CONSTANT = "d";
//	private static final String DETAILS_JSON_PROPERTY_CONSTANT = "details";
//	
//	private static final String SM_JSON_PROPERTY_CONSTANT = "sm";
//	private static final String SALES_MANAGER_JSON_PROPERTY_CONSTANT = "salesManager";
//	
//	private static final String OED_JSON_PROPERTY_CONSTANT = "oed";
//	private static final String OFFER_END_DATE_JSON_PROPERTY_CONSTANT = "offerEndDate";
//	
//	private static final String OSD_JSON_PROPERTY_CONSTANT = "osd";
//	private static final String OFFER_START_DATE_JSON_PROPERTY_CONSTANT = "offerStartDate";
	
//	@JsonProperty(P_JSON_PROPERTY_CONSTANT)
//	@Field(PRODUCT_JSON_PROPERTY_CONSTANT)
//	@DBRef
	
//	@JsonProperty(PS_JSON_PROPERTY_CONSTANT)
//	@Field(PARTSIZE_JSON_PROPERTY_CONSTANT)
	protected Product product;
	protected int partSize;
	protected String details;
	protected String salesManagerContact;
	protected Date offerEndDate;
	protected Date offerStartDate;
	
//	@JsonProperty(D_JSON_PROPERTY_CONSTANT)
//	@Field(DETAILS_JSON_PROPERTY_CONSTANT)
//	@JsonProperty(SM_JSON_PROPERTY_CONSTANT)
//	@Field(SALES_MANAGER_JSON_PROPERTY_CONSTANT)
//	@JsonProperty(OED_JSON_PROPERTY_CONSTANT)
//	@Field(OFFER_END_DATE_JSON_PROPERTY_CONSTANT)
//	@JsonProperty(OSD_JSON_PROPERTY_CONSTANT)
//	@Field(OFFER_START_DATE_JSON_PROPERTY_CONSTANT)
	
	public AbstractProductOffer(String id) {
		super(id);
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getPartSize() {
		return partSize;
	}

	public void setPartSize(int partSize) {
		this.partSize = partSize;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getSalesManagerContact() {
		return salesManagerContact;
	}

	public void setSalesManagerContact(String salesManagerContact) {
		this.salesManagerContact = salesManagerContact;
	}

	public Date getOfferEndDate() {
		return offerEndDate;
	}

	public void setOfferEndDate(Date offerEndDate) {
		this.offerEndDate = offerEndDate;
	}

	public Date getOfferStartDate() {
		return offerStartDate;
	}

	public void setOfferStartDate(Date offerStartDate) {
		this.offerStartDate = offerStartDate;
	}
}
