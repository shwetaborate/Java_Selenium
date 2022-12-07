/*//4/12 WAP to create the following pattern
 * *****
 * *****
 * *****
 * *****
 * 
 */
package TestHelloWorld;

import java.util.Scanner;

public class PatternPrinting {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter dimensions for patterns");
		int dim = sc.nextInt();
		pattern1(dim);
		pattern2(dim);
		pattern3(dim);
		pattern4(dim);
		pattern5(dim);
		pattern6(dim);
		pattern7(dim);
		pattern8(dim);
		pattern9(dim);
		pattern10(dim);
		sc.close();
	}

	public static void pattern1(int dim)
	{
		
		System.out.println("Hello!Printing pattern 1: ");
		
		for(int i=1; i<=dim; i++)
		{
			for(int j=1;j<=dim;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void pattern2(int dim)
	{
		
		System.out.println("Hello!Printing pattern 2: ");
		
		for(int i=1;i<=dim;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		System.out.println();
	
	}
	public static void pattern3(int dim)
	{
		
		System.out.println("Hello!Printing pattern 3:");
		for(int i=dim;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		System.out.println();
	
	}
	
	public static void pattern4(int dim)
	{
		System.out.println("Hello!Printing pattern 4:");
		
		for(int i=1;i<=dim;i++)
		{
    		for(int j=i;j<dim;j++)
    		{
        			System.out.print(" ");
    		}
    		for(int j=1;j<=i;j++)
    		{
        			System.out.print("*");
    		}
    		System.out.println("");
		}	
	}


public static void pattern5(int dim)
{
	System.out.println("Hello!Printing pattern 5:");
	
	for(int i=dim;i>=1;i--)
	{
		for(int j=i;j<dim;j++)
		{
    			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
    			System.out.print("*");
		}
		System.out.println("");
	}	
}



public static void pattern6(int dim)
{
	System.out.println("Hello! Printing pattern 6: ");
	
	
	for(int i=1;i<=dim;i++)
	{
		for(int j=i;j<dim;j++)
		{
    			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
    			System.out.print(" *");
		}
		System.out.println("");
	}	
}
public static void pattern7(int dim)
{
	System.out.println("Hello! Printing pattern 7: ");
	

	for(int i=dim;i>=1;i--)
	{
		for(int j=i;j<dim;j++)
		{
    			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
    			System.out.print(" *");
		}
		System.out.println("");
	}	
}

public static void pattern8(int dim)
{
	System.out.println("Hello! Printing pattern 8: ");
	

	for(int i=1;i<=dim;i++)
	{
		for(int j=i;j<dim;j++)
		{
    			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
    			System.out.print(" *");
		}
		System.out.println("");
	}	
	for(int i=dim;i>=1;i--)
	{
		for(int j=i;j<dim;j++)
		{
    			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
    			System.out.print(" *");
		}
		System.out.println("");
	}	
}

public static void pattern9(int dim)
{
	System.out.println("Hello! Printing pattern 9: ");
	

	for(int i=1;i<=dim;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
		
	}
	for(int i=dim-1;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
		
	}
	
	
}

public static void pattern10(int dim)
{
	int i,j;

		System.out.println("Hello! Printing pattern10: ");


	for(i=1;i<=dim;i++)
		{
    		for(j=i;j<dim;j++)
    		{
        			System.out.print(" ");
    		}
    		for(j=1;j<=i;j++)
    		{
        			System.out.print("*");
    		}
    		System.out.println("");
		}	
	for(i=dim;i>=1;i--)
		{
    		for(j=i;j<=dim;j++)
    		{
        			System.out.print(" ");
    		}
    		for(j=1;j<i;j++)
    		{
        			System.out.print("*");
    		}
    		System.out.println("");
    		
		}
}

}
