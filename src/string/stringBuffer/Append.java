package string.stringBuffer;

public class Append {

	public static void main(String[] args) {

		// String Buffer creates mutable string.
		StringBuffer s = new StringBuffer("Sachin");
		s.append(" Tendulkar");
		System.out.println(s);

		// String literal creates immutable string.
		String a = "Sachin";
		a.concat("Tendulkar");
		System.out.println(a);
	}

}