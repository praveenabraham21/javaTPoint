package string.stringBuffer;

public class Replace {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Sachin");
		s.replace(0, 6, "Tendulkar");
		System.out.println(s);
	}
}