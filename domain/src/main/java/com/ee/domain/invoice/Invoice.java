package com.ee.domain.invoice;

import java.util.Date;

import com.ee.core.PersistentObject;
import com.ee.domain.company.Company;
import com.ee.domain.document.Document;

public interface Invoice<T> extends Document<T>, PersistentObject {
	
	public Date getDateOfPreparation();
	public String getNumber();
	
	public InvoiceShipperInfo getInvoiceShipperInfo();
	
	public Company getConsignment();
	public Company getPayer();
	public String getBillOfLading();
	
}
