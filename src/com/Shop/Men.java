package com.Shop;

import java.util.InputMismatchException;

public class Men extends Clothing {

	public static void mainMenu() {
		System.out.println("1.Jeans 2.Shirts 3.exit");
		String option="";
		while(true)
		{
		System.out.println("Enter 1 for jeans 2 for shirts 3 to return to Clothing menu "
				);
		option=Var.scn.nextLine().trim();
		try {
		if(option.equals("1")||option.equals("2")||option.equals("3"))
			break;
		throw new InputMismatchException();
		}catch(Exception e) {System.out.println("invalid input");}
		}
		switch(option)
		{
		case "1":MJeans.menu();
		break;
		case "2":Shirts.menu();
		break;
		case "3":Clothing.mainMenu();
		break;
		}
		
	}

}
