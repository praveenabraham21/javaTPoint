package string.immutable;

public class TestImmutableString {

	public static void main(String[] args) {

		String a = "Sachin";
		a = a.concat(" Tendulkar");
		System.out.println(a);// will print Sachin Tendulkar because the reference variable is assigned

	}

}
