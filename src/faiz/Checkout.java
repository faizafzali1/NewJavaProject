package faiz;

import java.util.Scanner;

public class Checkout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("\n \t enter the item type ");
		String s = sc.next();
		
		RetailItem pt = new Potatoes(s);
		RetailItem eg = new Eggs(s);
		RetailItem ic = new IceCream(s);
		RetailItem sund = new Sundae(s);
		
		int sh;
		
		switch(s) {
		case "potato":
			System.out.println("enter the weight");
			sh=sc.nextInt();
			((Potatoes) pt).setMethod(sh);
			System.out.println("the cost of potato is: $"+pt.getCost());
			break;
			
		case "eggs":
			System.out.println("enter the number");
			sh=sc.nextInt();
			((Eggs) eg).setMethod(sh);
			System.out.println("the cost of egg is: $"+eg.getCost());
			break;
			
		case "icecream":
			System.out.println("enter the number");
			sh=sc.nextInt();
			((IceCream) ic).setMethod(sh);
			System.out.println("the cost of icecream is: $"+ic.getCost());
			break;
			
		case "sundae":
			System.out.println("enter the topping amount");
			sh=sc.nextInt();
			((Sundae) sund).setMethod(sh);
			System.out.print(sund.getCost());
			break;
			}
		}
		
	}

}
