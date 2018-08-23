package com.cg.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import com.cg.bean.Day;
import com.cg.bean.DaySummary;
import com.cg.bean.Game;
import com.cg.bean.GameSummary;
import com.cg.bean.Player;
import com.cg.bean.PlayerSummary;

public class SchedulerDAOImpl {
	
	private ArrayList<PlayerSummary> ps;
	private ArrayList<DaySummary> ds;
	private ArrayList<GameSummary> gs;
	
	private ArrayList<Player> players;
	private ArrayList<Day> days;
	private ArrayList<Game> games;
	
	
	public ArrayList<PlayerSummary> getPs() {
		return ps;
	}
	public void setPs(ArrayList<PlayerSummary> ps) {
		this.ps = ps;
	}
	public ArrayList<DaySummary> getDs() {
		return ds;
	}
	public void setDs(ArrayList<DaySummary> ds) {
		this.ds = ds;
	}
	public ArrayList<GameSummary> getGs() {
		return gs;
	}
	public void setGs(ArrayList<GameSummary> gs) {
		this.gs = gs;
	}
	public ArrayList<Player> getPlayers() {
		return players;
	}
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	public ArrayList<Day> getDays() {
		return days;
	}
	public void setDays(ArrayList<Day> days) {
		this.days = days;
	}
	public ArrayList<Game> getGames() {
		return games;
	}
	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}
		
	
	public Player addPlayer(Player p)
	{
		players.add(p);
		addPlayerSummary(p);
		return p;
	}
	
	public Game addGame(Game g)
	{
		games.add(g);
		addGameSummary(g);
		return g;
	}
	
	public Day addDays(Day d)
	{
		days.add(d);
		return d;
	}
	
	@SuppressWarnings("unchecked")
	public void addPlayerSummary(Player p)
	{
		PlayerSummary pSum = new PlayerSummary(p);
		
		ArrayList<Game> pgm = new ArrayList<Game>();
	
		Iterator<Game> it = pgm.iterator();
		
		while(it.hasNext())
		{
			Game next = it.next();
			pSum.getHmPS().put((Game) next, (ArrayList<String>) gs.get(gs.indexOf(next)).getDays());
		}
		
		ps.add(pSum);
		
	}
	
	public void addGameSummary(Game g)
	{
		GameSummary gSum = new GameSummary(g);
		PlayerSummary pSum;
		
		Iterator<PlayerSummary> it = ps.iterator();
		
		while(it.hasNext())
		{
			pSum = it.next();
			@SuppressWarnings("unchecked")
			Set<String> days2 = (Set<String>) pSum.getHmPS().get(g);
			gSum.setDays(days2);
			gSum.getPlayerName().add(pSum.getPlayer().getPname());
		}
			
		gs.add(gSum);
				
	}
	
	public void addDaySummary(Day d)
	{
		DaySummary dSum = new DaySummary(d);
		
	}

}
