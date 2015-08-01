package com.ee.domain.contact;

import java.util.Locale;

import com.ee.domain.contacts.Address;
import com.ee.domain.person.PersonExtended;

//@Document(collection = "LOCATION")
public class AddressImpl extends AbstractContact implements Address {

	// private static final String Z_JSON_PROPERTY = "z";
	// private static final String ZIPCODE_JSON_PROPERTY = "zipCode";
	//
	// private static final String S_JSON_PROPERTY = "s";
	// private static final String STREET_JSON_PROPERTY = "street";
	//
	// private static final String L_JSON_PROPERTY = "l";
	// private static final String LOCATION_JSON_PROPERTY = "location";

	// @JsonProperty(S_JSON_PROPERTY)
	// @Field(STREET_JSON_PROPERTY)
	// @Indexed

	// @JsonProperty(Z_JSON_PROPERTY)
	// @Field(ZIPCODE_JSON_PROPERTY)
	// @Indexed
	// @JsonProperty(L_JSON_PROPERTY)
	// @Field(LOCATION_JSON_PROPERTY)

	// @PersistenceConstructor

	protected String description;
	protected String zipCode;
	protected String country;
	protected String region;
	protected String city;
	protected String street;
	protected int house;
	protected String building;
	protected String block;
	protected double[] geoLocation;

	public AddressImpl(String id, String type, PersonExtended person, String zipCode,
			String country, String region, String street, int house,
			String building, String block, double[] geoLocation) {
		super(id, type, person);
		this.zipCode = zipCode;
		this.country = country;
		this.region = region;
		this.street = street;
		this.house = house;
		this.building = building;
		this.block = block;
		this.geoLocation = geoLocation;
	}

	public AddressImpl(String id, String type, String contactInfo,
			String zipCode, String country, String region, String street,
			int house, String building, String block, double x, double y) {
		super(id, type, contactInfo);
		this.geoLocation = new double[] { x, y };
		this.zipCode = zipCode;
		this.country = country;
		this.region = region;
		this.street = street;
		this.house = house;
		this.building = building;
		this.block = block;
	}

	public AddressImpl(String type, PersonExtended person, String zipCode,
			String country, String region, String street, int house,
			String building, String block, double[] geoLocation) {
		super(type, person);
		this.zipCode = zipCode;
		this.country = country;
		this.region = region;
		this.street = street;
		this.house = house;
		this.building = building;
		this.block = block;
		this.geoLocation = geoLocation;
	}

	public AddressImpl(String type, String contactInfo, String zipCode,
			String country, String region, String street, int house,
			String building, String block, double x, double y) {
		super(type, contactInfo);
		this.geoLocation = new double[] { x, y };
		this.zipCode = zipCode;
		this.country = country;
		this.region = region;
		this.street = street;
		this.house = house;
		this.building = building;
		this.block = block;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getZipCode() {
		return zipCode;
	}

	@Override
	public String getCountry() {
		return country;
	}

	@Override
	public String getRegion() {
		return region;
	}

	@Override
	public String getCity() {
		return city;
	}

	@Override
	public String getStreet() {
		return street;
	}

	@Override
	public int getHouse() {
		return house;
	}

	@Override
	public String getBuilding() {
		return building;
	}

	@Override
	public String getBlock() {
		return block;
	}

	@Override
	public double[] getGeoLocation() {
		return geoLocation;
	}

	@Override
	public String getFullAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFullAddress(Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

}
