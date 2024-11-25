package uk.ac.cam.hh645.OOP.supo3;

public class Robot extends Pet{
	public Robot(String name, UserInterface ui){
		super(name, ui);
	}

	@Override
	public void feed(){
		if (!this.isAlive){
			this.ui.showOutput(this.name+ "'s battery has broken");
			return;
		}
		System.out.println(this.name + " loves the taste of 220V a.c.");
		if (this.hunger >= 20){
			this.ui.showOutput(this.name + "'s battery has broken, it has died");
			this.isAlive = false;
		} else if (this.hunger >= 10){
			this.ui.showOutput("the battery is fully charged, you are going you break it");
			this.hunger += 3;
		} else {
			this.hunger = 10;
			this.ui.showOutput("charged 30%...");
			this.ui.showOutput("charged 50%...");
			this.ui.showOutput("charged 80%...");
			this.ui.showOutput("charged 99%...");
			this.ui.showOutput("charged 100%!");
		}
	}

	@Override
	public void play(){
		if (!this.isAlive){
			this.ui.showOutput(this.name+ "'s battery has broken");
			return;
		}
		if (this.hunger < 0){
			this.ui.showOutput(this.name + " has run out of enery, please connect it to an 220V a.c. supply");
		}else {
			this.ui.showOutput("playing chess with " + this.name + "...");
			this.ui.showOutput("you win the game, " + this.name + " admits you are an expert in chess");
			if (this.hunger <= 4){
				this.ui.showOutput(this.name + "'s battery is running low");
			}
			this.hunger -= 4;
		}
	}

	@Override
	public void sleep(){
		if (!this.isAlive){
			this.ui.showOutput(this.name+ "'s battery has broken");
			return;
		}
		this.ui.showOutput(this.name + " don't need to sleep!");
	}
}