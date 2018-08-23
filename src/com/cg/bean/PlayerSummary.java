package com.cg.bean;
import java.util.*;


public class PlayerSummary {
	
	private Player player;
	private HashMap<Game,ArrayList<String>> hmPS;
	
	
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public HashMap<Game,ArrayList<String>> getHmPS() {
		return hmPS;
	}
	public void setHmPS(HashMap<Game,ArrayList<String>> hmPS) {
		this.hmPS = hmPS;
	}

}
