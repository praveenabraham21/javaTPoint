package string.stringBuffer;

public class Delete {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Sachin");
		s.delete(1, 3);
		System.out.println(s);
	}
}