package com.learnings.iterator;

import java.util.ArrayList;

public class UserManagement {
	
	private ArrayList<User> list = new ArrayList<>();
	
	public void addUser(User user) {
		list.add(user);
	}
	
	public MyIterator iterator() {
		return new MyIteratorImpl(list);
	}

}
