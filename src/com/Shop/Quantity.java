package com.Shop;

import java.util.InputMismatchException;

public class Quantity {
	public static void ask(int q,Stuff i) {
		int n=0;
		while(true) {
		System.out.println("How many? would you like "+q+" are available");
        String s=Var.scn.nextLine().trim();
        if(s.equals("0"))
        	System.out.println("You cant buy 0 of an item");
        try {//int opt=0;
        	i.quantity=Integer.parseInt(s);
        	if(i.quantity>q)
        		throw new InputMismatchException();
        	if(i.quantity<=0)
        		throw new Exception();
        	break;
        	}catch(InputMismatchException e) {System.out.println("Only "+q+" are available");}
        	catch(Exception e) {System.out.println("Invalid input");}
		}
	}
	public static boolean confirmQ(String s)
	{
		if(s.equals("1"))
			return true;
		return false;
		
	}
}
