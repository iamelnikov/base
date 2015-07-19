package com.ee.domain.agreement;

import java.util.Date;

import com.ee.core.PersistentObject;
import com.ee.domain.document.Document;

public interface Agreement<T> extends PersistentObject, Document<T>{
	
	public String getCity();
	public String getNumber();
	public AgreementProducerInfo getProducerInfo();
	public AgreementConsumerInfo getConsumerInfo();
	public Date getSignDate();
	public Date getStartDate();
	public Date getEndDate();
	public double getSum();
	public int getCurrency();
	
	public AgreementTerms getTerms();
	public AgreementSubject getSubject();
	
	public int getState();
	public void activate();
	public void close();
}
