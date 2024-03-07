package com.springcore.constructor;

public class Certi {
	private String cityName;
	private int population;
	public Certi(String cityName, int population){
		this.cityName = cityName;
		this.population = population;
	}
	public String getCityName() {
		return cityName;
	}
	public int getPopulation() {
		return population;
	}
	
}
