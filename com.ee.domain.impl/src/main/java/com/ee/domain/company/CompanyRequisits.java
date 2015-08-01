package com.ee.domain.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class CompanyRequisits extends com.ee.core.impl.AbstractPersistentObject {

	public static final String JSON_INN_FIELDNAME = "inn";
	public static final String JSON_KPP_FIELDNAME = "kpp";
	public static final String JSON_OKPO_FIELDNAME = "okpo";
	public static final String JSON_OGRN_FIELDNAME = "ogrn";
	public static final String JSON_OKATO_FIELDNAME = "okato";
	public static final String JSON_OKOPF_FIELDNAME = "okopf";
	public static final String JSON_OKVED_FIELDNAME = "okved";

	protected Map<String, String> reqMap;

	public CompanyRequisits(String id) {
		super(id);
		this.reqMap = new LinkedHashMap<String, String>();
	}

	public CompanyRequisits(String id, String inn, String kpp, String okpo,
			String ogrn, String okato, String okopf, String okved) {
		super(id);
		this.reqMap = new LinkedHashMap<String, String>();
		putAllRequisitsToMap(inn, kpp, okpo, ogrn, okato, okopf, okved);
	}

	public CompanyRequisits(String inn, String kpp, String okpo, String ogrn,
			String okato, String okopf, String okved) {
		super();
		this.reqMap = new LinkedHashMap<String, String>();
		putAllRequisitsToMap(inn, kpp, okpo, ogrn, okato, okopf, okved);
	}

	private void putAllRequisitsToMap(String inn, String kpp, String okpo,
			String ogrn, String okato, String okopf, String okved) {
		this.reqMap.put(JSON_INN_FIELDNAME, inn);
		this.reqMap.put(JSON_KPP_FIELDNAME, kpp);
		this.reqMap.put(JSON_OKPO_FIELDNAME, okpo);
		this.reqMap.put(JSON_OGRN_FIELDNAME, ogrn);
		this.reqMap.put(JSON_OKATO_FIELDNAME, okato);
		this.reqMap.put(JSON_OKOPF_FIELDNAME, okopf);
		this.reqMap.put(JSON_OKVED_FIELDNAME, okved);
	}

	public String getInn() {
		assert reqMap != null;
		return reqMap.get(JSON_INN_FIELDNAME);
	}

	public void setInn(String inn) {
		assert reqMap != null;
		reqMap.put(JSON_INN_FIELDNAME, inn);
	}

	public String getKpp() {
		assert reqMap != null;
		return reqMap.get(JSON_KPP_FIELDNAME);
	}

	public void setKpp(String kpp) {
		assert reqMap != null;
		reqMap.put(JSON_KPP_FIELDNAME, kpp);
	}

	public String getOkpo() {
		assert reqMap != null;
		return reqMap.get(JSON_OKPO_FIELDNAME);
	}

	public void setOkpo(String okpo) {
		assert reqMap != null;
		reqMap.put(JSON_OKPO_FIELDNAME, okpo);
	}

	public String getOgrn() {
		assert reqMap != null;
		return reqMap.get(JSON_KPP_FIELDNAME);
	}

	public void setOgrn(String ogrn) {
		assert reqMap != null;
		reqMap.put(JSON_OGRN_FIELDNAME, ogrn);
	}

	public String getOkato() {
		assert reqMap != null;
		return reqMap.get(JSON_OKATO_FIELDNAME);
	}

	public void setOkato(String okato) {
		assert reqMap != null;
		reqMap.put(JSON_OKATO_FIELDNAME, okato);
	}

	public String getOkopf() {
		assert reqMap != null;
		return reqMap.get(JSON_OKOPF_FIELDNAME);
	}

	public void setOkopf(String okopf) {
		assert reqMap != null;
		reqMap.put(JSON_OKOPF_FIELDNAME, okopf);
	}

	public String getOkved() {
		assert reqMap != null;
		return reqMap.get(JSON_OKVED_FIELDNAME);
	}

	public void setOkved(String okved) {
		assert reqMap != null;
		reqMap.put(JSON_OKVED_FIELDNAME, okved);
	}

}
