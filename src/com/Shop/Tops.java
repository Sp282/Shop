package com.Shop;

import java.util.InputMismatchException;

public class Tops extends Women {
		String color,size;
		int price;
		Tops(String co,String si,int price){
			color=co;
			size=si;
			this.price=price;
		}
			
		public void details()
		{
			System.out.println(color+" top "+
		"\nsize: "+size+" price: "+price);
		}	

			public static void menu() {
				System.out.println("1.Small 2.Medium 3.Large 4.exit");
				String option="";
				while(true)
				{System.out.println("Enter 1 for small 2 for medium  3 for large and 4 "
						+ "to return to menu for women");
				option=Var.scn.nextLine().trim();
				try {
				if(option.equals("1")||option.equals("2")||option.equals("3")||option.equals("4"))
					break;
				throw new InputMismatchException();
				}catch(Exception e) {System.out.println("Invalid input");}
				}
				switch(option)
				{
				case "1":SWTops.display();
				break;
				case "2":MWTops.display();
				break;
				case "3":LWTops.display();
				break;
				case "4":Women.mainMenu();
				}
				
				
			}
		
	}


