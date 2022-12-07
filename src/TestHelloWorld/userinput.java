//scanner class. use functions from scanner 
//first make an object of the class we are going to be using
package TestHelloWorld;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in) ; //creating an object of class scanner 
		//here using scanner to get user generated data
		System.out.println("Hello! Say your name");
		String name= scan.nextLine(); //user input of sentence
		
		System.out.println(" Tell your age");
		int age= scan.nextInt(); // user input of interger 
		
		System.out.println("Are you allowed to vote True or False?");
		Boolean bool= scan.nextBoolean(); // input of boolean;
		
		System.out.println("Enter any decimal number");
	    double num= scan.nextDouble(); // 
	    
	    System.out.println("Type any character");
		char ch= scan.next().charAt(0); //string is atleast 1 char long and it takes first character. 
		//if charat(2) then string is atleast 3 character long and it is taking third character
		
		System.out.println(name+ "\n"+ age+ "\n"+ bool+ "\n"+ num+ "\n"+ ch);
		scan.close();		

	}

}
