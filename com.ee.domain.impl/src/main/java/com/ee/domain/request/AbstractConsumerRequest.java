package com.ee.domain.request;

import java.util.Date;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.company.Consumer;
import com.ee.domain.request.ConsumerRequest;
import com.ee.domain.request.ConsumerRequestState;

//@Document(collection = "CONSUMER_REQUEST")
public abstract class AbstractConsumerRequest extends AbstractPersistentObject implements ConsumerRequest  {

//	private static final String C_JSON_PROPERTY_CONSTANT = "c";
//	private static final String CONSUMER_JSON_PROPERTY_CONSTANT = "consumer";
//
//	private static final String D_JSON_PROPERTY_CONSTANT = "d";
//	private static final String DESCRIPTION_JSON_PROPERTY_CONSTANT = "description";
//
//	private static final String PN_JSON_PROPERTY_CONSTANT = "pn";
//	private static final String PRODUCT_NAME_JSON_PROPERTY_CONSTANT = "productName";
//	
//	private static final String PT_JSON_PROPERTY_CONSTANT = "pt";
//	private static final String PRODUCT_TYPE_JSON_PROPERTY_CONSTANT = "productType";
//
//	private static final String RD_JSON_PROPERTY_CONSTANT = "rd";
//	private static final String REQUESTDATE_NAME_JSON_PROPERTY_CONSTANT = "requestDate";
//
//	private static final String S_JSON_PROPERTY_CONSTANT = "s";
//	private static final String STATE_NAME_JSON_PROPERTY_CONSTANT = "state";
//	
//	private static final String CNT_JSON_PROPERTY_CONSTANT = "cnt";
//	private static final String COUNT_JSON_PROPERTY_CONSTANT = "count";
//	
//	private static final String MT_JSON_PROPERTY_CONSTANT = "mt";
//	private static final String MEASURE_TYPE_JSON_PROPERTY_CONSTANT = "measureType";

//	@JsonProperty(C_JSON_PROPERTY_CONSTANT)
//	@Field(CONSUMER_JSON_PROPERTY_CONSTANT)
//	@DBRef
//	@JsonProperty(D_JSON_PROPERTY_CONSTANT)
//	@Field(DESCRIPTION_JSON_PROPERTY_CONSTANT)
//	@JsonProperty(PN_JSON_PROPERTY_CONSTANT)
//	@Field(PRODUCT_NAME_JSON_PROPERTY_CONSTANT)
//	@Indexed
//	@JsonProperty(PT_JSON_PROPERTY_CONSTANT)
//	@Field(PRODUCT_TYPE_JSON_PROPERTY_CONSTANT)
//	@JsonProperty(RD_JSON_PROPERTY_CONSTANT)
//	@Field(REQUESTDATE_NAME_JSON_PROPERTY_CONSTANT)
//	@Indexed
//	@JsonProperty(CNT_JSON_PROPERTY_CONSTANT)
//	@Field(COUNT_JSON_PROPERTY_CONSTANT)
//	@Indexed
//	@JsonProperty(MT_JSON_PROPERTY_CONSTANT)
//	@Field(MEASURE_TYPE_JSON_PROPERTY_CONSTANT)
//	@Indexed
//	@JsonProperty(S_JSON_PROPERTY_CONSTANT)
//	@Field(STATE_NAME_JSON_PROPERTY_CONSTANT)
//	@Indexed
	
	
	private Consumer consumer;
	private String description;
	private String productName;
	private int productType;
	private Date requestDate;
	private double count;
	private int measureType;
	private ConsumerRequestState state;

//	@PersistenceConstructor
	public AbstractConsumerRequest(String id, Consumer consumer, String description,
			String productName) {
		super(id);
		this.consumer = consumer;
		this.state = ConsumerRequestState.OPEN;
	}

	public Consumer getConsumer() {
		return consumer;
	}

	public void close() {
		this.state = ConsumerRequestState.CLOSED;
	}

	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductType() {
		return productType;
	}

	public void setProductType(int productType) {
		this.productType = productType;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public double getCount() {
		return count;
	}

	public void setCount(double count) {
		this.count = count;
	}

	public int getMeasureType() {
		return measureType;
	}

	public void setMeasureType(int measureType) {
		this.measureType = measureType;
	}

	public ConsumerRequestState getState() {
		return state;
	}

	public void setState(ConsumerRequestState state) {
		this.state = state;
	}

}
