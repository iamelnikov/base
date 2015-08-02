package com.ee.domain.chat.impl;

import java.util.Collections;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.core.impl.CollectionTools;
import com.ee.domain.chat.Chat;

public abstract class ChatImpl<T> extends AbstractPersistentObject implements
		Chat<T> {

	protected String title;

	protected Set<T> participantUserNameSet;

	protected boolean secure;

	protected final T originator;

	public ChatImpl(String id, String title, T originator,
			Set<T> participantUserNameSet) {
		super(id);
		this.title = title;
		this.participantUserNameSet = participantUserNameSet;
		this.originator = originator;
	}

	public ChatImpl(String title, T originator, Set<T> participantUserNameSet) {
		super();
		this.title = title;
		this.participantUserNameSet = participantUserNameSet;
		this.originator = originator;
	}

	public ChatImpl(String id, String title, T originator) {
		super(id);
		this.title = title;
		this.originator = originator;
	}

	public ChatImpl(String title, T originator) {
		super();
		this.title = title;
		this.originator = originator;
	}

	public String getTitle() {
		return title;
	}

	protected Set<String> getParticipantUserNamesFromUserObjectSet() {
		if (this.participantUserNameSet != null) {
			return this.participantUserNameSet.stream()
					.map(it -> getIdentifiedStringFromUserObject(it))
					.collect(Collectors.toSet());
		} else
			return Collections.emptySet();
	}

	protected abstract String getIdentifiedStringFromUserObject(T user);

	public Set<String> getParticipantUserNames() {
		return Collections
				.unmodifiableSet(getParticipantUserNamesFromUserObjectSet());
	}

	@Override
	public boolean isSecure() {
		return this.secure;
	}

	public void setSecure(boolean secure) {
		this.secure = secure;
	}

	@Override
	public void addParticipant(T chatParticipant) {
		assert chatParticipant != null;
		CollectionTools.initSetAsLinkedHashSetIfNull(participantUserNameSet);
		this.participantUserNameSet.add(chatParticipant);
	}

	@Override
	public void removeParticipant(T chatParticipant) {
		assert chatParticipant != null;
		if (this.participantUserNameSet != null)
			this.participantUserNameSet.remove(chatParticipant);
	}

	@Override
	public void removeParticipantByIdentifiedString(String chatParticipantUserName) {
		assert chatParticipantUserName != null
				&& chatParticipantUserName.trim().length() > 0;
		if (participantUserNameSet != null) {
			Predicate<T> pr = it -> chatParticipantUserName.trim().equals(
					getIdentifiedStringFromUserObject(it));
			CollectionTools.removeObjectFromCollection(participantUserNameSet,
					pr);
		}
	}
}
