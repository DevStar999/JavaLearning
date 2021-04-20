package com.company.polymorphism;

interface in1{ }
interface in2{ }

class A implements in1, in2{
	
}

public class Working_Class_pm2 {

	public static void main(String[] args) {
		AnimalList obj = new AnimalList() ;
		
		Eagle e = new Eagle() ;
		Goldfish gf = new Goldfish() ;
		Kangaroo k = new Kangaroo() ;
		
		obj.add(e) ; obj.add(gf) ; obj.add(k) ;
	}

}
