//20/11/22
package TestHelloWorld;

public class Operator {

	public static void main(String[] args) {
		// main		
		assignOp(); //  calling function from main
        arithmeticOp(); 
        comparisonOp();
        logicOp();
        ternaryOp();
        findmaxofthree();
	}
	
	public static void assignOp() {
		// = assignment Operator	
		int a = 10; // code run from main function only	
		System.out.println(a);
	}
	
	public static void arithmeticOp() {
		// +, -, *, /, % modulo
		 int a =10;
		 int b= 3;		 
		 System.out.println(a+b); //13
		 System.out.println(a-b); //7
		 System.out.println(a*b); //30
		 System.out.println(a/b); //3
		 System.out.println(a%b); //1		
	}
	public static void comparisonOp() {
		// >, <, ==, !=, >=, <=
		 int a =10;
		 int b= 3;		 
		 System.out.println(a>b); //true
		 System.out.println(a<b); //false
		 System.out.println(a==b); // is lhs = rhs false
		 System.out.println(a!=b); //3 true
		 System.out.println(a>=b); //1 true
		 System.out.println(a<=b); //1 false
		// System.out.println(a===b);

	}
	//logical operator. compare two different conditions
	public static void logicOp() {
		
	//logical AND &&  logical OR ||
		int a= 10;
		int b=3;
		System.out.println((a>b) && (a<b)); //false
		System.out.println((a>b) && (b<=a)); //true
		System.out.println((a>b) || (a<b));	 //true
		
	}
	
	public static void ternaryOp() {
	// (condition)	? expression1 : expersion2
		// if condition is true then expression1 is executed else expression2 is executed
		//dont use this for multi line conditions or expression
		int a=10;
		int b=3;
		int result = (a<b) ? (a+b) : (a*b);
		System.out.println(result);
		
	}
	
	public static void findmaxofthree() {
		int a= 24, b=35, c=25;
		 int max;
		if ((a>b) && (a>c)) {
			max=a;
			System.out.println(max);
			
		}else if ((b>a) && (b>c)) {
			max=b;
			System.out.println(max);
		} else {
			max=c;
			System.out.println(max);
		}
		
		//wriitng the avove expression in a single line using ternary operator
		int max1=	(a>b)? ((a>c)? a:c): ((b>c)?b:c);
		System.out.println(max1);
		
	}

}
