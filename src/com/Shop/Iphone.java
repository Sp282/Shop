package com.Shop;

import java.util.InputMismatchException;

public class Iphone {
	static int q=5;
	static Mobile i=new Mobile(50000,"4.7 in","12 MP rear camera and 7 MP front camera","li-lon","iphone 7 mn8x","black","single sim");
	public static void display() {
	//Mobile i=new Mobile(50000,"4.7 in","12 MP rear camera and 7 MP front camera","li-lon","iphone 7 mn8x","black","single sim");
		System.out.println("Price: "+i.price+"\n display: "+i.display+"\n camera: "+
	i.camera+"\n battery: "+i.battery+"\n version: "+i.modelNo+"\n color:"
			+ " "+i.color+" \n"+i.simType);
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
				//Quantity<Mobile> q1=new Quantity<Mobile>();
			Quantity.ask(q,i);
			System.out.println("press 1 to confirm");
			String s=Var.scn.nextLine();
			if(Quantity.confirmQ(s))
			{
				Tester.c1.price+=(i.price*i.quantity);
				q-=i.quantity;
				Bill.arr.add(new Bill("iphone 7",i.price,i.quantity));
				break;
			}
				
			}
			String opt="";
			while(true) {
				System.out.println("Do you wish to continue browsing? \nEnter 1 for mobiles \nEnter 2 for Electronics"
						+ " \nEnter 3 for return to main menu \nEnter 4 for checkout");
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
