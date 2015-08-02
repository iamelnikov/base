package com.ee.domain.chat.impl;

import com.ee.core.impl.CollectionTools;

public abstract class PrivateChat<U> extends ChatImpl<U> {

	public PrivateChat(String title, U originator, U participant2) {
		super(title, originator);
		CollectionTools.initSetAsLinkedHashSetIfNull(participantUserNameSet);
		this.participantUserNameSet.add(originator);
		this.participantUserNameSet.add(participant2);
	}

	public PrivateChat(String id, String title, U originator, U participant2) {
		super(id, title, originator);
		CollectionTools.initSetAsLinkedHashSetIfNull(participantUserNameSet);
		this.participantUserNameSet.add(originator);
		this.participantUserNameSet.add(participant2);
	}

}
