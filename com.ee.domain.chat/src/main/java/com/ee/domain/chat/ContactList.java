package com.ee.domain.chat;

import java.util.Set;

import com.ee.domain.user.User;

public interface ContactList {

	public String getOwnerUserName();

	public Set<String> getUserNames();

	public void addUser(User user);

	public void removeUser(User user);

	public void removeUser(String userName);
}
