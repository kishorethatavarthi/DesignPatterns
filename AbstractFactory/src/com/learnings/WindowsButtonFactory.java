package com.learnings;

public class WindowsButtonFactory implements ButtonFactory {

	@Override
	public Button getButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

}
