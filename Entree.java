/* 
 * University of Mississippi - CSCI 112
 * Project 2
 * Ben Mighall
 * July 10th, 2016
 */

package project2;

import java.text.DecimalFormat;

public class Entree {

	private String name;
	private String description;
	private double cost;
	DecimalFormat decimal = new DecimalFormat("#.00");
	
	public Entree(){
		name = "";
		description = "";
		cost = 0.0;
	}
	
	public Entree(String newName, String newDescription, double newCost){
		name = newName;
		description = newDescription;
		cost = newCost;
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	public void setDescription(String newDescription){
		description = newDescription;
	}
	
	public void setCost(double newCost){
		cost = newCost;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public double getCost(){
		return cost;
	}
	
	public String toString(){
		String s = name + "; " + description + "; Cost: $" + decimal.format(cost);
		return s;
	}
	
}
