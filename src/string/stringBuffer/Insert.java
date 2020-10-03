package string.stringBuffer;

public class Insert {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("Sachin");
		s.insert(6, " Tendulkar");
		System.out.println(s);

		StringBuffer a = new StringBuffer("Sachin");
		a.insert(0, "Tendulkar, ");
		System.out.println(a);

	}

}
