package oops;
public class Constructor {
							// declaring Variable
	int age;
	String name;
	char sex;
							//creating constructor
	public Constructor(int a,String top,char t) {
		
		age=a;
		name=top;
		sex=t;
	
		}
									//method to display the values
	void display() {
		System.out.println(age+" "+name+ " "+sex);
	}
	
    public static void main(String args[]){  
		Constructor s1=new Constructor(25,"sri",'m');
		Constructor s2=new Constructor(29,"sree",'f');
		s1.display();
		s2.display();
	}
	}
	

