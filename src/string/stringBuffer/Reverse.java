package string.stringBuffer;

public class Reverse {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Sachin");
		System.out.println(s.reverse());
		
		StringBuffer a = new StringBuffer("able I was ere saw I elba");
		a.reverse();
		System.out.println(a);
	}
}