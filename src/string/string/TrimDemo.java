package string.string;

public class TrimDemo {

	public static void main(String[] args) {
		
		String s = "  Sachin  ";
		System.out.println(s.trim()); // all extra spaces before and after will be removed
		
		
		String b = "     This is a lengthy string. . . ";
		
		System.out.println(b.trim());

	}

}
