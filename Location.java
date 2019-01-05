/* 
 * University of Mississippi - CSCI 112
 * Project 2
 * Ben Mighall
 * July 10th, 2016
 */

package project2;

import java.util.ArrayList;

public class Location {
	
	private String name;
	private ArrayList <Restaurant> eateries = new ArrayList<Restaurant>();
	
	public Location() {
		name = "";
	}
	
	public Location(String newName){
		name = newName;
	}
	
	public void addRestaurant(String newName){
		eateries.add(new Restaurant(newName));	
	}
	
	public void setLocationName(String newName){
		name = newName;
	}
	
	public void setRestaurantName(int index, String newName){
		eateries.get(index).setName(newName);
	}
	
	public void addRestaurantEntree(int index, String newName, String newDescription, double newCost){
		eateries.get(index).addEntree(newName, newDescription, newCost);
	}
	
	public String getLocationName(){
		return name;
	}

	public void printRestaurants(){
		for(int i = 0; i < eateries.size(); i++){
			System.out.println("\nRestaurant's name: " + eateries.get(i).getName());
			eateries.get(i).getEntreeInfo();
			eateries.get(i).averageCost();
		}
	}
	
	public void sortEntrees() {
		for(int i = 0; i < eateries.size(); i++){
			eateries.get(i).sortByEntreeCost();
		}
	}

	public void underTen(){
		for(int i = 0; i < eateries.size(); i++){
			System.out.println("\nRestaurant's name: " + eateries.get(i).getName());
			eateries.get(i).entreesUnderTenDollars();
		}
	}

}
