package oops;

class parent
{
	public void add()
	{
		int a=10,b=20;
		System.out.println("Parent class addition is :"+(a+b));
	}
}
class Child extends parent
{
	public void sub()
	{
		int a=20,b=10;
		System.out.println("Child class substraction is :"+(a-b));
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Child child=new Child();
		child.add();
		child.sub();

	}

}
