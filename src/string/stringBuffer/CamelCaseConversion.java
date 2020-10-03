package string.stringBuffer;

public class CamelCaseConversion {

	public static void main(String[] args) {

		String s = "Sachin tendulkar is a great man. he is the god of cricket";
		String a[] = s.split("\\s");

		String convertedCase = "";

		for (String t : a) {
			String first = t.substring(0, 1);
			String last = t.substring(1);
			convertedCase += first.toUpperCase() + last + " ";
		}

		System.out.println(convertedCase.trim());
	}

}