package com.ee.domain.chat.impl;

import java.util.Collections;
import java.util.Set;

import com.ee.core.impl.CollectionTools;
import com.ee.domain.chat.ChatSummary;
import com.ee.domain.chat.ChatSummaryRecord;

public class ChatSummaryImpl<T> implements ChatSummary<T> {

	protected Set<ChatSummaryRecord<T>> chatSummaryRecordSet;

	public ChatSummaryImpl() {
		CollectionTools.initSetAsLinkedHashSetIfNull(chatSummaryRecordSet);
	}

	@Override
	public Set<ChatSummaryRecord<T>> getRecords() {
		return Collections.unmodifiableSet(chatSummaryRecordSet);
	}

	@Override
	public void addSummaryRecord(ChatSummaryRecord<T> chatSummaryRecord) {
		assert chatSummaryRecord != null;
		CollectionTools.initSetAsLinkedHashSetIfNull(chatSummaryRecordSet);
		chatSummaryRecordSet.add(chatSummaryRecord);
	}

	@Override
	public void removeSummaryRecord(ChatSummaryRecord<T> chatSummaryRecord) {
		assert chatSummaryRecord != null;
		if (this.chatSummaryRecordSet != null)
			chatSummaryRecordSet.remove(chatSummaryRecord);
	}
}
