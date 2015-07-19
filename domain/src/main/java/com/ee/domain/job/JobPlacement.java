package com.ee.domain.job;

import java.util.Date;

import com.ee.domain.company.Company;

public interface JobPlacement {

	public Company getCompany();
	public Date getStartDate();
	public Date getEndDate();
	public boolean isCurrentJob();
}
