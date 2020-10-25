package string.performance;

public class PerformanceTest {

	public static void main(String[] args) {

		long time = System.currentTimeMillis();

		concatStrings();

		System.out.println("Elapsed time for string class concatenation" + (System.currentTimeMillis() - time) + " ms");

		time = System.currentTimeMillis();

		bufferAppend();

		System.out.println("Elapsed time for string buffer append" + (System.currentTimeMillis() - time) + " ms");

	}

	public static String concatStrings() {
		String s = "Sachin";
		for (int i = 0; i < 10000; i++) {
			s = s + "Tendulkar";
		}
		return s;
	}

	public static String bufferAppend() {
		StringBuffer s = new StringBuffer("Sachin");

		for (int i = 0; i < 10000; i++) {
			s.append("Tendulkar");
		}
		return s.toString();
	}

}
