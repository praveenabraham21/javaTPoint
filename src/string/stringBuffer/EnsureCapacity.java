package string.stringBuffer;

public class EnsureCapacity {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("");
		System.out.println("Default String Buffer capacity is : " + s.capacity());
		s.append("Hello");
		System.out.println("String capacity will remain same as : " + s.capacity());
		s.append(", Java is my favorite language in all the programing languages.");
		System.out.println("String buffer capacity is extended to : " + s.capacity());
		s.ensureCapacity(200);
		System.out.println("Extended string buffer capacity now is : "+s.capacity());
	}

}
