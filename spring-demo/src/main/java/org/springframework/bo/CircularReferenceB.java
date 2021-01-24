package org.springframework.bo;

public class CircularReferenceB {

	private String name;
	private CircularReferenceA a;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CircularReferenceA getA() {
		return a;
	}

	public void setA(CircularReferenceA a) {
		this.a = a;
	}
}
