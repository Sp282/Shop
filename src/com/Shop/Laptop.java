package com.Shop;

import java.util.InputMismatchException;

public class Laptop extends Stuff{

	int price;
	String ram,storage,display,processor,OS,modelNo,resolution,backlit;
	 Laptop(String ram,String storage,String display,String processor,
			 String OS,String modelNo,String resolution,String backlit,int price)
	 {
		 this.ram=ram;
		 this.storage=storage;
		 this.display=display;
		 this.processor=processor;
		 this.OS=OS;
		 this.modelNo=modelNo;
		 this.resolution=resolution;
		 this.backlit=backlit;
		 this.price=price;
	 }
	public void details()
	{
		System.out.println("Ram: "+ram+"\n Storage: "+storage+" \n display: "+display+
				"\n Processor: "+processor+" \n OS: "+OS+" \n model no: "+modelNo
				+"\n resolution: "+resolution+" \nbacklit "+backlit+"\nprice: "+price);
	}	

	public static void menu() {
		System.out.println("1.Apple 2.hp 3.Del 4.exit");
		String option="";
		while(true)
		{
		System.out.println("Enter 1 for Apple 2 for hp 3 for dell and 4 to return "
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
		case "1":Apple.display();
		break;
		case "2":HP.display();
		break;
		case "3":Dell.display();;
		break;
		case "4":Electronics.mainMenu();
		break;
		
	}

}
}
