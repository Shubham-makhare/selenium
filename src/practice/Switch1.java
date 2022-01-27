package practice;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		System.out.println("welcome to weekly chart");
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int day=sc.nextInt();
		
		switch(day)
		{
		case 1: System.out.println("friday");break;
		case 2: System.out.println("satday");break;
		case 3: System.out.println("sunday");break;
		case 4: System.out.println("monday");break;
		case 5: System.out.println("tuesday");break;
		case 6: System.out.println("wednesday");break;
		case 7: System.out.println("thursdayday");break;
        default: System.out.println("invalid day number");break;
        }

	}

}
