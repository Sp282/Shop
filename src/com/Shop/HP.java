package com.Shop;

import java.util.InputMismatchException;

public class HP extends Laptop {

	HP() {
		super("4GB DDR4 RAM", "1 TB", "15.6-inch screen", "Core i3|6th Gen processor", "Windows 10", "HP", "1366X768", "yes", 30000);
		// TODO Auto-generated constructor stub
	}
	static Laptop h1=new HP();
	static int q=5;
	public static void display() {
		 h1.details();
		 String options="";
		 while(true) {	 
		 System.out.println("Would you like to purchase?\n press 1 for yes and 2 for No");
		   options= Var.scn.nextLine().trim();
		   try {
			   if(options.equals("1") ||options.equals("2"))
				   break;
			   throw new InputMismatchException();
		   }catch(Exception e) {System.out.println("Invalid input");}
		 }
		
			if(options.equalsIgnoreCase("1"))
			{
				if(q<1)
				{
					System.out.println("The item is out of stock");
					Laptop.menu();
					return;
				}
				while(true) {
					//Quantity<Mobile> q1=new Quantity<Mobile>();
				Quantity.ask(q,h1);
				System.out.println("press 1 to confirm");
				String s=Var.scn.nextLine();
				if(Quantity.confirmQ(s))
				{
					Tester.c1.price+=(h1.price*h1.quantity);
					q-=h1.quantity;
					Bill.arr.add(new Bill("hp notebook",h1.price,h1.quantity));
					break;
					}
					
				}
			String opt="";
			while(true) {
				System.out.println("Do you wish to continue browsing? \nEnter 1 for Laptops \nEnter 2 for Electronics"
						+ " \nEnter 3 to return to main menu \nEnter 4 for checkout");
				 opt=Var.scn.nextLine().trim();
				try {
				 if(opt.equals("1")||opt.equals("2")||opt.equals("3")||opt.equals("4"))
					 break;
				 throw new InputMismatchException();
				}catch(Exception e) {System.out.println("Invalid input");}
				}
				switch(opt)
				{
				case "1":Laptop.menu();
				break;
				case "2":
					Electronics.mainMenu();
					break;
				case "3":Main.mainMenu();
				break;
				case "4":Bill.display();
				}
			}
			else if(options.equalsIgnoreCase("2"))
				Laptop.menu();
		
	}

}
