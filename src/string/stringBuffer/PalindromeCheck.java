package string.stringBuffer;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  s = "nitin";
		
		StringBuffer r = new StringBuffer(s);
		r.reverse();
		
		if(s.equals(r.toString())) {
			System.out.println("Input is a palindrome "+s);
		}
		else {
			System.out.println("Input is not a palindropme "+s);
		}
		

	}

}
