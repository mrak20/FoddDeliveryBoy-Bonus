package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodDelivery {
	
	public String bonus(FoodDeliveryPojo foodDeliveryPojo) {
		
		if(foodDeliveryPojo.getExpected() >= foodDeliveryPojo.getActual()) {
			return foodDeliveryPojo.getName();
		}
		
		return "";
	}
	
	public static String removeChar(String s, char c) {
		  StringBuffer r = new StringBuffer( s.length() );
		  r.setLength( s.length() );
		  int current = 0;
		  for (int i = 0; i < s.length(); i ++) {
		     char cur = s.charAt(i);
		     if (cur != c) r.setCharAt( current++, cur );
		  }
		  return r.toString();
		}
	
	public List<FoodDeliveryPojo> takeData(){
	
		return null;
	}
	
	public static void main(String args[]) {
		
		int noOfEmployees;
		
		
		
		List<FoodDeliveryPojo> list = new ArrayList<FoodDeliveryPojo>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of employees who have gone for delivery");
		noOfEmployees = sc.nextInt();
		String[] all = new String[noOfEmployees];
		System.out.println("Enter name, expected delivery time, actual delivery time");
		for(int i=0; i< noOfEmployees; i++) {
		
			
//		String empName = sc.next();
//		String expected = sc.next();
//		String actual = sc.next();
		String tempE;
		String tempA;
		//taking 3 values seperated by comma as a single string and 
		//then splitting it at comma and assigning values to 3 different variables
		String CSV = sc.next();
		String[] values = CSV.split(",");
		String empName= values[0];
		String expected = values[1];
		String actual = values[2];
		
		tempE = FoodDelivery.removeChar(expected,':');
		tempA = FoodDelivery.removeChar(actual,':');
		
		tempE = tempE.trim();
		tempA = tempA.trim();
		
		int et = Integer.parseInt(tempE);
		int at = Integer.parseInt(tempA);
	
		FoodDeliveryPojo foodDeliveryPojo = new FoodDeliveryPojo(empName, et, at);
		
		FoodDelivery foodDelivery = new FoodDelivery();
		
		 all[i] = foodDelivery.bonus(foodDeliveryPojo);
		 //to remove the spaces
		 all[i].trim();
		 //System.out.println(foodDelivery.bonus(foodDeliveryPojo));
		}
		
		for(int i=0; i<all.length; i++) {
			
		System.out.println(all[i]);
		}
		System.out.println("are eligible for bonus");
	}
}



