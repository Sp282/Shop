package com.Shop;

import java.util.InputMismatchException;

public class Dell extends Laptop {

	Dell() {
		super("4GB DDR4 RAM", "1 TB", "15.6-inch screen", "E Series Dual-Core", "Windows 10", "Dell inspiron", "1366X768", "yes", 25000);
		// TODO Auto-generated constructor stub
	}
static int q=5;
static Laptop d1=new Dell();
	public static void display() {
		 d1.details();
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
				Quantity.ask(q,d1);
				System.out.println("press 1 to confirm");
				String s=Var.scn.nextLine();
				if(Quantity.confirmQ(s))
				{
					Tester.c1.price+=(d1.price*d1.quantity);
					q-=d1.quantity;
					Bill.arr.add(new Bill("Dell inspiron",d1.price,d1.quantity));
					break;
					}
					
				}
			String opt="";
			while(true) {
				System.out.println("Do you wish to continue browsing? \n Enter 1 for Laptops \n Enter 2 for Electronics"
						+ " \n Enter 3 for return to main menu \n and 4 for checkout");
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
