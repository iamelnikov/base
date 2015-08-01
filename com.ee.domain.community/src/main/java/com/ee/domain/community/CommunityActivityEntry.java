package com.ee.domain.community;

import java.util.List;
import java.util.Set;

import com.ee.domain.blog.Attachable;
import com.ee.domain.message.Message;

public interface CommunityActivityEntry<T> extends Message<T>, Attachable {
	public String getTitle();

	public String getDescription();

	public boolean isCommentsAvailable();
	
	public void hideComments();

	public boolean isNewCommentsAddingAvailable();
	
	public void restrictNewComments();

	public List<Comment<?>> getComments();

	public Set<Tag> getTagSet();
	
	public void addTag(Tag tag);
	
	public void removeTag(Tag tag);
	
	public void removeTag(String tag);

	public String getType();

}