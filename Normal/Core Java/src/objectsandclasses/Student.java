package objectsandclasses;

public class Student {
	int id;     //instance variables
	String name;

	public static void main(String[] args) {    //main method

		Student s1=new Student(); //creating object
		s1.id=100; 				//writing values to variables
		s1.name="yash";			
		System.out.println(s1.id); //printing values with the help of object
		System.out.println(s1.name);

	}

}
