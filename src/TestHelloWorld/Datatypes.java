// 20/11/22
package TestHelloWorld;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b= 127; //1 byte, -128 to 127. If beyond 127 then store in int
		
		short s= 128; // bigger than byte, smaller than int
		
		int i= 10 ; // ALl whole numbers are integer
		
		long l = 324234343434l ; // add l at end of the number
		
		float f = 565656.54543f ; //f at the end
		
		char ch= 'A' ; //single character
		
		boolean bool = true ; //true or false
		
		int a = b; // implicit typecasting
		
		int fi = (int) f; // explicit typecasting
		
		//int bl = (int)bool ; // no typecasting for boolean
		
		int c = (int) ch;
		
		char d = (char) i ;
		
		
	System.out.println(b+"\n" + s +"\n" + i+"\n" +l+"\n"+f+"\n"+ch+"\n"+bool+"\n"+a+"\n");

	System.out.println(fi+"\n" + c +"\n" + d);
		
		
		
		
	

	}

}
