package staticAndFinal;

class Ani{  			//Parent class and method 
void eat(){System.out.println("eating...");}  
}  

class Do extends Ani			//child class
{  
void eat()							//child class method same as parent method
{
	System.out.println("eating bread...");
}  
void bark()
{
	System.out.println("barking...");
} 

void display()
{  							//calling parent method using super keyword,which is overridden
super.eat();  
bark();
eat();
}  
}  
public class TestSuper2 {
public static void main(String args[]){  
Do d=new Do();  
d.display();  
}}  

