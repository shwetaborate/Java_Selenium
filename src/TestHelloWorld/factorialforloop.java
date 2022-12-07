//4-12 WAP to find factorial
package TestHelloWorld;

import java.util.Scanner;

public class factorialforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in) ; //creating an object of class scanner 
		//here using scanner to get user generated data
		System.out.println("Hello! Enter number to find its factorial");
		int num= scan.nextInt();//user input of sentence
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		scan.close();

	}

}
