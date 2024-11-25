package uk.ac.cam.hh645.OOP.supo3;
import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CLI cli = new CLI();
		MainControl mc = new MainControl(cli);

		mc.start();
	}
}