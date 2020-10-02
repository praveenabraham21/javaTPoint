package string.comparison;

public class StringCompareBy {

	public static void main(String[] args) {

		String s1 = "Sachin";
		String s2 = "Sachin";

		String s3 = new String("Sachin");

		System.out.println(s1 == s2); // both string refers same instance in string pool
		System.out.println(s1 == s3); // s3 refers to the instance in the heap.

	}

}
