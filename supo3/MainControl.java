package uk.ac.cam.hh645.OOP.supo3;
import java.util.ArrayList;

public class MainControl{
	private UserInterface ui;
	private ArrayList<Pet> pets;
	public MainControl(UserInterface ui) {
        this.ui = ui;
        this.pets = new ArrayList<>();
    }

	public void start() {
        while (true) {
            ui.showOutput("\n1. Manage your pets\n2. Add a new pet\n3. Quit\nYour choice (1, 2, or 3): ");
            String choice = ui.takeInput();
            switch (choice) {
                case "1":
                    managePets();
                    break;
                case "2":
                    addPet();
                    break;
                case "3":
                    return;
                default:
                    ui.showOutput("Invalid choice. Please try again.");
            }
        }
    }

    private void managePets() {
        if (pets.isEmpty()) {
            ui.showOutput("You have no pets. Please add a pet first.");
            return;
        }

        while (true) {
            ui.showOutput("\n1. feed\n2. feed all\n3. play\n4. sleep\n5. back to main menu\nYour choice (1, 2, 3, or 4): ");
            String choice = ui.takeInput();
            int i;
            int petIndex;

            switch (choice) {
                case "1":
                	i = 1;
                	for(Pet p: this.pets){
                		System.out.println(i + ".");
                		p.showInfo();
                		i++;
                	}
                    ui.showOutput("Select which pet to feed (1-"+this.pets.size()+"): ");
                    petIndex = Integer.parseInt(ui.takeInput()) - 1;
                    if (petIndex >= this.pets.size() || petIndex < 0) {
                    	ui.showOutput("Invalid input");
                    } else {
                        this.pets.get(petIndex).feed();
                    }
                    break;

                case "2":
                    for (Pet p : this.pets) {
                        p.feed();
                    }
                    break;

                case "3":
                    i = 1;
                	for(Pet p: this.pets){
                		System.out.println(i + ".");
                		p.showInfo();
                		i++;
                	}
                    ui.showOutput("Select which pet to play with (1-"+this.pets.size()+"): ");
                    petIndex = Integer.parseInt(ui.takeInput()) - 1;
                    if (petIndex >= this.pets.size() || petIndex < 0) {
                    	ui.showOutput("Invalid input");
                    } else {
                        this.pets.get(petIndex).play();
                    }
                    break;

                case "4":
                    i = 1;
                	for(Pet p: this.pets){
                		System.out.println(i + ".");
                		p.showInfo();
                		i++;
                	}
                    ui.showOutput("Select which pet to put to sleep (1-"+this.pets.size()+"): ");
                    petIndex = Integer.parseInt(ui.takeInput()) - 1;
                    if (petIndex >= this.pets.size() || petIndex < 0) {
                    	ui.showOutput("Invalid input");
                    } else {
                        this.pets.get(petIndex).sleep();
                    }
                    break;

                default:
                    ui.showOutput("Returning to main menu.");
                    return;
            }
        }
    }
    private void addPet() {
    	ui.showOutput("We have following types of pets:");
        ui.showOutput("\n1. Dog\n2. Ninja\n3. Robot\nYour choice (1, 2, or 3): ");
        String choice = ui.takeInput();

        ui.showOutput("Enter a name for your new pet:");
        String petName = ui.takeInput();

        Pet p = null;

        switch (choice) {
            case "1":
                p = new Dog(petName, ui);
                break;
            case "2":
                p = new Ninja(petName, ui);
                break;
            case "3":
                p = new Robot(petName, ui);
                break;
            default:
                ui.showOutput("Invalid choice. Pet not added.");
                return;
        }

        pets.add(p);
        ui.showOutput(petName + " has been added to your pets.");
    }
}