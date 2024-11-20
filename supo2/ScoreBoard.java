package uk.ac.cam.hh645.OOP.supo2;
import java.util.ArrayList;

public class ScoreBoard{
	public ArrayList<Player> playerData;
	public ScoreBoard(){
		this.playerData = new ArrayList<>();
	}
	public void updateList(Player player){
		int i = 0;
		while (i < playerData.size() && this.playerData.get(i) != player){
			i += 1;
		}
		if (i >= playerData.size()){
			this.playerData.add(player);
		}
		i -= 1;
		while (i > 0 && player.getBestScore() > this.playerData.get(i).getBestScore()){
			this.playerData.set(i + 1, this.playerData.get(i));
			this.playerData.set(i, player);
			i -= 1;
		}
	}
	public void display(){
		for(Player p : this.playerData){
			System.out.println(p.getNickname() + " " + p.getBestScore());
		}
	}
}
