package uk.ac.cam.hh645.OOP.supo2;
import java.util.Random;
import java.util.Scanner;

public class Guess{
	private int target;
	private Difficulty difficulty;
	private int maxguess;
	private int guessNum;
	private boolean win;
	private Player player;

	public Guess(int level, Player player){
		this.difficulty = new Difficulty(level);
		this.maxguess = this.difficulty.calculateMaxguess();
		this.target = this.generateNumber();
		this.guessNum = 0;
		this.win = false;
		this.player = player;
	}

	private int generateNumber(){
		Random rand = new Random();
		return rand.nextInt(200) + 1;
	}

	public int guessing(){
		Scanner reader = new Scanner(System.in);
		int n;
		while (this.guessNum < this.maxguess && !this.win){
			System.out.print("Enter a number between 1 and 200: ");
			n = reader.nextInt();
			if (n < this.target){
				System.out.println("go higher");
			} else if (n > this.target){
				System.out.println("go lower");
			} else{
				System.out.println("you are correct");
				this.win = true;
			}
			this.guessNum += 1;
		}
		if (this.win){
			System.out.println("you win!");
			return this.guessNum;
		} else{
			System.out.println("try again");
			return this.maxguess + 1;
		}
		
	}
}