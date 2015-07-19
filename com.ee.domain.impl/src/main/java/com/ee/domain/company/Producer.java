package com.ee.domain.company;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.ee.domain.contacts.Address;
import com.ee.domain.contacts.Phone;
import com.ee.domain.product.Product;
import com.ee.domain.request.AbstractProductOffer;
import com.ee.domain.user.User;

public class Producer extends AbstractCompany {

//	private static final String PRODUCT_JSON_PROPERTY_CONSTANT = "products";
//	private static final String MANAGERS_JSON_PROPERTY_CONSTANT = "managers";
//	private static final String OFFERS_JSON_PROPERTY_CONSTANT = "offers";

//	@JsonIgnore
//	@Field(PRODUCT_JSON_PROPERTY_CONSTANT)
//	@DBRef
	private Set<Product> products;
//	@JsonIgnore
//	@Field(MANAGERS_JSON_PROPERTY_CONSTANT)
//	@DBRef
	private Set<User> employees;
//	@JsonIgnore
//	@Field(OFFERS_JSON_PROPERTY_CONSTANT)
//	@DBRef
	private Set<AbstractProductOffer> offers;

	public Producer(String id, String friendlyName, String fullName,
			String shortName, Address legalAddress, Address actualAddress,
			List<Phone> phoneList, String website, int industry) {
		super(id, friendlyName, fullName, shortName, legalAddress,
				actualAddress, phoneList, website, industry);
		this.products = new LinkedHashSet<Product>();
		this.employees = new LinkedHashSet<User>();
	}

	public void addProduct(Product product) {
		assert this.products != null;
		this.products.add(product);
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public Set<User> getManagers() {
		return employees;
	}

	public void setManagers(Set<User> employees) {
		this.employees = employees;
	}

	public Set<AbstractProductOffer> getOffers() {
		return offers;
	}

	public void setOffers(Set<AbstractProductOffer> offers) {
		this.offers = offers;
	}

	public void addProductOffer(AbstractProductOffer offer) {
		assert this.offers != null;
		this.offers.add(offer);
	}
}
