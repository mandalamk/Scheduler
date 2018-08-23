package com.cg.bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GameSummary {
	
	private Game game;
	private Set<String> playerName;
	private Set<String> days;
	
	
	public GameSummary(Game g) {
		// TODO Auto-generated constructor stub
		game = g;
		playerName = new HashSet<String>();
		days = new HashSet<String>();
	}
	
	public Set<String> getDays() {
		return days;
	}
	public void setDays(Set<String> days) {
		this.days = days;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Set<String> getPlayerName() {
		return playerName;
	}
	public void setPlayerName(Set<String> playerName) {
		this.playerName = playerName;
	}

}
