package com.cg.bean;

import java.util.ArrayList;
import java.util.HashMap;

public class DaySummary {
	
	private String day;
	private HashMap<Game,ArrayList<Player>> hmDS;
	
	DaySummary(String day)
	{
		this.day = day;
		hmDS = new HashMap<Game,ArrayList<Player>>();
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
