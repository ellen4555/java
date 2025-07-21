package myproject;
class AreaCalculator{
	public void area(double radius) {
		double area =3.14*radius*radius;
		System.out.println("The area of circle is "+area);
	}
	public void area(double l,double b) {
		double area= l*b;
		System.out.println("The area of rectangle is "+area);
	}
	public void area(float b,float h) {
		float area=1/2f*b*h;
		System.out.println("The area of triangle is "+area);
		
	}
	public void area(int side) {
		int area=side*side;
		System.out.println("The area of square is "+area);
	}
}

public class Demo4 {
	public static void main(String[] args) {
		AreaCalculator areaCalculator=new AreaCalculator();
		areaCalculator.area(1.2);
		areaCalculator.area(1.2,2.3);
		areaCalculator.area(2.3f,3.1f);
		areaCalculator.area(5);
		
	}

}
