package com.ee.domain.product;

import com.ee.domain.document.Document;

public interface Technology<T> extends Document<T>{

	public String getTechnologyDescription();
}
