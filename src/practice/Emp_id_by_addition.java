package practice;

import java.util.Scanner;

public class Emp_id_by_addition {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		System.out.println("wel-come to id prepreation please enter the information");
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("please enter name");
		
		
		String a=sc.next();
		
		System.out.println("please enter job profile");
		
		
		String b=sc.next();
		
		String result = a + b;
		System.out.println(result);
		
		
		
		
		
		
		
		

	}

}
