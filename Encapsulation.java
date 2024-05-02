package oops;

class Product {
	private int pId;
	private String pname;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Product(int pId, String pname) {
		this.pId = pId;
		this.pname = pname;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setpId(101);
		p.setPname("Laptop");
		System.out.println(p.getpId() + " : " + p.getPname());
		Product p1 = new Product(102, "Tablet");
		System.out.println(p1.getpId() + " : " + p1.getPname());
	}

}
