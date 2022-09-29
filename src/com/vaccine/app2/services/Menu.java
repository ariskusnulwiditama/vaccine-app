package com.vaccine.app2.services;

import java.io.IOException;
import java.util.Scanner;

import com.vaccine.app2.constants.Menus;

public class Menu {
	public static void showMenu() throws IOException{
		 Scanner sc = new Scanner(System.in); 
	      
			 	System.out.println(Menus.MENU1);
			 	System.out.println(Menus.MENU2);
			 	System.out.println(Menus.MENU3);
			 	System.out.println(Menus.MENU4);
			 	
	            System.out.print("Enter your choice: ");
	          
	            int choice = sc.nextInt();
	            while(choice!=5) {
	            	switch(choice) {
	            	case 1:
						System.out.println("Enter user data");
						// pause
						
						break;
					case 2:
						System.out.println("Enter vaccine data");
						break;
					case 3:
						System.out.println("Enter slot data");
						break;
					case 4:
						System.out.println("Enter appointment data");
						break;
					case 5:
						System.out.println("Exit");
						break;
					default:	
					System.out.println("Invalid choice");
					break;
	            	
	           		 }
					
				}
	         
	}
	
}
