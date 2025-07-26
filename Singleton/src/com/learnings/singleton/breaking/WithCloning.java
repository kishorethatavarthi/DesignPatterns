package com.learnings.singleton.breaking;

import com.learnings.singleton.Test;

public class WithCloning {
	
	/*
	 * If we override the clone method and return same object then it will solve
	 */
	public static void main(String[] args) {
		Test t = Test.getTest();
		System.out.println(t.hashCode());
		
		Test t2= (Test)t.clone();
		System.out.println(t2.hashCode());
	}

}
