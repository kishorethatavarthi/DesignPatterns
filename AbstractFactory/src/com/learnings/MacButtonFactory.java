package com.learnings;

public class MacButtonFactory implements ButtonFactory {

	@Override
	public Button getButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

}
