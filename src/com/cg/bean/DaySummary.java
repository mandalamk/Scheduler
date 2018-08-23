package com.cg.bean;

import java.util.ArrayList;
import java.util.HashMap;

public class DaySummary {
	
	private Day day;
	private HashMap<Game,ArrayList<Player>> hmDS;
	
	public DaySummary(Day day)
	{
		this.day = day;
		hmDS = new HashMap<Game,ArrayList<Player>>();
	}
	
	public DaySummary(Day d) {
		// TODO Auto-generated constructor stub
	}

	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public HashMap<Game,ArrayList<Player>> getHmDS() {
		return hmDS;
	}
	public void setHmDS(HashMap<Game,ArrayList<Player>> hmDS) {
		this.hmDS = hmDS;
	}
	

}
