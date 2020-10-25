package string.stringBuffer;

public class ReverseToggleString {

	public static void main(String[] args) {
		System.out.println(reverseToggleString("Sachin is the God of Cricket"));
	}

	public static String reverseToggleString(String input) {
		String[] strArr = input.split("\\s");
		String output = "";
		for (String s : strArr) {
			StringBuffer a = new StringBuffer(s);
			a.reverse();
			String first = a.substring(0, 1).toLowerCase();
			String last = a.substring(1).toUpperCase();
			output += first + last + " ";
		}
		return output.trim();
	}

}
