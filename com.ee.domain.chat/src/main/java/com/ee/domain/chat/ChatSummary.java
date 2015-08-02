package com.ee.domain.chat;

import java.util.Set;

public interface ChatSummary<T> {

	public Set<ChatSummaryRecord<T>> getRecords();
	
	public void addSummaryRecord(ChatSummaryRecord<T> chatSummaryRecord);
	
	public void removeSummaryRecord(ChatSummaryRecord<T> chatSummaryRecord);
}
