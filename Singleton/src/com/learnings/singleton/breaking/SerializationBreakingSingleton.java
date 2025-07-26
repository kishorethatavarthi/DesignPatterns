package com.learnings.singleton.breaking;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.learnings.singleton.Test;

public class SerializationBreakingSingleton {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {	
		/*
		 * If we have readResolve() method then the objects will print same hashcode
		 * otherwise it will return different hash code means two different objects will come
		 */
		Test t = Test.getTest();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.txt"));
		objectOutputStream.writeObject(t);
		System.out.println(t.hashCode());
		
		System.out.println("Test class serialized");
		
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.txt"));
		Test t2= (Test)objectInputStream.readObject();
		System.out.println(t2.hashCode());
	}

}
