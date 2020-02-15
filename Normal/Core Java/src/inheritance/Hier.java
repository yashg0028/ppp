package inheritance;

public class Hier {
	void eat(){System.out.println("eating...");}  
		}  
		
class Bog extends Hier{  
		void bark(){System.out.println("barking...");}  
		} 
class Cat extends Hier{  
		void meow(){System.out.println("meowing...");}  

		public static void main(String args[]){  
		Cat c=new Cat();  
		c.meow();  
		c.eat();
		Bog d=new Bog();
		d.bark();
		d.eat();
		}

}
