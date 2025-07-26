package com.learnings.singleton;

import java.io.Serializable;

public class Test implements Serializable,Cloneable{
	
	public static Test test;
	
	private Test() {
		if(test!=null) {
			throw new RuntimeException("you are breaking singleton");
		}
		System.out.println("Test is called");
	}
	
	public static Test getTest() {
		if(test==null) {
		synchronized (Test.class) {
			if(test==null) {
				test = new Test();
			}
		}
		}
		
		return test;
	}
	
	public void show() {
		System.out.println("Hash code is"+this.hashCode());
	}
	
	public Object readResolve() {
		return test;
	}
	
	public Object clone() {
		return test;
	}

}
