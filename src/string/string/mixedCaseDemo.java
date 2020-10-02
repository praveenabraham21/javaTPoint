package string.string;

public class mixedCaseDemo {
	public static void main(String[] args) {
		String s = "Sachin tendulkar is a great man";
		System.out.println(convertMixedCase(s));
	}

	@SuppressWarnings("deprecation")
	public static String convertMixedCase(String input) {
		if (input.isEmpty() || input == null) {
			return input;
		}
		StringBuilder convertedString = new StringBuilder();
		boolean spaceFound = true;

		for (char a : input.toCharArray()) {
			if (Character.isSpace(a)) {
				spaceFound = true;
			} else if (spaceFound) {
				a = Character.toTitleCase(a);
				spaceFound = false;
			} else {
				a = Character.toLowerCase(a);
			}
			convertedString.append(a);
		}
		return convertedString.toString();

	}
}
