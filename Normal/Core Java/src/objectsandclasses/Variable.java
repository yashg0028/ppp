package objectsandclasses;

public class Variable {

	int id;     //instance variables
	String name;

	public static void main(String[] args) {
		
		Student s1=new Student(); //creating object
		s1.id=100; 				//writing values to variables
		s1.name="yash";			
		System.out.println(s1.id+" "+s1.name); //printing values with the help of object
		

	}

}
