package com.Shop;

import java.util.InputMismatchException;

public class Pan extends Tv {
static Tv p1=new Pan();
static int q=8;
	Pan() {
		super(15000,"Panasonic","10 W output","LED","40 Inches","12 x 5.4 x 90.9 cm","2-year");
		// TODO Auto-generated constructor stub
	}

	public static void display() {
		System.out.println("Price: "+p1.price+"\n name: "+p1.name+"\nAudio: "+p1.audio+"\n Display: "+
				p1.display+"\n Screen size: "+p1.Screen_size+"\n dimensions: "+p1.dimension+"\n warranty:"
						+ " "+p1.warrenty);
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
						Quantity.ask(q,p1);
						System.out.println("press 1 to confirm");
						String s=Var.scn.nextLine();
						if(Quantity.confirmQ(s))
						{
							Tester.c1.price+=(p1.price*p1.quantity);
							q-=p1.quantity;
							Bill.arr.add(new Bill("Panasonic",p1.price,p1.quantity));
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
