package org.springframework.bo;

public class CircularReferenceA {

	private String name;
	private CircularReferenceB b;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CircularReferenceB getB() {
		return b;
	}

	public void setB(CircularReferenceB b) {
		this.b = b;
	}
}
