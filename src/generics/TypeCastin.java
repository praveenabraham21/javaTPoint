package generics;

import java.util.ArrayList;
import java.util.List;

public class TypeCastin {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(1);
		list.add("World");
		String s = (String) list.get(0);
		System.out.println(s);

	}

}
