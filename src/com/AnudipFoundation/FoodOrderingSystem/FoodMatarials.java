package com.AnudipFoundation.FoodOrderingSystem;

import java.util.Scanner;

public class FoodMatarials {
	Scanner sc = new Scanner(System.in);
	
	 int choice;
	  static double total;
	  static char addItems;
	  static String addedItems="";
	
	
	public void drinks() {
		

		System.out.println("1.Masala chai - 15.99Rs\n2.Lassi - 20.49Rs\n3.Mango Shake - 25.49Rs"
				+ "\n4.Badam milk - 30.49Rs\n5.Jal Jeera - 20.49Rs\n6.Rose sharbat - 25.49Rs "
				+ "\n7.Thandai - 30.49Rs\n8.Nimbu Pani - 15.49Rs \n9.Aam Panna - 30.49Rs \n10.Coconut water - 40.49Rs");
		System.out.println("Enter the Number to Select Drinks: ");
		choice = sc.nextInt();
		switch(choice){
			case 1:
				
				addedItems += "\nMasala chai - 15.99Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 15.99;
				
				break;
			case 2:
				
				addedItems += "\nLassi - 20.49Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 20.49;
				break;
				
			case 3:
				
				addedItems += "\nMango Shake - 25.49Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 25.49;
				break;
				
			case 4:
				
				addedItems += "\nBadam milk - 30.49Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 30.49;
				break;
				
			case 5:
				
				addedItems += "\nJal Jeera - 20.49Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 20.49;
				break;
				
			case 6:
				
				addedItems += "\nRose sharbat - 25.49Rs ";
				System.out.println("You have ordered Items: "+addedItems);
				total += 25.49;
				break;
				
			case 7:
				addedItems += "\nThandai - 30.49Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 30.49;
				break;
				
			case 8:
				addedItems += "\nNimbu Pani - 15.49Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 15.49;
				break;
				
			case 9:
				addedItems += "\nAam Panna - 30.49Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 30.49;
				break;
				
			case 10:
				addedItems += "\nCoconut water - 40.49Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 40.49;
				break;
				
			default:
				throw new IllegalArgumentException("This is not in the List: " + choice);
				
				
		}
		
		
	}

	public void deserts() {
		

		System.out.println("1.Gulab Jamun - 25.99Rs\n2.Rasmalai - 30.99Rs\n3.kheer - 30.99Rs"
				+ "\n4.Gajar Halwa - 45.99Rs\n5.Rasgulla - 50.99Rs\n6.Malpua - 60.99Rs "
				+ "\n7.Kulfi - 30.99Rs\n8.Jalebi - 45.99Rs \n9.Coconut Ladoo - 25.99Rs \n10.Peda - 60.99Rs");
		System.out.println("Enter the Number to Select Deserts: ");
		choice = sc.nextInt();
		switch(choice){
			case 1:
				
				addedItems += "\nGulab Jamun - 25.99Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 25.99;
				
				break;
			case 2:
				
				addedItems += "\nRasmalai - 30.99Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 30.99;
				break;
				
			case 3:
				
				addedItems += "\nkheer - 30.99Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 30.99;
				break;
				
			case 4:
				
				addedItems += "\nGajar Halwa - 45.99Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 45.99;
				break;
				
			case 5:
				
				addedItems += "\nRasgulla - 50.99Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 50.99;
				break;
				
			case 6:
				
				addedItems += "\nMalpua - 60.99Rs ";
				System.out.println("You have ordered Items: "+addedItems);
				total += 60.99;
				break;
				
			case 7:
				addedItems += "\nKulfi - 30.99Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 30.99;
				break;
				
			case 8:
				addedItems += "\nJalebi - 45.99Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 45.99;
				break;
				
				
			case 9:
				addedItems += "\nCoconut Ladoo - 25.99Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 25.99;
				break;
				
			case 10:
				addedItems += "\nPeda - 60.99Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 60.99;
				break;
				
			default:
				throw new IllegalArgumentException("This is not in the List: " + choice);
				
				
		}
		
		
	}

	public void main_course() {
		

		System.out.println("1.Dal Makhani - 45.99Rs\n2.Palak Paneer - 60.99Rs\n3.Chana Masala - 70.99Rs"
				+ "\n4.Aloo Gobi - 30.99Rs\n5.Baingan Bharta - 45.99Rs\n6.Malai Kofta - 70.99Rs "
				+ "\n7.Vegetable Biryani - 60.99Rs\n8.Methi Matar Malai - 60.99Rs"
				+ "\n9.Rajma Masala - 65.99Rs\n10.Aloo Jeera - 30.99Rs");
		System.out.println("Enter the Number to Select Main Course: ");
		choice = sc.nextInt();
		switch(choice){
			case 1:
				
				addedItems += "\nDal Makhani - 45.99Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 45.99;
				
				break;
			case 2:
				
				addedItems += "\nPalak Paneer - 60.99R";
				System.out.println("You have ordered Items: "+addedItems);
				total += 60.99;
				break;
				
			case 3:
				
				addedItems += "\nChana Masala - 70.99Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 70.99;
				break;
				
			case 4:
				
				addedItems += "\nAloo Gobi - 30.99Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 30.99;
				break;
				
			case 5:
				
				addedItems += "\nBaingan Bharta - 45.99Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 45.99;
				break;
				
			case 6:
				
				addedItems += "\nMalai Kofta - 70.99Rs ";
				System.out.println("You have ordered Items: "+addedItems);
				total += 70.99;
				break;
				
			case 7:
				addedItems += "\nVegetable Biryani - 60.99Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 60.99;
				break;
				
			case 8:
				addedItems += "\nMethi Matar Malai - 60.99Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 60.99;
				break;
				
			case 9:
				addedItems += "\nRajma Masala - 65.99Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 65.99;
				break;
				
			case 10:
				addedItems += "\nAloo Jeera - 30.99Rs";
				System.out.println("You have ordered Items: "+addedItems);
				total += 30.99;
				break;
				
			default:
				throw new IllegalArgumentException("This is not in the List: " + choice);
				
				
		}
		
		
	}

	public void starters() {
	
	
			
			System.out.println("1.Vegetable Pakoras - 15.00Rs\n2.Samosa - 16.00Rs\n3.Paneer Tikka -  20.99Rs"
					+ "\n4.Aloo Tikki - 25.99Rs\n5.Gobi Manchurian - 30.99Rs\n6.Dahi Puri - 220.99Rs "
					+ "\n7. Hara Bhara Kabab - 30.99Rs\n8. Onion Bhaji - 15.99Rs");
			System.out.println("Enter the Number to Select Starters: ");
			choice = sc.nextInt();
			switch(choice){
				case 1:
					
					addedItems += "\nVegetable Pakoras:   15.00Rs";
					System.out.println("You have ordered Items: "+addedItems);
					total += 15.00;
					
					break;
				case 2:
					
					addedItems += "\nSamosa - 16.00Rs";
					System.out.println("You have ordered Items: "+addedItems);
					total += 16.00;
					break;
					
				case 3:
					
					addedItems += "\nPaneer Tikka -  20.99Rs";
					System.out.println("You have ordered Items: "+addedItems);
					total += 20.99;
					break;
					
				case 4:
					
					addedItems += "\nAloo Tikki - 25.99Rs";
					System.out.println("You have ordered Items: "+addedItems);
					total += 25.99;
					break;
					
				case 5:
					
					addedItems += "\nGobi Manchurian - 30.99Rs";
					System.out.println("You have ordered Items: "+addedItems);
					total += 30.99;
					break;
					
				case 6:
					
					addedItems += "\nDahi Puri - 20.99Rs ";
					System.out.println("You have ordered Items: "+addedItems);
					total += 20.99;
					break;
					
				case 7:
					addedItems += "\nHara Bhara Kabab - 30.99Rs";
					System.out.println("You have ordered Items: "+addedItems);
					total += 30.99;
					break;
					
				case 8:
					addedItems += "\nOnion Bhaji - 15.99Rs";
					System.out.println("You have ordered Items: "+addedItems);
					total += 15.99;
					break;
					
				default:
					throw new IllegalArgumentException("This is not in the List: " + choice);
					
					
			}
			
	}
	
	public void bill() {
		
		 if(addItems == 'n' || addItems == 'N'){
			System.out.println("*************** Please Pay the Bill *************");
			System.out.println("Selected Items: "+ addedItems);
			System.out.println("Total bill: "+ total);
			
		}
		else {
			System.out.println("Invalid Credential");
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
	}

}
