package oops;

public class Shape {
	// method name same but parameter type is different
//	 polymorphism: Compile Time Polymorphism: Method Overloading
void area(int side)
{
	System.out.println("Area of square: "+(side*side));
}
void area(float radius) {
	System.out.println("Area of circle: "+(3.14*radius*radius));
}
void area(int length,int breath) {
	System.out.println("Area of Rectangle: "+(length*breath));
}
void area(float base,int height) {
	System.out.println("Area of Triange: "+(0.5*base*height));
}
	public static void main(String[] args) {
		Shape sc=new Shape();
		sc.area(2);
		sc.area(2.2f);
		sc.area(3.3f,5);
		sc.area(2, 4);

	}

}
