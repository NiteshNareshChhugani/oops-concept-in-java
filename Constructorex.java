package oops;

public class Constructorex {
	String mname;
	int mprice;

	public Constructorex(String mname, int mprice) {
		this.mname = mname;
		this.mprice = mprice;

	}

	public Constructorex() {
		mname = "Oneplus";
		mprice = 30000;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getMprice() {
		return mprice;
	}

	public void setMprice(int mprice) {
		this.mprice = mprice;
	}

	public void display() {
		System.out.println(mname + " " + mprice);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorex obj = new Constructorex("Nokia",10000);
		obj.display();
		Constructorex obj1 = new Constructorex();
		obj1.display();
	}

}
