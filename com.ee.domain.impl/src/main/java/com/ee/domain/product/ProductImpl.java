package com.ee.domain.product;

import java.util.Map;
import java.util.Set;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.company.Producer;
import com.ee.domain.product.Product;
import com.ee.domain.product.Technology;

//@Document(collection = "PRODUCT")
public class ProductImpl extends AbstractPersistentObject implements Product {

//	private static final String N_JSON_CONSTANT = "n";
//	private static final String NAME_JSON_CONSTANT = "name";
//
//	private static final String CAT_JSON_CONSTANT = "cat";
//	private static final String CATEGORY_JSON_CONSTANT = "category";
//
//	private static final String DSC_JSON_CONSTANT = "dsc";
//	private static final String DESCRIPTION_JSON_CONSTANT = "description";
//
//	private static final String CMP_JSON_CONSTANT = "cmp";
//	private static final String COMPOSITION_JSON_CONSTANT = "composition";
//
//	private static final String THL_JSON_CONSTANT = "thl";
//	private static final String TECHNOLOGY_JSON_CONSTANT = "technology";
//
//	private static final String PRD_JSON_CONSTANT = "prd";
//	private static final String PRODUCER_JSON_CONSTANT = "producer";
//
//	private static final String CHRS_JSON_CONSTANT = "chrs";
//	private static final String CHARACTERISTICS_JSON_CONSTANT = "characteristics";
//
//	private static final String IMGS_JSON_CONSTANT = "imgs";
//	private static final String IMAGESIDS_JSON_CONSTANT = "imagesIds";
//	
//	private static final String REF_JSON_CONSTANT = "ref";
//	private static final String REFERENCE_JSON_CONSTANT = "reference";

//	@JsonProperty(N_JSON_CONSTANT)
//	@Field(NAME_JSON_CONSTANT)
//	@Indexed

//	@JsonProperty(CAT_JSON_CONSTANT)
//	@Field(CATEGORY_JSON_CONSTANT)
//	@Indexed

//	@JsonProperty(DSC_JSON_CONSTANT)
//	@Field(DESCRIPTION_JSON_CONSTANT)

//	@JsonProperty(CMP_JSON_CONSTANT)
//	@Field(COMPOSITION_JSON_CONSTANT)

//	@JsonProperty(THL_JSON_CONSTANT)
//	@Field(TECHNOLOGY_JSON_CONSTANT)

//	@JsonProperty(PRD_JSON_CONSTANT)
//	@Field(PRODUCER_JSON_CONSTANT)
//	@JsonProperty(CHRS_JSON_CONSTANT)
//	@Field(CHARACTERISTICS_JSON_CONSTANT)
//	@JsonProperty(IMGS_JSON_CONSTANT)
//	@Field(IMAGESIDS_JSON_CONSTANT)
//	@JsonProperty(REF_JSON_CONSTANT)
//	@Field(REFERENCE_JSON_CONSTANT)
//	@Indexed(unique = true)
	
	protected String name;
	protected String category;
	protected String description;
	protected SimpleProductComposition composition;
	protected Technology<?> technology;
	protected Producer producer;
	protected Map<String, Double> characteristics;
	protected Set<String> imageIdSet;
	protected String reference;
	
	public ProductImpl(String id, String reference, String name, String category, Producer producer) {
		super(id);
		this.category = category;
		this.reference = reference;
		this.producer = producer;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SimpleProductComposition getComposition() {
		return composition;
	}

	public void setComposition(SimpleProductComposition composition) {
		this.composition = composition;
	}

	public Technology<?> getTechnology() {
		return technology;
	}

	public void setTechnology(Technology<?> technology) {
		this.technology = technology;
	}
	
	public String getReference() {
		return reference;
	}

	@Override
	public Producer getProducer() {
		return this.producer;
	};

}
