package com.Shop;

import java.util.InputMismatchException;

public class Electronics {

		public static void mainMenu()
		{ String option="";
			while(true)
			{
			System.out.println("1. Mobile 2.Tv 3.Laptop 4.exit"+"\npress 1 for mobile"
					+ "press 2 for T.V, 3 for laptop and 4 for exit" );
			option=Var.scn.nextLine().trim();
			try {
			if(option.equals("1")||option.equals("2")||option.equals("3")||option.equals("4"))
			break;
			throw new InputMismatchException();
			}catch(Exception e) {System.out.println("ivalid input");}
			}
			switch(option)
			{
			case "1":Mobile.menu();
			break;
			case "2":Tv.menu();
			break;
			case "3":Laptop.menu();
			break;
			case "4":Main.mainMenu();
			}
		}
}
		
			
		


