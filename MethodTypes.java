package oops;
public class MethodTypes {
	int add(int a, int b) {
		return a + b;

	}

	void addition(int a, int b) {
		System.out.println("Additing 2 numbers: " + (a + b));
	}

	static String display() {
		return "Speak something in class";
	}

	float area(int r) {
		return (float) (3.14 * r * r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTypes obj = new MethodTypes();
		System.out.println("Addition of Two Nummber is "+obj.add(10, 10));
		System.out.println(obj.display());
		System.out.println(obj.area(4));
		obj.area(3);

	}

}