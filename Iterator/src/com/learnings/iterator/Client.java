package com.learnings.iterator;

public class Client {
	
	public static void main(String[] args) {
		UserManagement management = new UserManagement();
		management.addUser(new User("kishor",22));
		management.addUser(new User("vinay",22));
		management.addUser(new User("ma",21));
		
		MyIterator iterator = management.iterator();
		while(iterator.hasNext()) {
			User user = (User)iterator.next();
			System.out.println(user);
		}
	}

}
