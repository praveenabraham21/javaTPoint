package overriding;

public class Dog extends Animal {

	static void eat() {
		System.out.println("Chewing...");
	}

	public static void main(String[] args) {

		eat();

	}

}
