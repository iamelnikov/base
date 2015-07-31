package com.ee.domain.community;

import java.util.Date;
import java.util.Set;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.person.Person;

public class CommentObject<T> extends AbstractPersistentObject implements Comment<T, String> 
{
	protected AbstractPersistentObject targetObj;
	
	protected Person owner;
	
	protected Date creationDate;
	
	protected String cData;
	
	protected Character cType;
	
	protected CommentObject previousCommentObject;
	
	protected Set<LikeObject> likeObjectSet;
	
	public final AbstractPersistentObject getTargetObj() {
		return targetObj;
	}

	public final void setTargetObj(AbstractPersistentObject targetObj) {
		this.targetObj = targetObj;
	}

	public final Person getOwner() {
		return owner;
	}

	public final void setOwner(Person owner) {
		this.owner = owner;
	}

	public final Date getCreationDate() {
		return creationDate;
	}

	public final void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public final String getcData() {
		return cData;
	}

	public final void setcData(String cData) {
		this.cData = cData;
	}

	public final Character getcType() {
		return cType;
	}

	public final void setcType(Character cType) {
		this.cType = cType;
	}

	public final CommentObject getPreviousCommentObject() {
		return previousCommentObject;
	}

	public final void setPreviousCommentObject(CommentObject previousCommentObject) {
		this.previousCommentObject = previousCommentObject;
	}

	public final Set<LikeObject> getLikeObjectSet() {
		return likeObjectSet;
	}

	public final void setLikeObjectSet(Set<LikeObject> likeObjectSet) {
		this.likeObjectSet = likeObjectSet;
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean wasModified() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Date getModifyDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isRemoved() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Date getRemoveDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getTargetObject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment<T, ?> getPreviousComment() {
		// TODO Auto-generated method stub
		return null;
	}
}
