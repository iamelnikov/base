package com.ee.domain.community;

import java.util.List;

public interface Community extends SocialPage {

	public List<CommunityAdmin> getAdminList();

	public List<String> getUserIdList();

	public CommunityNews<?> getNews();
}
