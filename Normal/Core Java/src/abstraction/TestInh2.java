package abstraction;

//Interface declaration: by first user  
interface Drawable{
										//one method in interface class
void draw();  

}  
//Implementation: by second user  
class Rectangle implements Drawable			//Here one class one method
{  
public void draw()
{
	System.out.println("drawing rectangle");
}  
}

class Circle implements Drawable{  			//Here one class one method
public void draw()
{
	System.out.println("drawing circle");
}  
}  
//Using interface: by third user  
public class TestInh2 {

	public static void main(String args[]){  
		Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
		d.draw();  
		Drawable e=new Rectangle ();//In real scenario, object is provided by method e.g. getDrawable()  
		e.draw();
		}}  