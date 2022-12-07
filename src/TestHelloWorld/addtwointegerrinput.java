//WAP to take two numbers as input from user and perform addition
package TestHelloWorld;

import java.util.Scanner;

public class addtwointegerrinput {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		System.out.println("We are adding two numbers. Please enter number1");
		int num1= scan.nextInt();
		System.out.println("Please enter number2");
		int num2= scan.nextInt();
		int sum = num1 + num2;
		System.out.println("Sum is "+sum); 
		
		scan.close();

	}

}
