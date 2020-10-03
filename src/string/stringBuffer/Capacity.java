package string.stringBuffer;

public class Capacity {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("");
		System.out.println(s.capacity());
		s.append("Sachin Tendulkar is a great man");
		System.out.println(s.length());
		System.out.println(s.capacity());
	}
}
