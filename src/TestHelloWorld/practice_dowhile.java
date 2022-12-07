package TestHelloWorld;

import java.util.Scanner;

public class practice_dowhile {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan1= new Scanner(System.in);
			System.out.println("Enter 1 for program1 and 2 for program 2");
			int a= scan1.nextInt();
			if (a==1)
			 votingif();
			else if (a==2)
			 votingifelse();
			else {
				do {
					System.out.println("Your choice is invalid. Pick 1 or 2");
					int b= scan1.nextInt();
					if (b==1)
					 votingif();
					else if (b==2)
					 votingifelse();
					else 
						System.out.println("Oh no ! You are stuck in a loop till you choose 1 or 2");
					
				}while(a!=1 || a!=2);
				
			}
			
			scan1.close();
		}
		
		public static void votingif() {
			Scanner scan= new Scanner(System.in);
			System.out.println("Program1 : Enter your Age");
			int age= scan.nextInt();
			if(age>=18)
				System.out.println("You are allowed to vote !");
			
			System.out.println("Program ends");
			scan.close();
		}
		
		public static void votingifelse() {
			Scanner scan= new Scanner(System.in);
			System.out.println("Program2 : Enter your Age");
			int age= scan.nextInt();
			if(age>=18)
				System.out.println("You are allowed to vote !");
			else
				System.out.println("You are not allowed to vote :(");
			
			System.out.println("Program ends");
			scan.close();
		}

	}

