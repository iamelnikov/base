package com.ee.domain.agreement;

public interface AdditionalAgreement<T> extends Agreement<T> {
	public Agreement<T> getAgreement();
}
