package com.Shop;

import java.util.InputMismatchException;

public class LWJeans extends Jeans{

	LWJeans() {
		super("Black", "Medium", 1500);
		// TODO Auto-generated constructor stub
	}
static Jeans lw=new LWJeans();
static int q=7;
	public static void display() {
		 lw.details();
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
					Jeans.menu();
					return;
				}
				while(true) {
					//Quantity<Mobile> q1=new Quantity<Mobile>();
				Quantity.ask(q,lw);
				System.out.println("press 1 to confirm");
				String s=Var.scn.nextLine();
				if(Quantity.confirmQ(s))
				{
					Tester.c1.price+=(lw.price*lw.quantity);
					System.out.println("price into q "+(lw.price*lw.quantity)+" and T price "+Tester.c1.price);
					q-=lw.quantity;
					Bill.arr.add(new Bill("large Jeans",lw.price,lw.quantity));
					break;
					}
					
				}
			String opt="";
			while(true) {
				System.out.println("Do you wish to continue browsing? \nEnter 1 for Jeans \nEnter 2 for Women's Clothing"
						+ " \nEnter 3 for Clothing\nEnter 4 to return to main menu \nEnter 5 for checkout");
				 opt=Var.scn.nextLine().trim();
				try {
				 if(opt.equals("1")||opt.equals("2")||opt.equals("3")||opt.equals("4")||opt.equals("5"))
					 break;
				 throw new InputMismatchException();
				}catch(Exception e) {System.out.println("Invalid input");}
				}
				switch(opt)
				{
				case "1":Jeans.menu();
				break;
				case "2":
					Women.mainMenu();
					break;
				case "3":Clothing.mainMenu();	
				case "4":Main.mainMenu();
				break;
				case "5":Bill.display();
				}
			}
			else if(options.equalsIgnoreCase("2"))
				Jeans.menu();
		
		
	}

		
	}


