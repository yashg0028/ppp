package objectsandclasses;

public class Add {
		
			 int a;  
			 int b;   
			 
	void insert(int r, int n){  
			  a=r;  
			  b=n;  
			  
			 }  
	void display()
			 {
				 System.out.println(a+b);
			 }  

	public static void main(String args[]){  
				 Add s1=new Add();  
				 Add s2=new Add();  
			  s1.insert(111,20);//writing values to method
			  s2.insert(222,30);  
			  s1.display();  
			  s2.display();  //printing values with  the help of method//
			 }  
			}  



