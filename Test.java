package uk.ac.cam.hh645.OOP.supo2;

public class Test{
	public static void main(String[] args) {
		Player p = new Player("AAA");
		ScoreBoard s = new ScoreBoard();
		p.play(s);
		Player p2 = new Player("BBB");
		p2.play(s);
		s.display();
	}
}