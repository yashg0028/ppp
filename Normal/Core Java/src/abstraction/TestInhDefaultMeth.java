package abstraction;

interface Drawable22
{  
void draw();  
default void msg()
{												//can declare method inside interface,which is known as default
	System.out.println("default method");
}
}  
class Rectangle1 implements Drawable22
{  
public void draw()
{
	System.out.println("drawing rectangle");
}  
}  

public class TestInhDefaultMeth 
{
public static void main(String args[])
{  
Drawable22 d=new Rectangle1();  
d.draw();  
d.msg();  
}
}  

