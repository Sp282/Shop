package com.Shop;

import java.util.InputMismatchException;

public class RechargeCard {
public static boolean valid(String option) {
	 if(option.equals("1") ||option.equals("2"))
		 return true;
	 return false;
} 

public static void addMoney(Customer c1) {
	double n;
	while(true)
	{
	System.out.println("How much money would you like to add?");
	String s=Var.scn.nextLine();
	try {
	 n=Integer.parseInt(s);
	 if(n<1)throw new InputMismatchException();
	 System.out.println("Are you sure that you want to add "+n+" amount"+"\n press 1 to confirm, 2 to go to menu "
	 		+ "and any other key to enter another amount"
			);
	 s=Var.scn.nextLine().trim();
		if(s.equals("1"))
	break;
		if(s.equals("2"))
		{
			//Main.mainMenu();
			return;
		}
	}catch(InputMismatchException e) {System.out.println("Enter a positive number");}
	catch(Exception e) {System.out.println("invalid input");}
	}
	c1.card+=n;
	
}
}

