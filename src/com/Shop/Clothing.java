package com.Shop;

import java.util.InputMismatchException;

public class Clothing extends Stuff {

	public static void mainMenu() {
		String option="";
		while(true)
		{
		System.out.println("1.Women 2.Men 3.Exit"
				+"\n press 1 for women,2 for men and 3 to retun to main menu");
		 option=Var.scn.nextLine().trim();
		try {
		 if(option.equals("1")||option.equals("2")||option.equals("3"))
			 break;
		 throw new InputMismatchException();
		}catch(Exception e) {System.out.println("invalid input");}
		}
		switch(option)
		{
		case "1":
			Women.mainMenu();
			break;	
		case "2":
			Men.mainMenu();
			break;	
		case "3":
			Main.mainMenu();
			return;
		}
		
	}
	

}
