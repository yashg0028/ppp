package objectsandclasses;

public class Variable2 {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();//creating object
		s1.id=100; 				//writing values to variables
		s1.name="yash";		
		s2.id=200; 				//writing values to variables
		s2.name="sh";			
		System.out.println(s1.id+" "+s1.name); //printing values with the help of object
		
		System.out.println(s2.id+" "+s2.name); //printing values with the help of object
		
	}

}
