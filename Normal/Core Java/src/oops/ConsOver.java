package oops;

public class ConsOver {
	int id;					//variables Declaration
	String name;
	Float marks;

public ConsOver(int i,String n,Float m) {
    id=i;
    name=n;
    marks=m;
 }
public ConsOver(int i,String n)
{
	id=i;
	name=n;
}
void display() {
	System.out.println(id+" "+name+" "+marks) ;
}
	public static void main(String[] args) {
		ConsOver s1=new ConsOver(20,"yash",23500f);
		ConsOver s2=new ConsOver(30,"Raj");
s1.display();
s2.display();


	}

}
