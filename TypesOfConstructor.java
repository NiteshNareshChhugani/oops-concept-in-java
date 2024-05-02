package oops;

import javax.sql.rowset.serial.SQLOutputImpl;

public class TypesOfConstructor {
	String name;
	int age;
	public TypesOfConstructor() {
		System.out.println("Default Constructor");
	}
	public TypesOfConstructor(String nm){
		name=nm;
		System.out.println("Parameterised Constructor : "+ name);
	}
	public TypesOfConstructor(String nm,int age){
		name=nm;
		this.age=age;
		System.out.println("Parameterised Constructor : "+ name +":"+ age);
	}
	public TypesOfConstructor(TypesOfConstructor obj){
		name=obj.name;
		age=obj.age;
		System.out.println("Copy Constructor " + name +":"+this.age);
	}
	public static void main(String[] args) {
		TypesOfConstructor sc1=new TypesOfConstructor();
//		sc1.TypesOfConstructor();
		TypesOfConstructor sc2=new TypesOfConstructor("Nitesh");
//		sc2.TypesOfConstructor();
		TypesOfConstructor sc3=new TypesOfConstructor("Nitesh",24);
	}

}
