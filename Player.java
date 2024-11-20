package uk.ac.cam.hh645.OOP.supo2;
import java.util.Scanner;

public class Player{
	private static int id = 0;
	private int playerID;
	private String nickname;
	private int bestScore;
	private Scanner reader;

	public Player(String nickname){
		this.playerID = this.id;
		this.id += 1;
		this.nickname = nickname;
		this.bestScore = 10;
		reader = new Scanner(System.in);
	}

	public void play(ScoreBoard s){
		System.out.print("Enter your difficulty level: ");
		int level = reader.nextInt();
		Guess g = new Guess(level, this);
		int score = g.guessing();
		if (score < this.bestScore){
			this.bestScore = score;
		}
		s.updateList(this);
	}
	public int getBestScore(){
		return this.bestScore;
	}
	public String getNickname(){
		return this.nickname;
	}
}