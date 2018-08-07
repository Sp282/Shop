package com.Shop;

import java.util.InputMismatchException;

public class Women extends Clothing{

	public static void mainMenu() {
		System.out.println("1.Jeans 2.Tops 3.Skirts 4.exit");
		String option="";
		while(true)
		{
		System.out.println("Enter 1 for jeans 2 for tops 3 for skirts and 4 to return "
				+ "to Clothing menu");
		option=Var.scn.nextLine().trim();
		try {
		if(option.equals("1")||option.equals("2")||option.equals("3")||option.equals("4"))
			break;
		throw new InputMismatchException();
		}catch(Exception e) {System.out.println("invalid input");}
		}
		switch(option)
		{
		case "1":Jeans.menu();
		break;
		case "2":Tops.menu();
		break;
		case "3":Skirts.menu();;
		break;
		case "4":Clothing.mainMenu();
		break;
		}
		
	}

}
	
