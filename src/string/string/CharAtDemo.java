package string.string;

public class CharAtDemo {

	public static void main(String[] args) {
		String s = "Sachin";
		
		System.out.println(s.charAt(0));//first character
		//System.out.println(s.charAt(11));// out of bounds exception
		
		for(int i = 0 ; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

}
