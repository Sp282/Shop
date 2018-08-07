package com.Shop;

import java.util.InputMismatchException;

public class MWSkirts extends Skirts{
	MWSkirts() {
		super("pink", "medium",1500);
		// TODO Auto-generated constructor stub
	}
static Skirts sw=new SWSkirts();
static int q=15;
//String size="small";
	public static void display() {
		 sw.details();
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
				Quantity.ask(q,sw);
				System.out.println("press 1 to confirm");
				String s=Var.scn.nextLine();
				if(Quantity.confirmQ(s))
				{
					Tester.c1.price+=(sw.price*sw.quantity);
					//System.out.println("price into q "+(sw.price*sw.quantity)+" and T price "+Tester.c1.price);
					q-=sw.quantity;
					Bill.arr.add(new Bill("Medium skirt",sw.price,sw.quantity));
					break;
					}
					
				}
			String opt="";
			while(true) {
				System.out.println("Do you wish to continue browsing? \nFor Skirts enter 1 \nFor Women's Clothing enter 2"
						+ " \nFor Clothing enter 3\nFor returning to main menu enter 4\nFor checkout enter 5");
				 opt=Var.scn.nextLine().trim();
				try {
				 if(opt.equals("1")||opt.equals("2")||opt.equals("3")||opt.equals("4")||opt.equals("5"))
					 break;
				 throw new InputMismatchException();
				}catch(Exception e) {System.out.println("Invalid input");}
				}
				switch(opt)
				{
				case "1":Skirts.menu();
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
				Skirts.menu();
		
	}


}
