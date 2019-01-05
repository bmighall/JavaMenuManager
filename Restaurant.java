/* 
 * University of Mississippi - CSCI 112
 * Project 2
 * Ben Mighall
 * July 10th, 2016
 */

package project2;

import java.text.DecimalFormat;

public class Restaurant {
	
	private String name;
	private int entreeCount;
	private Entree[] entreeList = new Entree[10];
	DecimalFormat decimal = new DecimalFormat("#.00");
	
	public Restaurant(){
		name = "";
	}
	
	public Restaurant(String newName){
		name = newName;
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	public void addEntree(String newName, String newDescription, double newCost){
		entreeList[entreeCount] = new Entree(newName, newDescription, newCost);
		entreeCount++;
	}
	
	public String getName(){
		return name;
	}
	
	public int getCount(){
		return entreeCount;
	} 
	
	public void getEntreeInfo(){
		for (int i = 0; i < entreeList.length; i++){
			//System.out.println(entreeList[i].getName() + ": " + entreeList[i].getDescription() + "; Cost: $" + decimal.format(entreeList[i].getCost()));
			System.out.println(entreeList[i].toString());
		}
		
	}
	
	public String averageCost(){
		double calcAveCost = 0.0;
		for(int i = 0; i < entreeCount; i++){
			calcAveCost += entreeList[i].getCost();
		}
		calcAveCost = calcAveCost/entreeCount;
		String average = decimal.format(calcAveCost);
		return average;
	}
	
	public void sortByEntreeCost(){
		int j;                    
		double key;               
		int i;
		Entree saved = new Entree();
		for (j = 1; j < entreeList.length; j++){    
			key = entreeList[j].getCost();
			saved = entreeList[j];
			for(i = j - 1; (i >= 0) && (entreeList[i].getCost() < key); i--){
				entreeList[ i+1 ] = entreeList[ i ];
			}
			entreeList[ i+1 ] = saved;    
		}
	}
	
	public void entreesUnderTenDollars(){
		boolean affordable = false;
		for(int i = 0; i < entreeList.length; i++){
			if(entreeList[i].getCost() < 10){
				affordable = true;
			}
		}if(affordable){
			System.out.println("Entrees offered at this restaurant priced less than $10: ");
			for(int i = 0; i < entreeList.length; i++){
				if(entreeList[i].getCost() < 10){
					System.out.println(entreeList[i].toString());
				}
			}
		}else{
			System.out.println("This restaurant does not have any entrees priced at less than $10.");
		}
		
	}
	
}
