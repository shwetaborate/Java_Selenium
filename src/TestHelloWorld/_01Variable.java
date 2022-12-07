/*https://beginnersbook.com/2017/08/variables-in-java/*/

package TestHelloWorld;

public class _01Variable {
	
	String StName;  /* instance variable, belongs to objects
	                 , create different copies for diff instances*/
	
	static String SubjectName; /*Class variable, added static, belongs to class,
	                   will be same for all objects*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age= 10 ; /*Local variable*/
		String name = "Test" ;

		//int num;  /*declaration*/
		//num=12; /*initialization*/
		
		System.out.println(age);
		System.out.println(name);
		
		_01Variable obj1 = new _01Variable();
		_01Variable obj2 = new _01Variable();
		
	    obj1.StName ="Shweta";
	   // obj1.SubjectName= "Selenium";
	    
	    obj2.StName = "Shalmik";
	    //obj2.SubjectName= "Changed subject";
	    
	    System.out.println(obj1.StName);
	    //System.out.println(obj1.SubjectName); //subjectname is static, it will same for all the objects
	    System.out.println(obj2.StName);
	//    System.out.println(obj2.SubjectName);
		
	    System.out.println(obj1.StName);
	    System.out.println(SubjectName);
	    System.out.println(obj2.StName);
	    System.out.println(SubjectName);
		
	}

}
