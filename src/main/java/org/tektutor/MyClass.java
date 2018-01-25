package org.tektutor;

public class MyClass {

	public boolean F1() {

		int X = getX();
		++X;
		X = getX() + 2;

		return true;
	}

	protected int getX() {
		return 10;
	}

}
