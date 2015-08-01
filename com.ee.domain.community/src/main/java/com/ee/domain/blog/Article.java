package com.ee.domain.blog;

import java.util.Date;

import com.ee.domain.community.AbstractCommunityActivity;
import com.ee.domain.community.CommunityActivityEntry;

public class Article extends AbstractCommunityActivity<String> implements
		CommunityActivityEntry<String> {

	public Article(String id, String publisherId, String title,
			String description, String content, Date publishDate,
			Date modifyDate, boolean modified, boolean removed, Date removeDate) {
		super(id, publisherId, title, description, content, publishDate,
				modifyDate, modified, removed, removeDate);
	}

	public Article(String id, String publisherId, String title,
			String description, String content) {
		super(id, publisherId, title, description, content);
	}

	public Article(String publisherId, String title, String description,
			String content) {
		super(publisherId, title, description, content);
	}

	@Override
	public String[] getAttachments() {
		// TODO Auto-generated method stub
		return null;
	}

}
