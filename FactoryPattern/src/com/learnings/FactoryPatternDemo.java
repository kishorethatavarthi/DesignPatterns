package com.learnings;

public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		
		DocumentFactory documentFactory=new DocumentFactory();
		
		Document doc1 = documentFactory.getDocument("PDF");
		doc1.open();
		
		Document doc2 = documentFactory.getDocument("WORD");
		doc2.open();
		
		Document doc3=documentFactory.getDocument("TEXT");
		doc3.open();
		
	}

}
