package com.Shop;

import java.util.InputMismatchException;

public class YA extends Books{
	YA(){
	super ("Harry Potter book set " ,"JK Rowling","Over 1000","ISB100",
			 1500);
	 }
	static Books Y1=new YA();
	static int q=5;
	public static void display() {
		 Y1.details();
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
					Books.mainMenu();
					return;
				}
				while(true) {
					//Quantity<Mobile> q1=new Quantity<Mobile>();
				Quantity.ask(q,Y1);
				System.out.println("press 1 to confirm");
				String s=Var.scn.nextLine();
				if(Quantity.confirmQ(s))
				{
					Tester.c1.price+=(Y1.price*Y1.quantity);
					q-=Y1.quantity;
					Bill.arr.add(new Bill("Harry Potter book set",Y1.price,Y1.quantity));
					break;
					}
					
				}
			String opt="";
			while(true) {
				System.out.println("Do you wish to continue browsing? \nEnter 1 for Books"
						+ " \nEnter 2 to return to main menu \nEnter 3 for checkout");
				 opt=Var.scn.nextLine().trim();
				try {
				 if(opt.equals("1")||opt.equals("2")||opt.equals("3"))
					 break;
				 throw new InputMismatchException();
				}catch(Exception e) {System.out.println("Invalid input");}
				}
				switch(opt)
				{
				case "1":Books.mainMenu();
				break;
				case "2":Main.mainMenu();
				break;
				case "3":Bill.display();
				}
			}
			else if(options.equalsIgnoreCase("2"))
				Books.mainMenu();
		
	}
}
