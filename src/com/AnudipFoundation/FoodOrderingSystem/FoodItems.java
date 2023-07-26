package com.AnudipFoundation.FoodOrderingSystem;

import java.util.Scanner;

public class FoodItems extends FoodMatarials{
	public static Scanner sc = new Scanner(System.in);
//	  FoodMatarials foodmatarial = new FoodMatarials();
	
	 int choice;
//	  static double total;
//	  static char addItems;
	   String addedItems="";
	
	FoodItems(){
//		starters();
//		main_course();
//		deserts();
//		drinks();
		
		do {
			
			System.out.println("1.Starters \n2.Main Course \n3.Deserts \n4.Drinks \nEnter the Number: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: 
		
//				foodmatarial.starters();	
				starters();
				
				break;
				
			case 2: 
				
			
//				foodmatarial.main_course();
				main_course();
								
				
				break;
				
			case 3: 
				
				
//				foodmatarial.deserts();
				deserts();
				
				break;
				
			case 4: 
				
				
//				foodmatarial.drinks();
				drinks();
				
				
				break;
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
			System.out.println("If you want to add items than 'yes' Or 'no'");
			addItems = sc.next().charAt(0);
			
			
			
			
		}while(addItems == 'y' || addItems == 'Y') ;
		bill();
		
		
	}
	
	
	
	
			
		
		
		
		
		
	
	

	
	public static void main(String[] args) {
		new FoodItems();
	}

}
