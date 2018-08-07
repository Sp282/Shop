package com.Shop;

import java.util.InputMismatchException;

public class Greeting {
public static void entry(Customer c1)
{
	System.out.println("Welcome to our Adda "+c1.name+" \n"
			+ "you currently have "+c1.card+" amount of money"
					);
}
public static void exit()
{
	if(Tester.c1.price==0)
	{
	System.out.println("Thank you for stopping by");
	}
else {
	Bill.display();
	
}


}
public static void shopMore(Customer c1)
{
	System.out.println("Would you like to continue shopping?Press 1 for yes and 2 for no");
	String option=Var.scn.nextLine().trim();
	while(true) {
	try {
	if(option.equals("1")||option.equals("2"))
	break;
	throw new InputMismatchException();
	}catch(Exception e) {System.out.println("Invalid input");}
	}
	switch(option)
	{
	case "1":
		c1.price=0;
		//count=0;
	Main.mainMenu();
	break;
	case "2":
		c1.price=0;
		exit();
	break;
	}
}
}
