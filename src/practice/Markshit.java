package practice;

import java.util.Scanner;

public class Markshit {

	public static void main(String[] args) {
		System.out.println("welcome to check out grades");
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your marks");
		 int marks =sc.nextInt();
		 if(marks>90)
			 System.out.println("Grade A");
		 
		 else if(marks >80 && marks <=90)
			 System.out.println("Grade B");
		 
		 else if(marks>=60 && marks<=80)
			 System.out.println("Grade C");
		 
		 else if(marks<60)
			 System.out.println("Grade D");

	}

}
