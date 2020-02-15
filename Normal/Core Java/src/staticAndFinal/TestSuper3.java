package staticAndFinal;

class Person		//Parent class
{  
int id;  
String name;            

Person(int i,String n){   //Parent class constructor with name and id 
id=i;  
name=n;  
}  
}  
class Emp extends Person{  //child class
float salary;  

Emp(int i,String n,float s){      //child class constructor same as parent constructor
super(i,n);//reusing parent constructor  
salary=s;  
}

void display(){
	System.out.println(id+" "+name+" "+salary);
	}  
}  
public class TestSuper3 {
public static void main(String[] args){  
Emp e1=new Emp(1,"ankit",45000f);  //writing values
e1.display();	//calling method  
}
}  



