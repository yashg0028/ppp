package oops;

class Static{  
	   int rollno;//instance variable  
	   String name;  
	   static String college ="ITS";//static variable  
	   									//constructor  
	   Static(int r, String n)
	   {  
	   rollno = r;  
	   name = n;  
	   }  
	   										//method to display the values  
	   void display ()
	   {
		   System.out.println(rollno+" "+name+" "+college);
		}  
	 
						//Test class to show the values of objects  
	 public static void main(String args[]){  
		 Static s1 = new Static(111,"Karan");  
		 Static s2 = new Static(222,"Aryan");  
	 //we can change the college of all objects by the single line of code  
	 
	 s1.display();  
	 s2.display();  
	 }  
	}
