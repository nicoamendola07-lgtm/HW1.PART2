package edu.monmouth.vehicle;

public class Submarine implements Vehicle {
	PowerTypes powerType;
	
	public Submarine(PowerTypes pt) {
		setPowerType(pt);
	}
	
	//SET & GET PowerType
	public void setPowerType(PowerTypes pt) {
		this.powerType = pt;
	}
	public PowerTypes getPowerType() {
		return powerType;
	}
	
	//INTERFACE-BOUND
	public void go() {
		System.out.println("The submarine traverses the ocean");
	}
	public void stop() {
		System.out.println("The submarine haults.");
	}
	public PowerTypes powerBy() {
		System.out.println("Submarine fuels up with "+powerType);
		return powerType;
	}
	
	@Override
	public String toString() {
		return "Submarine's Power Source: "+powerType;
	}
}
