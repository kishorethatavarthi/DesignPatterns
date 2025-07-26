package com.learnings.singleton.breaking;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.learnings.singleton.Test;
import com.learnings.singleton.TestEnum;

public class ReflectionBreaking {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/*
		 * Singleton Breaking with Reflection
		 * In order to do not break singleton in the constructor we will throw exception
		 * 
		 */
		
		//1. We added null check in constructor in Test class so below code
		//will give exception
		
		Test t = Test.getTest();
		System.out.println(t.hashCode());
		
		Constructor<Test> constructor = Test.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Test t2= constructor.newInstance();
		System.out.println(t2.hashCode());
		
		
		
		
		//2.Use enum
		TestEnum testEnum1 = TestEnum.INSTANCE;
		System.out.println(testEnum1.hashCode());
		
		TestEnum testEnum2 = TestEnum.INSTANCE;
		System.out.println(testEnum2.hashCode());
		
		testEnum1.show();
		
		testEnum2.show();
		
	}

}
