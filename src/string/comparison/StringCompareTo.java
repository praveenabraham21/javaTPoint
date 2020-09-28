package string.comparison;

public class StringCompareTo {

	public static void main(String[] args) {
		
		String s1 = "Sachin";
		String s2 = "Sachin";
		
		String s3 = "Sachi";
		String s4 = "Sachinn";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));

	}

}
