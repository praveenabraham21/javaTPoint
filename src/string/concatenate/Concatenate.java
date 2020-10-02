package string.concatenate;

public class Concatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Sachin";
		String l = "Tendulkar";

		String j = s + l;
		System.out.println(j);
		
		String s1=(new StringBuilder()).append("Sachin").append(" Tendulkar").toString();  
		System.out.println(s1);
	}

}
