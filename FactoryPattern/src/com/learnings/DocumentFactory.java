package com.learnings;

public class DocumentFactory {
	
	/**
	 * 
	 * @param type
	 * @return
	 */
	public Document getDocument(String type) {
		
		if(type==null) {
			System.out.println("Dont send null");
		}
		
		switch(type.toUpperCase()) {
		
		case "WORD" : return new WordDocument();
		
		case "PDF" : return new PDFDocument();
		
		case "TEXT" : return new TextDocument();
		
		default : throw new IllegalArgumentException("Not a correct document");
		}
		
	}

}
