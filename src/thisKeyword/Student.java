package thisKeyword;

public class Student {

	int rollNo;
	String name;
	float fee;

	Student(int rollNo, String name, float fee) {
		
		//without this keyword
//		rollNo = rollNo;
//		name = name;
//		fee = fee;
		
		//with this keyword
		this.rollNo = rollNo;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println("rollno : " + rollNo + "name : " + name + " Fee : " + fee);
	}

	public static void main(String[] args) {

		Student s1 = new Student(116, "Praveen Abraham", 100000);
		Student s2 = new Student(115, "Naveen Kumar", 150000);

		s1.display();
		s2.display();

	}
	
	/*
	 * Without this key word: 
	 * 
	 * Parameters and Instance variable names are the same. 
	 * So, this keyword is used to distinguish local variable and instance variable. 
	 * 
	 * O/P: 
	 * 
	 * 0 null 0.0
	 * 0 null 0.0
	 * 
	 * */

	/*
	 * With this key word
	 * 
	 * if local variables or the parameters are different from instance variables then this key word is not required.
	 * 
	 * It is better approach to use meaningful names for variables. 
	 * 
	 * So same name for instance variables and parameters are used in real time
	 * 
	 * with the help of this keyword, the instance variables are accessed.
	 * 
	 * O/P: 
	 * 
	 * rollno : 116name : Praveen Abraham Fee : 100000.0 
	 * rollno : 115name : Naveen Kumar Fee : 150000.0
	 * 
	 * */
	
}
