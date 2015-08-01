package com.ee.domain.task;

import java.util.Date;

public class ProfessionalTask extends TaskImpl {
	public ProfessionalTask(String id, String publisherId, String title,
			String description, String content, Date publishDate,
			Date modifyDate, boolean modified, boolean removed, Date removeDate) {
		super(id, publisherId, title, description, content, publishDate,
				modifyDate, modified, removed, removeDate);
	}

	public ProfessionalTask(String id, String publisherId, String title,
			String description, String content) {
		super(id, publisherId, title, description, content);
	}

	public ProfessionalTask(String publisherId, String title,
			String description, String content) {
		super(publisherId, title, description, content);
	}
}
