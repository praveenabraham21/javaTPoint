package overloading;

public class OverloadingDemo {
	
	/*
	 * Method overloading improves the readability of the program.
	 * It is performed in the same class.
	 * method signature should be unique for each method overloaded.
	 * Method overloading is known as compile time polymorphism.
	 * Return type is not considered for method overloading. 
	 * */

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	static double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {

		System.out.println(add(1, 2));
		System.out.println(add(1, 2, 3));
		System.out.println(add(2.0,3.3));
	}

}
