package uk.ac.cam.hh645.OOP.supo2;

public class Difficulty{
	private int level;

	public Difficulty(int level){
		this.level = level;
	}
	public int calculateMaxguess(){
		return Math.min(Math.max(5, 10 - this.level), 9) * 2;
	}
}