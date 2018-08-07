package com.Shop;

import java.util.InputMismatchException;

public class Apple extends Laptop {

	Apple() {
		super("8 GB DDR3 SDRAM","250 MB","12 inches","2300 MHz Intel Core i5","Mac OS X"
				,"Macbook Air silver MLH72LL/A","1440x900","yes",100000);
		// TODO Auto-generated constructor stub
	}
	static Laptop a1=new Apple();
	static int q=5;
	 public static void display()
	 {
		 a1.details();
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
				Quantity.ask(q,a1);
				System.out.println("press 1 to confirm");
				String s=Var.scn.nextLine();
				if(Quantity.confirmQ(s))
				{
					Tester.c1.price+=(a1.price*a1.quantity);
					q-=a1.quantity;
					Bill.arr.add(new Bill("Mackbook",a1.price,a1.quantity));
					break;
					}
					
				}
			String opt="";
			while(true) {
				System.out.println("Do you wish to continue browsing? \nEnter 1 for Laptops \n 2 for Electronics"
						+ " \n 3.for Returning to main menu \nand 4 for checkout");
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
