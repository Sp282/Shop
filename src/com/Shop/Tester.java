package com.Shop;

import java.util.InputMismatchException;

public class Tester {
	static Customer c1=new Customer("Lily",0);
	public static void main(String[] args) {
		
		Greeting.entry(c1);
		String option;
		while(true) {
		System.out.println("Do you wish to recharge your card?"
				+ "\nenter 1 for yes and 2 for no");
		option=Var.scn.nextLine();
		try {
		if(RechargeCard.valid(option))
		break;
		throw new InputMismatchException();
		}catch(Exception e) {System.out.println("invalid input");}
		
	}
		if(option.equals("1")) {
			RechargeCard.addMoney(c1);
			Main.mainMenu();
		}
		else if(option.equals("2"))
		{String s="";
			while(true) {
			System.out.println("would you like to exit? press 1 for yes and 2 for no");
			 s=Var.scn.nextLine();
			try {
			if(s.equals("1")||s.equals("2"))
				break;
			throw new InputMismatchException();
			}catch(Exception e) {System.out.println("Invalid input");}
			}
			switch(s)
			{
			case "1":Greeting.exit();
			break;
			case "2":Main.mainMenu();
			}
		}	
		
	}		  	
}
