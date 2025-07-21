package myproject;
class Calculator{
	public void add(int a,int b) {
		int add = a+b;
		System.out.println("The sum of two integers is "+add);
	}
	public void add(int a,int b,int c) {
		int add = a+b+c;
		System.out.println("The sum of three integers is "+add);
				
	}
	public void add(double a,double b) {
		double add = a+b;
		System.out.println("The sum of double values is "+add);
	}
    public void add (String a,int b) {
    	String add=a+b;
    	System.out.println("The sum is "+add);
    }

}

public class OverloadingDemo {
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		calculator.add(3,4);
		calculator.add(4,2,3);
		calculator.add(1.2,1.3);
		calculator.add("Hi ", 2);
		
	}

}
