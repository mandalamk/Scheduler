package com.cg.bean;

import java.util.ArrayList;

public class Day {
	
	private String dname;
	private ArrayList<Game> onday;
	
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public ArrayList<Game> getOnday() {
		return onday;
	}
	public void setOnday(ArrayList<Game> onday) {
		this.onday = onday;
	}

}
