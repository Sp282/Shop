package com.Shop;

import java.util.InputMismatchException;

public class Main {

	public static void mainMenu() {
		String option="";
		while(true)
		{
		System.out.println("1.Electronics 2.Clothing 3.Books 4.Exit"
				+"\n press 1 for electronics,2 for clothing, 3 for stationary and 4 to exit");
		 option=Var.scn.nextLine().trim();
		try {
		 if(option.equals("1")||option.equals("2")||option.equals("3")||option.equals("4"))
			 break;
		 throw new InputMismatchException();
		}catch(Exception e) {System.out.println("invalid input");}
		}
		switch(option)
		{
		case "1":
			Electronics.mainMenu();
			break;
		case "2":Clothing.mainMenu();
					break;
		case "3":Books.mainMenu();
		case "4":
			//if(price.equals(BigDecimal.valueOf(0)))
			Greeting.exit();
			return;
		}
	}

}
