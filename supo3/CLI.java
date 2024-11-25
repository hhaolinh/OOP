package uk.ac.cam.hh645.OOP.supo3;
import java.util.Scanner;

public class CLI implements UserInterface{
	private Scanner scanner;

	public CLI(){
		this.scanner = new Scanner(System.in);
	}

	@Override
	public String takeInput(){
		String s = scanner.nextLine();
		clear();
		return s;
	}

	@Override 
	public void showOutput(String msg){
		System.out.println(msg);
	}

	private void clear(){
		System.out.print("\033[H\033[2J");
        System.out.flush();
	}
}