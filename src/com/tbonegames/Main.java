package com.tbonegames;


public class Main {

	
	MouseHandler mHandler = new MouseHandler();
	
	public Main() {
		
		mHandler.calculateScreenBoundaries();
		mHandler.startCircularScreen();
		
	}
	
	
	public static void main(String[] args) {

		new Main();
			
			
	}

}
