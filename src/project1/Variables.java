package project1;

public class Variables {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 13;
		int c;
		
		c=a+b;
		
		System.out.println(c);
		
	c=a-b;
	
	System.out.println(c);
	
	c=a%b;
	
	System.out.println(c);
	
	//system.out.println(a>b); // true
	
	
	System.out.println(a>b);
	
	System.out.println("hello");
	
	//Logical operator
	System.out.println((a>b) && (a<b));
	System.out.println((a>b) && (b<=a));
	System.out.println((a>b) || (a<b));
	
	//ternary operator
	
	int result= (a<b)? (a+b): (a*b);
	System.out.println(result);
	
	
	
	
	
	
		// TODO Auto-generated method stub

	}

}
