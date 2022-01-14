package com.aishwarya.lab2;

public  abstract class MediaItem  extends Item {
	private int runTime;

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public MediaItem(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		
	}

}
