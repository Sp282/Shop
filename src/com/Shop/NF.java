package com.Shop;

import java.util.InputMismatchException;

public class NF extends Books {
	NF(){
		super ("Wings of fire " ,"APJ Abdul Kalam","180","ISB300",
				 200);
		 }
		static Books N1=new NF();
		static int q=5;
		public static void display() {
			 N1.details();
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
					Quantity.ask(q,N1);
					System.out.println("press 1 to confirm");
					String s=Var.scn.nextLine();
					if(Quantity.confirmQ(s))
					{
						Tester.c1.price+=(N1.price*N1.quantity);
						q-=N1.quantity;
						Bill.arr.add(new Bill("Wings of fire",N1.price,N1.quantity));
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
