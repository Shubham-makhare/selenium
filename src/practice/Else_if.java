package practice;

import java.util.Scanner;

public class Else_if {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("enter the character  to check weather it is uppercase or lowercase or digit");

		Scanner sc= new Scanner(System.in);
		
		char input = sc.next().charAt(0);
		
		
		if (input >='A' && input <= 'Z')
		{
			System.out.println("the character enter  is in upper case");
		}
	
		else if (input >='a' && input <='z')
		{
			System.out.println("the character enter is in lower case");
		}
	
		else if (input >='0' && input <='9')
		{
			System.out.println("the number enter is digit");
		}
		
		else
		{
			System.out.println("wrong input");
		}
		
			
	
	
	
	
	
	
	}

}
