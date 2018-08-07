package com.Shop;

import java.util.InputMismatchException;

public class Samsung {
	static int q=5;
	static Mobile sa=new Mobile(8000,"5.5 in","13 MP rear camera and 5 MP front camera",
			"4100mAh battery","Samsung on 7","gold","dual sim");
	public static void display() {
		System.out.println("Price: "+sa.price+"\n display: "+sa.display+"\n camera: "+
				sa.camera+"\n battery: "+sa.battery+"\n version: "+sa.modelNo+"\n color:"
						+ " "+sa.color+" \n"+sa.simType);
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
						Quantity.ask(q,sa);
						System.out.println("press 1 to confirm");
						String s=Var.scn.nextLine();
						if(Quantity.confirmQ(s))
						{
							Tester.c1.price+=(sa.price*sa.quantity);
							q-=sa.quantity;
							Bill.arr.add(new Bill("Redmi 4",sa.price,sa.quantity));
							break;
						}
							
						}
						String opt="";
						while(true) {
							System.out.println("Do you wish to continue browsing? \nEnter 1 for mobiles \nEnter 2 for Electronics"
									+ " \nEnter 3 for returning to main menu \nEnter 4 for checkout");
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


