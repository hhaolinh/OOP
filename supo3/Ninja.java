package uk.ac.cam.hh645.OOP.supo3;

public class Ninja extends Pet{
	public Ninja(String name, UserInterface ui){
		super(name, ui);
	}

	@Override
	public void feed(){
		if (!this.isAlive){
			this.ui.showOutput(this.name+ " has died");
			return;
		}
		System.out.println("you have given " + this.name + " Some food");
		if (this.hunger >= 20){
			this.ui.showOutput(this.name + " refuses to take any food and plans to assassinate you");
			this.mood = -5;
		} else if (this.hunger >= 10){
			this.ui.showOutput(this.name + " doesn't want more");
			this.hunger += 3;
			this.energy += 5;
			this.mood -= 5;
		} else {
			this.hunger += 3;
			this.energy += 5;
			this.mood += 1;
		}
	}

	@Override
	public void play(){
		if (!this.isAlive){
			this.ui.showOutput(this.name+ " has died");
			return;
		}
		if (this.mood < 0){
			this.ui.showOutput(this.name + " is angry and plans to assassinate you");
		} else if(this.energy < 0){
			this.ui.showOutput(this.name + " is too tired");
			this.mood = -5;
		} else if (this.hunger < 0){
			this.ui.showOutput(this.name + " is too hungry and has died");
			this.isAlive = false;
		}else {
			ui.showOutput("you are fighting with " + this.name + "...");
			if (this.energy <= 3){
				this.ui.showOutput(this.name + " is getting tired");
			} else if (this.hunger <= 4){
				this.ui.showOutput(this.name + " feels hungry");
			} else {
				this.ui.showOutput(this.name + " enjoys the fight");
			}
			this.hunger -= 4;
			this.mood += 3;
			this.energy -= 3;
		}
	}

	@Override
	public void sleep(){
		if (!this.isAlive){
			this.ui.showOutput(this.name+ " has died");
			return;
		}
		this.ui.showOutput(this.name + " is sleeping...");
		this.mood += 1;
		this.energy += 10;
	}
}