package com.cg.bean;

import java.util.ArrayList;

public class Player {
	
	private String pname;
	private ArrayList<Game> played;
	
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public ArrayList<Game> getPlayed() {
		return played;
	}
	public void setPlayed(ArrayList<Game> played) {
		this.played = played;
	}

}
