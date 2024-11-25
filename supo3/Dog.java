package uk.ac.cam.hh645.OOP.supo3;

public class Dog extends Pet{
	public Dog(String name, UserInterface ui){
		super(name, ui);
	}

	@Override
	public void feed(){
		if (!this.isAlive){
			this.ui.showOutput(this.name+ " has died");
			return;
		}
		System.out.println("you have fed " + this.name);
		if (this.hunger >= 20){
			this.ui.showOutput(this.name + " was overfed and has died");
			this.isAlive = false;
		} else if (this.hunger >= 10){
			this.ui.showOutput(this.name + " is already full! Stop feeding it!!");
			this.hunger += 3;
			this.energy += 3;
			this.mood -= (this.hunger - 10) / 3;
		} else {
			this.hunger += 3;
			this.energy += 3;
			this.mood += (10 - this.hunger) / 3;
		}
	}

	@Override
	public void play(){
		if (!this.isAlive){
			this.ui.showOutput(this.name+ " has died");
			return;
		}
		if (this.mood < 0){
			this.ui.showOutput(this.name + " doesn't want to play with you");
		} else if(this.energy < 0){
			this.ui.showOutput(this.name + " is too tired and has died");
			this.isAlive = false;
		} else if (this.hunger < 0){
			this.ui.showOutput(this.name + " is too hungry and has died");
			this.isAlive = false;
		}else {
			ui.showOutput("playing frisbee with " + this.name + "...");
			if (this.energy <= 3){
				this.ui.showOutput(this.name + " is getting tired");
			} else if (this.hunger <= 4){
				this.ui.showOutput(this.name + " feels hungry");
			} else {
				this.ui.showOutput("it looks happy!");
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
		this.mood += 5;
		this.energy += 5;
	}
}