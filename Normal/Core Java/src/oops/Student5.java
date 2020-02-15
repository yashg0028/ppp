package oops;
class Student5{  
    int id;  
    String name; 					 //creating a parameterized constructor  
    Student5(int i,String n){  
    id = i;  
    name = n;  
    }  
    								//method to display the values  
    void display(){
    	System.out.println(id+" "+name);
    	}  
   
    public static void main(String args[]){  
    										//creating objects and passing values  
   Student5 s1 = new Student5(111,"Karan");  
   Student5 s2 = new Student5(222,"Aryan");  
    										//calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
}  