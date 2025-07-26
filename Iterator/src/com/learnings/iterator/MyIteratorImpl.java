package com.learnings.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyIteratorImpl implements MyIterator {
	
	private ArrayList<User> list;
	
	private int position;
	
	public MyIteratorImpl(List<User> list) {
		this.list = (ArrayList<User>) list;
	}

	@Override
	public boolean hasNext() {
		if(position < list.size()) {
			return true;
		}
		
		return false;
	}

	@Override
	public Object next() {
		User user = list.get(position);
		position++;
		return user;
	}

}
