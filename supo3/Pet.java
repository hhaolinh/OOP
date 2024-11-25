package uk.ac.cam.hh645.OOP.supo3;

public abstract class Pet{
	protected String name;
	protected int hunger;
	protected int energy;
	protected int mood;
	protected boolean isAlive;
	protected UserInterface ui;

	public Pet(String name, UserInterface ui){
		this.name = name;
		this.hunger = 10;
		this.energy = 10;
		this.mood = 10;
		this.isAlive = true;
		this.ui = ui;
	}

	public abstract void feed();

	public abstract void play();

	public abstract void sleep();

	public void showInfo(){
		this.ui.showOutput("===============================");
		this.ui.showOutput("name: " + this.name);
		this.ui.showOutput("type: " + this.getClass().getSimpleName());
		this.ui.showOutput("isAlive: " + this.isAlive);
		this.ui.showOutput("===============================");
	};
}


