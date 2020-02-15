package inheritance;

public class Single {

			void eat(){
				System.out.println("eating...");
				}  
}
			class Dog extends Single
			{  
			void bark(){
				System.out.println("barking...");
			}  
			
		public static void main(String[] args) {

			Dog t=new Dog();
			t.bark();
			t.eat();
		}
	}

