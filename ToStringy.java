
public class ToStringy {

	public static void main(String[] args) {
		Student s = new Student(11, "ram");
	    System.out.println(s);
/*		System.out.println(s.toString());     By default the object calls tostring method 
	                                          which is belong to the object class                 */
	    }

}

class Student {                              // by default the class inherits the object class

	int rollno;
	String name;

	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}

}
