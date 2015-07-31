package com.ee.domain.community;

import java.util.Date;

import com.ee.core.PersistentObject;

public interface ActivityRecord extends PersistentObject
{
	public Date getUpdateDate();
	public String getData();
}