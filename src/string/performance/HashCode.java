package string.performance;

public class HashCode {

	public static void main(String[] args) {
		stringHashCode();
		stringBufferHashCode();
	}

	public static void stringHashCode() {
		String s = "Sachin";
		System.out.println(s.hashCode());
		s = s + "Tendulkar";
		System.out.println(s.hashCode());
	}

	public static void stringBufferHashCode() {
		StringBuffer s = new StringBuffer("Sachin");
		System.out.println(s.hashCode());
		s.append("Tendulkar");
		System.out.println(s.hashCode());
	}
}
