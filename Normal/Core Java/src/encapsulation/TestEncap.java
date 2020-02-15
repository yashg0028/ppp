package encapsulation;

class EncapsDemo{				//declaring private access specifier to the given variables
	private int ssn;
	private String name;
	private int age;
	
		///Getter and Setter Methods
	public void setEmpssn(int s) {
		ssn=s;						//setting values with the help of constructors
	}
	public void setEmpname(String n) {
		name=n;
	}
	public void setEmpage(int a) {
		age=a;
	}

public int getEmpssn(){				//using get method to display values
	return ssn;
	}
public String getEmpname(){
	return name;
	}
public int getEmpage(){
	return age;
	}
}
public class TestEncap {
public static void main(String[] args) {
		EncapsDemo obj =new EncapsDemo();
		obj.setEmpssn(82);			//setting value in the name member  

		obj.setEmpname("Name");
		obj.setEmpage(96);
		
		System.out.println("Emp SSN : "+obj.getEmpssn());
		System.out.println("Emp NAME : "+obj.getEmpname());	//getting value of the name member  

		System.out.println("Emp AGE : "+obj.getEmpage());
	
	}
	

}
