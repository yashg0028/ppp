package abstraction;

interface Drawable5
{  
void draw();  

static int cube(int x)			//Static method inside interface
{
	return (x*x*x);
}  
}  
class Rectangle5 implements Drawable5{  
public void draw()
{
	System.out.println("drawing rectangle");
}  
}  
public class TestInhStatic 
{
public static void main(String args[]){  
Drawable5 d=new Rectangle5();  			//printing interface abstract method
d.draw();  
System.out.println(Drawable5.cube(3)); //printing values from static method

}
}  

