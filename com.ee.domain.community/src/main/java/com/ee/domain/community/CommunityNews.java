package com.ee.domain.community;

import java.util.Date;

public interface CommunityNews<T> {

	public String getTitle();

	public String getSubtitle();

	public T getContent();

	public Date getDate();
}
