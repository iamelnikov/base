package com.ee.domain.person;

import java.util.Date;

import com.ee.core.PersistentObject;
import com.ee.core.Typed;

/**
 * Документ удостоверяющий личность
 * 
 * @author ilya
 *
 */
public interface PersonIdentityDocument extends PersistentObject,
		Typed<Integer> {

	public boolean isActual();

	public boolean isBasic();

	public String getSeries();

	public String getNumber();

	public Date getIssueDate();

	public Date getEndDate();

	public String getIssueOrganization();
}
