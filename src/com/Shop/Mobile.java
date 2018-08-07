package com.Shop;

import java.util.InputMismatchException;

public class Mobile extends Stuff {
	int price;
	String ram, display,camera,battery,modelNo,color,simType;
	Mobile(int price,String display,String camera,String battery,String modelNo,String color,String simType)
	{
		this.price=price;
		this.display=display;
		this.camera=camera;
		this.battery=battery;
		this.modelNo=modelNo;
		this.color=color;
		this.simType=simType;
	}
	public static void menu() {
		System.out.println("1.Iphone 2.Redmi 3.Samsung 4.exit");
		String option="";
		while(true)
		{System.out.println("Enter 1 for iphone 2 for redmi  3 for samsung and 4 "
				+ "to return to electronics menu");
		option=Var.scn.nextLine().trim();
		try {
		if(option.equals("1")||option.equals("2")||option.equals("3")||option.equals("4"))
			break;
		throw new InputMismatchException();
		}catch(Exception e) {System.out.println("Invalid input");}
		}
		switch(option)
		{
		case "1":Iphone.display();
		break;
		case "2":Redmi.display();
		break;
		case "3":Samsung.display();
		break;
		case "4":Electronics.mainMenu();
		}
		
	}

}
