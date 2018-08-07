package com.Shop;

import java.util.InputMismatchException;

public class Sony extends Tv {

	Sony() {
		super(30000,"Soni","20W output-Dolbi","LED","49 Inches","110.2 x 8.3 x 64.2 cm","1-year");
		
	}
static Tv sony=new Sony();
static int q=8;
	public static void display() {
		System.out.println("Price: "+sony.price+"\n name: "+sony.name+"\nAudio: "+sony.audio+"\n Display: "+
				sony.display+"\n Screen size: "+sony.Screen_size+"\n dimensions: "+sony.dimension+"\n warranty:"
						+ " "+sony.warrenty);
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
							Tv.menu();
							return;
						}
						while(true) {
							//Quantity<Mobile> q1=new Quantity<Mobile>();
						Quantity.ask(q,sony);
						System.out.println("press 1 to confirm");
						String s=Var.scn.nextLine();
						if(Quantity.confirmQ(s))
						{
							Tester.c1.price+=(sony.price*sony.quantity);
							q-=sony.quantity;
							Bill.arr.add(new Bill("Sony",sony.price,sony.quantity));
							break;
						}
							
						}
						String opt="";
						while(true) {
							System.out.println("Do you wish to continue browsing? \nEnter 1 for Tv \nEnter 2 for Electronics"
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
							case "1":Tv.menu();
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
						Tv.menu();
		
		
	}

}
