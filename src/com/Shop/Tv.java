package com.Shop;

import java.util.InputMismatchException;

public class Tv extends Stuff{
	int price;
	String name,audio,display,Screen_size,dimension,warrenty;
	Tv(int price,String name,String audio,String display,String Screen_size, String dimension,String warrenty){
		this.price=price;
		this.name=name;
		this.audio=audio;
		this.display=display;
		this.Screen_size=Screen_size;
		this.dimension=dimension;
		this.warrenty=warrenty;
	}
	public static void menu() {
		System.out.println("1.MicroMax 2.Panasonic 3.Sony 4.exit");
		String option="";
		while(true)
		{
		System.out.println("Enter 1 for Micromax 2 for Panasonic 3 for sony and 4 to return "
				+ "to Electronics menu");
		option=Var.scn.nextLine().trim();
		try {
		if(option.equals("1")||option.equals("2")||option.equals("3")||option.equals("4"))
			break;
		throw new InputMismatchException();
		}catch(Exception e) {System.out.println("invalid input");}
		}
		switch(option)
		{
		case "1":Micro.display();
		break;
		case "2":Pan.display();
		break;
		case "3":Sony.display();;
		break;
		case "4":Electronics.mainMenu();
		break;
		}
	}
}
