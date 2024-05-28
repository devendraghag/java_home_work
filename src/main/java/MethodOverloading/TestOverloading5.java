package MethodOverloading;

class Adder33 {
	static int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}
}

class TestOverloading5 {
	public static void main(String[] args) {
		System.out.println(Adder33.add(11, 11));
	}
}

//overloading depends on method name, no of variables and type of variables not with the access specifiers