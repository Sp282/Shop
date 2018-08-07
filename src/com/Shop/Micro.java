package com.Shop;

import java.util.InputMismatchException;

public class Micro extends Tv {

	Micro() {
		super(12000,"Micromax","24 W output","LED","32 Inches","73 x 18.4 x 47.2 cm","3-year");
		// name,Audio,Display,Screen_size,dimension,warrenty
	}
static Tv m1=new Micro();
static int q=5;
	public static void display() {
		System.out.println("Price: "+m1.price+"\n name: "+m1.name+"\nAudio: "+m1.audio+"\n Display: "+
				m1.display+"\n Screen size: "+m1.Screen_size+"\n dimensions: "+m1.dimension+"\n warranty:"
						+ " "+m1.warrenty);
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
						Quantity.ask(q,m1);
						System.out.println("press 1 to confirm");
						String s=Var.scn.nextLine();
						if(Quantity.confirmQ(s))
						{
							Tester.c1.price+=(m1.price*m1.quantity);
							q-=m1.quantity;
							Bill.arr.add(new Bill("Micromax",m1.price,m1.quantity));
							break;
						}
							
						}
						String opt="";
						while(true) {
							System.out.println("Do you wish to continue browsing? \nEnter 1 for Tv \nEnter 2 for Electronics"
									+ " \nEnter 3 to return to main menu \nEnter 4 to checkout");
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
