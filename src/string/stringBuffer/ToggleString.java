package string.stringBuffer;

public class ToggleString {

	public static void main(String[] args) {

		System.out.println(toggleString("Sachin Tendulkar Is a Great Man!!!"));

	}

	public static String toggleString(String input) {

		String[] strArr = input.split("\\s");
		String toggle = "";

		for (String i : strArr) {
			String first = i.substring(0, 1);
			String last = i.substring(1);

			toggle += first.toLowerCase() + last.toUpperCase() + " ";
		}
		return toggle.trim();

	}

}
