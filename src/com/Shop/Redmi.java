package com.Shop;

import java.util.InputMismatchException;

public class Redmi {
	static int q=5;
	static Mobile r=new Mobile(12000,"5 in","13 MP rear camera and 3 MP front camera",
			"4100mAh battery","Redmi 4","black","dual sim");
	public static void display() {
		
		//Mobile i=new Mobile(50000,"4.7 in","12 MP rear camera and 7 MP front camera","li-lon","iphone 7 mn8x","black","single sim");
			System.out.println("Price: "+r.price+"\n display: "+r.display+"\n camera: "+
		r.camera+"\n battery: "+r.battery+"\n version: "+r.modelNo+"\n color:"
				+ " "+r.color+" \n"+r.simType);
			System.out.println("Do you wish to buy?");
			String option="";
			while(true) {
				System.out.println("Enter yes to confirm and no to return to mobile menu");
				option=Var.scn.nextLine().trim();
				try {
				if(option.equalsIgnoreCase("yes")||option.equalsIgnoreCase("no"))
					break;
				throw new InputMismatchException();
				}catch(Exception e) {System.out.println("Invalid input");}
			}
			if(option.equalsIgnoreCase("yes"))
			{
				if(q<1)
				{
					System.out.println("The item is out of stock");
					Mobile.menu();
					return;
				}
				while(true) {
				Quantity.ask(q,r);
				System.out.println("press 1 to confirm");
				String s=Var.scn.nextLine();
				if(Quantity.confirmQ(s))
				{
					Tester.c1.price+=(r.price*r.quantity);
					q-=r.quantity;
					Bill.arr.add(new Bill("Redmi 4",r.price,r.quantity));
					break;
				}
					
				}
				String opt="";
				while(true) {
					System.out.println("Do you wish to continue browsing \nEnter 1 for mobiles \nEnter 2 for Electronics"
							+ " \nEnter 3.for return to main menu \nEnter 4 for checkout");
					 opt=Var.scn.nextLine().trim();
					try {
					 if(opt.equals("1")||opt.equals("2")||opt.equals("3")||opt.equals("4"))
						 break;
					 throw new InputMismatchException();
					}catch(Exception e) {System.out.println("Invalid input");}
					}
					switch(opt)
					{
					case "1":Mobile.menu();
					break;
					case "2":
						Electronics.mainMenu();
						break;
					case "3":Main.mainMenu();
					break;
					case "4":Bill.display();
					}
				
			}
			else if(option.equalsIgnoreCase("no"))
				Mobile.menu();
		}
		
	}


