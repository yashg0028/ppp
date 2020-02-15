package staticAndFinal;

class Animal{    				//Parent class
	   String color ="white";
	 }
class Dog extends Animal{				//child class
	   String color ="black";
	 
	   void printColor() {
		   System.out.println(color);				
		   System.out.println(super.color);		//parent class instance variable calling using super 
		   	   }

}

public class TestSuper1 {

	public static void main(String[] args) {
   Dog d=new Dog();
   d.printColor();
	}

}
