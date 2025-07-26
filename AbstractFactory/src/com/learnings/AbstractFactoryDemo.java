package com.learnings;

public class AbstractFactoryDemo {
	
	public static void main(String[] args) {
		
		ButtonFactory windowsFactory=new WindowsButtonFactory();
		Button windowsButton=windowsFactory.getButton();
	    windowsButton.paint();
	    
	    ButtonFactory macFactory = new MacButtonFactory();
	    Button macButton = macFactory.getButton();
	    macButton.paint();

	}

}
