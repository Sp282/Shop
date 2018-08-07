package com.Shop;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JFrame;
public class Bill {
	static Scanner scn=new Scanner(System.in);
	String item;
	int price,quantity;
	static JFrame f;
	Bill(String itm,int p,int q)
	{
		price=p;
		item=itm;
		quantity=q;
		
	}
	public String toString()
	{
		//return "item
		return item+   "      "+quantity+"          "+price;
	}
	static ArrayList<Bill> arr=new ArrayList<Bill>();
	public static void display() {
		double total=0;
		System.out.println("Item          "+"   Quantity     "+"   Price"+"     Total Price");
		for(Bill b:arr)
			System.out.println(b+"   "+(b.price*b.quantity));
		
		 System.out.println("the sgst is "+sgst(Tester.c1.price)+" and cgst is "+cgst(Tester.c1.price));
		   Tester.c1.price+=sgst(Tester.c1.price)+cgst(Tester.c1.price);
		 total=total+(sgst(total)+cgst(total));
		    //Tester.c1.price=total;
		    if(Tester.c1.price>=10000)
		    	Discount(Tester.c1.price);
		    System.out.println("the total  bill is "+Tester.c1.price);
		    if( Isvalid(Tester.c1.price)) {
		    	Tester.c1.card-=Tester.c1.price;
		    	Tester.c1.price=0;
		    	/*arr.clear();
		    	total=0;
		    	System.out.println("You now have rs "+Tester.c1.card+ "left in your card ");
		    	Greeting.shopMore(Tester.c1);*/
		    }
		    while(!Isvalid((Tester.c1.price))) {
		    	String s="";
		    	while(true) {
		    	System.out.println("You have insuffiecient balance"
		    			+ " by "+(Tester.c1.price-Tester.c1.card)+"\n press 1 to add money"
		    					+ "and 2 to return to main menu");
		    	s=Var.scn.nextLine().trim();
		    	try {
		    	if(s.equals("1")||s.equals("2"))
		    		break;
		    	throw new InputMismatchException();
		    	}catch(Exception e) {System.out.println("Invalid input");}
		    	
		    	}
		    	if(s.equals("1"))
		    	{
		    		RechargeCard.addMoney(Tester.c1);
		    		
		    		
		    	}
		    	else if(s.equals("2"))
		    	{
		    		Tester.c1.price=0;
			    	arr.clear();
			    	total=0;
			    	Main.mainMenu();
			    	return;
		    	}
		    }
		    Tester.c1.card-=Tester.c1.price;
	    	Tester.c1.price=0;
	    	arr.clear();
	    	total=0;
	    	System.out.println("You now have rs "+Tester.c1.card+ "left in your card ");
	    	Greeting.shopMore(Tester.c1);
		
	}
	
	private static boolean Isvalid(double total) {
		if( Tester.c1.price>Tester.c1.card)
			return false;
		return true;
		
	}
	private static void Discount(double m) {
		if(m>=10000 && m<50000)
		{
			Tester.c1.price-=m*0.05;
			System.out.println("You got a discount "+(m*0.05)+" has been  deducted from"
					+ " the total");
		}
		if(m>=50000 && m<=100000) {
			Tester.c1.price-=m*0.1;
			System.out.println("You got a discount "+(m*0.1)+" has been  deducted from"
					+ " the total");
		}
		if(m>100000)
		{
			Tester.c1.price-=m*0.2;
			System.out.println("You got a discount "+(m*0.2)+" has been  deducted from"
					+ " the total");
		}
		  
			//System.out.println("the amm is "+d);
			//Menu.card+=Menu.card+d;
		
	}
	private static double cgst(double m) {
		m*=0.025;
		return m;
		
	}
	private static double sgst(double m) {
		m*=0.025;
		return m;
	}
	
}
