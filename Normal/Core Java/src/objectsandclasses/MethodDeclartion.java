package objectsandclasses;

public class MethodDeclartion {  
		 int rollno;  
		 String name;  
		
		 void insert(int r, String n){  
		  rollno=r;  
		  name=n;  
		  
		 }  
		 void display()
		 {
			 System.out.println(rollno+" "+name);
		 }  

		 public static void main(String args[]){  
			 MethodDeclartion s1=new MethodDeclartion();  
			 MethodDeclartion s2=new MethodDeclartion();  
		  s1.insert(111,"Karan");  //writing values to method
		  s2.insert(222,"Aryan");  
		  s1.display();  
		  s2.display();  //printing values with  the help of method//
		 }  
		}  

