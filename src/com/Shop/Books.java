package com.Shop;

import java.util.InputMismatchException;

public class Books extends Stuff{
	int price;
	String title,author,pages,isbn;
	 Books(String title,String author,String pages,String isbn,
			 int price)
	 {
		 this.title=title;
		 this.author=author;
		 this.pages=pages;
		 this.isbn=isbn;
		 this.price=price;
	 }
	public void details()
	{
		System.out.println("Title: "+title+"\n Author: "+author+" \n Pages: "+pages+
				"\n ISBN: "+isbn+" \n pages: "+pages
				+" \nprice "+price);
	}	
	public static void mainMenu() {
		String option="";
		while(true)
		{
		System.out.println("1. YA Fiction 2.Children's Book 3.Non fiction 4.exit"+"\npress 1 for YA fiction "
				+ "press 2 for children's book, 3 for non-fiction and 4 for exit" );
		option=Var.scn.nextLine().trim();
		try {
		if(option.equals("1")||option.equals("2")||option.equals("3")||option.equals("4"))
		break;
		throw new InputMismatchException();
		}catch(Exception e) {System.out.println("ivalid input");}
		}
		switch(option)
		{
		case "1":YA.mainMenu();
		break;
		case "2":CB.mainMenu();
		break;
		case "3":NF.mainMenu();
		break;
		case "4":Main.mainMenu();
		}
	}

}
